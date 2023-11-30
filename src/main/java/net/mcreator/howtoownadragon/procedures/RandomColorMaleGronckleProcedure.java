package net.mcreator.howtoownadragon.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RandomColorMaleGronckleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("groncklepink");
			entity.getPersistentData().putString("groncklecolor", "pink");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("gronckleorangered");
			entity.getPersistentData().putString("groncklecolor", "orangered");
		} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
			if (entity instanceof GronckleMaleEntity animatable)
				animatable.setTexture("gronckleblueyellow");
			entity.getPersistentData().putString("groncklecolor", "blueyellow");
		} else {
			RandomColorMaleGronckleProcedure.execute(world, x, y, z, entity);
		}
	}
}
