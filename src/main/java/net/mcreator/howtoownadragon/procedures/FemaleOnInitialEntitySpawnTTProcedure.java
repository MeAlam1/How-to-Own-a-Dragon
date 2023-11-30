package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class FemaleOnInitialEntitySpawnTTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(1, () -> {
			if (entity instanceof TTFemaleEntity) {
				NBTOnInitiallSpawnTTProcedure.execute(entity);
				if ((entity.getPersistentData().getString("ttcolor")).equals("green")) {
					if (!((entity instanceof TTFemaleEntity animatable ? animatable.getTexture() : "null").equals("greentt"))) {
						if (entity instanceof TTFemaleEntity animatable)
							animatable.setTexture("greentt");
					}
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("pink")) {
					if (!((entity instanceof TTFemaleEntity animatable ? animatable.getTexture() : "null").equals("pinktt"))) {
						if (entity instanceof TTFemaleEntity animatable)
							animatable.setTexture("pinktt");
					}
				} else if ((entity.getPersistentData().getString("ttcolor")).equals("turq")) {
					if (!((entity instanceof TTFemaleEntity animatable ? animatable.getTexture() : "null").equals("turqtt"))) {
						if (entity instanceof TTFemaleEntity animatable)
							animatable.setTexture("turqtt");
					}
				} else {
					RandomColorFemaleTTProcedure.execute(world, x, y, z, entity);
				}
			}
		});
	}
}
