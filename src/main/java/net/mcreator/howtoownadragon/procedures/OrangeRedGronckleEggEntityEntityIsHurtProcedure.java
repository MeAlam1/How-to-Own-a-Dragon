package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModItems;

public class OrangeRedGronckleEggEntityEntityIsHurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(HowToOwnADragonModItems.ORANGE_RED_GRONCKLE_EGG_ITEM.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
