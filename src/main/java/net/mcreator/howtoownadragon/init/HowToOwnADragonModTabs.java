
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "items"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.items")).icon(() -> new ItemStack(HowToOwnADragonModItems.NIGHT_FURY_SCALES.get())).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModBlocks.PORTAL_BLOCK.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("how_to_own_a_dragon", "dragons"),
				builder -> builder.title(Component.translatable("item_group.how_to_own_a_dragon.dragons")).icon(() -> new ItemStack(Items.ENDERMAN_SPAWN_EGG)).displayItems((parameters, tabData) -> {
					tabData.accept(HowToOwnADragonModItems.NIGHT_FURY_SPAWN_EGG.get());
				})

		);
	}
}
