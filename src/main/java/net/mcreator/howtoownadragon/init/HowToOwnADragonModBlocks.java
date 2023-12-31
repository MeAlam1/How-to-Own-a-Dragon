
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.howtoownadragon.block.SlowingBlockBlock;
import net.mcreator.howtoownadragon.block.RustyDragonProofMetalBarsBlock;
import net.mcreator.howtoownadragon.block.ReaperSpikeTrapBlock;
import net.mcreator.howtoownadragon.block.ReaperSpawnBlockBlock;
import net.mcreator.howtoownadragon.block.ReaperPortalBlock;
import net.mcreator.howtoownadragon.block.ReaperBearTrapBlock;
import net.mcreator.howtoownadragon.block.ReaperArrowTrapBlock;
import net.mcreator.howtoownadragon.block.PortalBlockBlock;
import net.mcreator.howtoownadragon.block.PlainsGrassBlockBlock;
import net.mcreator.howtoownadragon.block.LimestoneBlock;
import net.mcreator.howtoownadragon.block.Incubator1Block;
import net.mcreator.howtoownadragon.block.DragonProofMetalBarsBlock;
import net.mcreator.howtoownadragon.block.DeepIronWallBlock;
import net.mcreator.howtoownadragon.block.DeepIronStairsBlock;
import net.mcreator.howtoownadragon.block.DeepIronSlabBlock;
import net.mcreator.howtoownadragon.block.DeepIronRodBlock;
import net.mcreator.howtoownadragon.block.DeepIronDoorBlock;
import net.mcreator.howtoownadragon.block.DeepIronBlockBlock;
import net.mcreator.howtoownadragon.block.DarkStoneBlock;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class HowToOwnADragonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HowToOwnADragonMod.MODID);
	public static final RegistryObject<Block> PORTAL_BLOCK = REGISTRY.register("portal_block", () -> new PortalBlockBlock());
	public static final RegistryObject<Block> DARK_STONE = REGISTRY.register("dark_stone", () -> new DarkStoneBlock());
	public static final RegistryObject<Block> DEEP_IRON_BLOCK = REGISTRY.register("deep_iron_block", () -> new DeepIronBlockBlock());
	public static final RegistryObject<Block> DEEP_IRON_ROD = REGISTRY.register("deep_iron_rod", () -> new DeepIronRodBlock());
	public static final RegistryObject<Block> DEEP_IRON_STAIRS = REGISTRY.register("deep_iron_stairs", () -> new DeepIronStairsBlock());
	public static final RegistryObject<Block> DEEP_IRON_SLAB = REGISTRY.register("deep_iron_slab", () -> new DeepIronSlabBlock());
	public static final RegistryObject<Block> DEEP_IRON_DOOR = REGISTRY.register("deep_iron_door", () -> new DeepIronDoorBlock());
	public static final RegistryObject<Block> DEEP_IRON_WALL = REGISTRY.register("deep_iron_wall", () -> new DeepIronWallBlock());
	public static final RegistryObject<Block> REAPER_PORTAL = REGISTRY.register("reaper_portal", () -> new ReaperPortalBlock());
	public static final RegistryObject<Block> REAPER_BEAR_TRAP = REGISTRY.register("reaper_bear_trap", () -> new ReaperBearTrapBlock());
	public static final RegistryObject<Block> REAPER_ARROW_TRAP = REGISTRY.register("reaper_arrow_trap", () -> new ReaperArrowTrapBlock());
	public static final RegistryObject<Block> SLOWING_BLOCK = REGISTRY.register("slowing_block", () -> new SlowingBlockBlock());
	public static final RegistryObject<Block> DRAGON_PROOF_METAL_BARS = REGISTRY.register("dragon_proof_metal_bars", () -> new DragonProofMetalBarsBlock());
	public static final RegistryObject<Block> REAPER_SPIKE_TRAP = REGISTRY.register("reaper_spike_trap", () -> new ReaperSpikeTrapBlock());
	public static final RegistryObject<Block> RUSTY_DRAGON_PROOF_METAL_BARS = REGISTRY.register("rusty_dragon_proof_metal_bars", () -> new RustyDragonProofMetalBarsBlock());
	public static final RegistryObject<Block> REAPER_SPAWN_BLOCK = REGISTRY.register("reaper_spawn_block", () -> new ReaperSpawnBlockBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> PLAINS_GRASS_BLOCK = REGISTRY.register("plains_grass_block", () -> new PlainsGrassBlockBlock());
	public static final RegistryObject<Block> INCUBATOR_1 = REGISTRY.register("incubator_1", () -> new Incubator1Block());
}
