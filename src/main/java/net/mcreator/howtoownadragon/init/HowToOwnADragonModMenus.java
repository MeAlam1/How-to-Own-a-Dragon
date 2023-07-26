
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.howtoownadragon.world.inventory.MaleGronckleGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.IncubatorGUIMenu;
import net.mcreator.howtoownadragon.world.inventory.GronckleInventoryMenu;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MenuType<IncubatorGUIMenu>> INCUBATOR_GUI = REGISTRY.register("incubator_gui", () -> IForgeMenuType.create(IncubatorGUIMenu::new));
	public static final RegistryObject<MenuType<MaleGronckleGUIMenu>> MALE_GRONCKLE_GUI = REGISTRY.register("male_gronckle_gui", () -> IForgeMenuType.create(MaleGronckleGUIMenu::new));
	public static final RegistryObject<MenuType<GronckleInventoryMenu>> GRONCKLE_INVENTORY = REGISTRY.register("gronckle_inventory", () -> IForgeMenuType.create(GronckleInventoryMenu::new));
}
