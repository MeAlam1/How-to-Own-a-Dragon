
package net.mcreator.howtoownadragon.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.howtoownadragon.procedures.ReadyToHatchPinkGronckleEggItemRightclickedOnBlockProcedure;

public class ReadyToHatchPinkGronckleEggItemItem extends Item {
	public ReadyToHatchPinkGronckleEggItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ReadyToHatchPinkGronckleEggItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
