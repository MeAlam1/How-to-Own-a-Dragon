package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.howtoownadragon.init.HowToOwnADragonModEntities;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.Comparator;

public class GrowUpGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyGronckleMaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new JuvenileGronckleMaleEntity(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_MALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(JuvenileGronckleMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(JuvenileGronckleMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("groncklecolor", (entity.getPersistentData().getString("groncklecolor")));
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
					if (!entity.level.isClientSide())
						entity.discard();
				}
			});
		} else if (entity instanceof BabyGronckleFemaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new JuvenileGronckleFemaleEntity(HowToOwnADragonModEntities.JUVENILE_GRONCKLE_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(JuvenileGronckleFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(JuvenileGronckleFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("groncklecolor", (entity.getPersistentData().getString("groncklecolor")));
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
					if (!entity.level.isClientSide())
						entity.discard();
				}
			});
		} else if (entity instanceof JuvenileGronckleMaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AdolescentGronckleMaleEntity(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_MALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(AdolescentGronckleMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(AdolescentGronckleMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("groncklecolor", (entity.getPersistentData().getString("groncklecolor")));
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
					if (!entity.level.isClientSide())
						entity.discard();
				}
			});
		} else if (entity instanceof JuvenileGronckleFemaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AdolescentGronckleFemaleEntity(HowToOwnADragonModEntities.ADOLESCENT_GRONCKLE_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(AdolescentGronckleFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(AdolescentGronckleFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("groncklecolor", (entity.getPersistentData().getString("groncklecolor")));
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
					if (!entity.level.isClientSide())
						entity.discard();
				}
			});
		} else if (entity instanceof AdolescentGronckleMaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleMaleEntity(HowToOwnADragonModEntities.GRONCKLE_MALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(GronckleMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(GronckleMaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("groncklecolor", (entity.getPersistentData().getString("groncklecolor")));
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
					if (!entity.level.isClientSide())
						entity.discard();
				}
			});
		} else if (entity instanceof AdolescentGronckleFemaleEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 30, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GronckleFemaleEntity(HowToOwnADragonModEntities.GRONCKLE_FEMALE.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			HowToOwnADragonMod.queueServerWork(1, () -> {
				if (!world.getEntitiesOfClass(GronckleFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(GronckleFemaleEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("groncklecolor", (entity.getPersistentData().getString("groncklecolor")));
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Your " + entity.getDisplayName().getString() + " has succesfully grown up!")), false);
					if (!entity.level.isClientSide())
						entity.discard();
				}
			});
		}
	}
}
