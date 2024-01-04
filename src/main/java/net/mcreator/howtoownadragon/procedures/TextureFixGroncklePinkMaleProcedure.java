package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class TextureFixGroncklePinkMaleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getBoolean("groncklesaddle") == true)) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("groncklepink");
			HowToOwnADragonMod.queueServerWork(20, () -> {
				TextureFixGroncklePinkMaleProcedure.execute(world, entity);
			});
		}
	}
}
