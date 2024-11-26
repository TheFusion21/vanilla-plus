package com.kayhennig.vanplusplus.item;

import java.util.List;

import com.kayhennig.vanplusplus.component.ModDataComponentTypes;
import com.kayhennig.vanplusplus.entity.thrown.DynamiteEntity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class DynamiteItem extends Item implements ProjectileItem {
    public static final byte[] FUSE_TIMES = new byte[]{1, 2, 4};
    public DynamiteItem(Item.Settings settings) {
        super(settings);
    }

    @Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SPLASH_POTION_THROW, SoundCategory.PLAYERS, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient) {
			DynamiteEntity dynamiteEntity = new DynamiteEntity(world, user);
			dynamiteEntity.setItem(itemStack);
			dynamiteEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.5f, 1.0f);
			world.spawnEntity(dynamiteEntity);
		}

		user.incrementStat(Stats.USED.getOrCreateStat(this));
		itemStack.decrementUnlessCreative(1, user);
		return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        DynamiteEntity dynamiteEntity = new DynamiteEntity(world, pos.getX(), pos.getY(), pos.getZ());
		dynamiteEntity.setItem(stack);
		return dynamiteEntity;
    }

    @Override
	public ProjectileItem.Settings getProjectileSettings() {
		return ProjectileItem.Settings.builder()
			.uncertainty(ProjectileItem.Settings.DEFAULT.uncertainty() * 0.5f)
			.power(ProjectileItem.Settings.DEFAULT.power() * 1.5f)
			.build();
	}

    @Override
	public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (stack.contains(ModDataComponentTypes.FUSE_TIME)) {
            byte fuseTime = stack.get(ModDataComponentTypes.FUSE_TIME);
            tooltip.add(Text.translatable("item.vanilla-plus-plus.fuse_time", fuseTime).formatted(Formatting.GRAY));   
        }
        
    }
}
