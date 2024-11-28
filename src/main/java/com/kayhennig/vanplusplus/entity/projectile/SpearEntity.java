package com.kayhennig.vanplusplus.entity.projectile;

import org.jetbrains.annotations.Nullable;

import com.kayhennig.vanplusplus.ModItems;
import com.kayhennig.vanplusplus.entity.ModDamageTypes;
import com.kayhennig.vanplusplus.entity.ModEntityType;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SpearEntity extends PersistentProjectileEntity {
	private static final TrackedData<ItemStack> ITEM = DataTracker.registerData(SpearEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);

    private boolean dealtDamage;
	public int returnTimer;

    public SpearEntity(EntityType<? extends SpearEntity> entityType, World world) {
		super(entityType, world);
	}

    public SpearEntity(World world, LivingEntity owner, ItemStack stack) {
		super(ModEntityType.SPEAR, owner, world, stack, null);
        this.dataTracker.set(ITEM, stack);

	}

	public SpearEntity(World world, double x, double y, double z, ItemStack stack) {
		super(ModEntityType.SPEAR, x, y, z, world, stack, stack);
        this.dataTracker.set(ITEM, stack);
	}

    @Override
	protected void initDataTracker(DataTracker.Builder builder) {
		super.initDataTracker(builder);
        builder.add(ITEM, new ItemStack(ModItems.WOODEN_SPEAR));
	}

    @Override
	public void tick() {
        if (this.inGroundTime > 4) {
			this.dealtDamage = true;
		}
        super.tick();
    }

    @Nullable
	@Override
	protected EntityHitResult getEntityCollision(Vec3d currentPosition, Vec3d nextPosition) {
		return this.dealtDamage ? null : super.getEntityCollision(currentPosition, nextPosition);
	}

    @Override
	protected void onEntityHit(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        float f = 8.0F;
        Entity entity2 = this.getOwner();
        //DamageSource damageSource = this.getDamageSources().trident(this, (Entity)(entity2 == null ? this : entity2));
		DamageSource damageSource = new DamageSource(this.getWorld().getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(ModDamageTypes.SPEAR), this, (Entity)(entity2 == null ? this : entity2));
        if (this.getWorld() instanceof ServerWorld serverWorld) {
			f = EnchantmentHelper.getDamage(serverWorld, this.getWeaponStack(), entity, damageSource, f);
		}

        this.dealtDamage = true;
		if (entity.damage(damageSource, f)) {
			if (entity.getType() == EntityType.ENDERMAN) {
				return;
			}

			if (this.getWorld() instanceof ServerWorld serverWorld) {
				EnchantmentHelper.onTargetDamaged(serverWorld, entity, damageSource, this.getWeaponStack());
			}

			if (entity instanceof LivingEntity livingEntity) {
				this.knockback(livingEntity, damageSource);
				this.onHit(livingEntity);
			}
		}

        this.setVelocity(this.getVelocity().multiply(-0.01, -0.1, -0.01));
		this.playSound(SoundEvents.ITEM_TRIDENT_HIT, 1.0F, 1.0F);
    }

    @Override
	protected void onBlockHitEnchantmentEffects(ServerWorld world, BlockHitResult blockHitResult, ItemStack weaponStack) {
		Vec3d vec3d = blockHitResult.getBlockPos().clampToWithin(blockHitResult.getPos());
		EnchantmentHelper.onHitBlock(
			world,
			weaponStack,
			this.getOwner() instanceof LivingEntity livingEntity ? livingEntity : null,
			this,
			null,
			vec3d,
			world.getBlockState(blockHitResult.getBlockPos()),
			item -> this.kill()
		);
	}

	@Override
	protected boolean tryPickup(PlayerEntity player) {
		return super.tryPickup(player) || this.isNoClip() && this.isOwner(player) && player.getInventory().insertStack(this.asItemStack());
	}

    @Override
    public void setStack(ItemStack stack) {
        super.setStack(stack);
		this.getDataTracker().set(ITEM, stack.copyWithCount(1));
	}

	public ItemStack getStack() {
		return this.getDataTracker().get(ITEM);
	}

	@Override
	protected ItemStack getDefaultItemStack() {
		return new ItemStack(ModItems.WOODEN_SPEAR);
	}

    @Override
	protected SoundEvent getHitSound() {
		return SoundEvents.ITEM_TRIDENT_HIT_GROUND;
	}

	@Override
	public void onPlayerCollision(PlayerEntity player) {
		if (this.isOwner(player) || this.getOwner() == null) {
			super.onPlayerCollision(player);
		}
	}

    @Override
	public void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);
		this.dealtDamage = nbt.getBoolean("DealtDamage");
	}

	@Override
	public void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
		nbt.putBoolean("DealtDamage", this.dealtDamage);
	}

    @Override
	protected float getDragInWater() {
		return 0.96F;
	}

    @Override
	public boolean shouldRender(double cameraX, double cameraY, double cameraZ) {
		return true;
	}
    
}
