
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.howtoownadragon.potion.HitByArrowMobEffect;
import net.mcreator.howtoownadragon.potion.BreedingCooldownMobEffect;
import net.mcreator.howtoownadragon.potion.AttackCooldownMobEffect;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<MobEffect> HIT_BY_ARROW = REGISTRY.register("hit_by_arrow", () -> new HitByArrowMobEffect());
	public static final RegistryObject<MobEffect> ATTACK_COOLDOWN = REGISTRY.register("attack_cooldown", () -> new AttackCooldownMobEffect());
	public static final RegistryObject<MobEffect> BREEDING_COOLDOWN = REGISTRY.register("breeding_cooldown", () -> new BreedingCooldownMobEffect());
}
