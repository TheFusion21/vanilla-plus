package com.kayhennig.vanplusplus.thrown;

import com.kayhennig.vanplusplus.ModItems;
import com.kayhennig.vanplusplus.component.ModDataComponentTypes;
import com.kayhennig.vanplusplus.entity.ModEntityType;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class DynamiteEntity extends ThrownItemEntity {
    private byte life;

    public DynamiteEntity(EntityType<? extends DynamiteEntity> entityType, World world) {
		super(entityType, world);
        this.life = 0;
	}

    public DynamiteEntity(World world, LivingEntity owner) {
		super(ModEntityType.DYNAMITE, owner, world);
        this.life = 0;
	}

	public DynamiteEntity(World world, double x, double y, double z) {
		super(ModEntityType.DYNAMITE, x, y, z, world);
        this.life = 0;
	}
    

    @Override
    protected Item getDefaultItem() {
        return ModItems.DYNAMITE;
    }

    @Override
	protected double getGravity() {
		return 0.1f;
	}

    @Override
	protected void onBlockHit(BlockHitResult blockHitResult) {
		super.onBlockHit(blockHitResult);
    }

    @Override
	protected void onCollision(HitResult hitResult) {
		HitResult.Type type = hitResult.getType();
        if (type == HitResult.Type.ENTITY) {
            this.explode();
        } else if (type == HitResult.Type.BLOCK) {
            BlockHitResult blockHitResult = (BlockHitResult)hitResult;
            Direction side = blockHitResult.getSide();
            switch (side) {
                case UP:
                case DOWN:
                    setVelocity(getVelocity().multiply(0.3f, -0.3f, 0.3f));
                    break;
                case NORTH:
                case SOUTH:
                    setVelocity(getVelocity().multiply(0.3f, 0.3f, -0.3f));
                    break;
                case EAST:
                case WEST:
                    setVelocity(getVelocity().multiply(-0.3f, 0.3f, 0.3f));
                    break;
                default:
                    break;
            }
            if (getVelocity().length() < 0.1) {
                setVelocity(0, 0, 0);
            }
        }
    }

    @Override
    protected void onBlockCollision(BlockState state) {
        super.onBlockCollision(state);
    }

    @Override
	protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
    }

    @Override
    protected void updateRotation() {
        Vec3d vec3d = this.getVelocity();
        if (vec3d.length() < 1.0E-7) {
            return;
        }
		double d = vec3d.horizontalLength();
		this.setPitch(updateRotation(this.prevPitch, (float)(MathHelper.atan2(vec3d.y, d) * 180.0F / (float)Math.PI)));
		this.setYaw(updateRotation(this.prevYaw, (float)(MathHelper.atan2(vec3d.x, vec3d.z) * 180.0F / (float)Math.PI)));
    }

    @SuppressWarnings("resource")
    @Override
    public void tick() {
        super.tick();
        int fuseTime = this.getStack().get(ModDataComponentTypes.FUSE_TIME);
        fuseTime *= 20;
        if (this.life >= fuseTime) {
            this.explode();
        }

        if (this.getWorld().isClient && this.life % 4 == 0) {
            this.getWorld().addParticle(
                ParticleTypes.LAVA,
                this.getX(),
                this.getY() + 0.75f,
                this.getZ(),
                this.random.nextGaussian() * 0.1,
                this.random.nextGaussian() * 0.1,
                this.random.nextGaussian() * 0.1
            );
        }


        this.life++;
    }

    @SuppressWarnings("resource")
    private void explode() {
        if (!this.getWorld().isClient) {
            this.getWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 2.0f, World.ExplosionSourceType.TNT);
            this.kill();
        }
    }
}
