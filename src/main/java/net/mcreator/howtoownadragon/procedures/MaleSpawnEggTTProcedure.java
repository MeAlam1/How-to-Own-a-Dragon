package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MaleSpawnEggTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/execute at @e[type=how_to_own_a_dragon:tt_female, sort= nearest, limit= 1] run summon how_to_own_a_dragon:tt_egg_entity ~ ~ ~");
			GiveBreedingCooldownTTProcedure.execute(world, x, y, z);
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(TTEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(TTEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("ttcolor", (entity.getPersistentData().getString("ttcolor")));
				}
			});
		} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/execute at @e[type=how_to_own_a_dragon:tt_female, sort= nearest, limit= 1] run summon how_to_own_a_dragon:tt_egg_entity ~ ~ ~");
			GiveBreedingCooldownTTProcedure.execute(world, x, y, z);
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(TTFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()
						&& !world.getEntitiesOfClass(TTEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(TTEggEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("ttcolor",
							(((Entity) world.getEntitiesOfClass(TTFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("ttcolor")));
				}
			});
		} else {
			MaleSpawnEggTTProcedure.execute(world, x, y, z, entity);
		}
	}
}
