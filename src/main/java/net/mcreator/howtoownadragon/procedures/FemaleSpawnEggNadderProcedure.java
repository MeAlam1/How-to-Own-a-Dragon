package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderEggEntityEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.Comparator;

public class FemaleSpawnEggNadderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("how_to_own_a_dragon:breed_first_dragon"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		if (!(sourceentity.getPersistentData().getBoolean("isnadderbreed") == true)) {
			sourceentity.getPersistentData().putBoolean("isnadderbreed", true);
			BreedingAllDragonsProcedure.execute(sourceentity);
		}
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/execute at @e[type=how_to_own_a_dragon:nadder_female, sort= nearest, limit= 1] run summon how_to_own_a_dragon:nadder_egg_entity ~ ~ ~");
			GiveBreedingCooldownNadderProcedure.execute(world, x, y, z);
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(NadderEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(NadderEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor", (entity.getPersistentData().getString("naddercolor")));
				}
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/execute at @e[type=how_to_own_a_dragon:nadder_female, sort= nearest, limit= 1] run summon how_to_own_a_dragon:nadder_egg_entity ~ ~ ~");
			GiveBreedingCooldownNadderProcedure.execute(world, x, y, z);
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(NadderEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()
						&& !world.getEntitiesOfClass(NadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(NadderEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("naddercolor",
							(((Entity) world.getEntitiesOfClass(NadderMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("naddercolor")));
				}
			});
		} else {
			FemaleSpawnEggNadderProcedure.execute(world, x, y, z, entity, sourceentity);
		}
	}
}