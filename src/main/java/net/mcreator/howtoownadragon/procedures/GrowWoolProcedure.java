package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.SheepEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GrowWoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(600, () -> {
			entity.getPersistentData().putBoolean("sheared", false);
			if ((entity.getPersistentData().getString("sheepcolor")).equals("white")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheep");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("black")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepblack");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("grey")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepgrey");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightgrey")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeplightgrey");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("brown")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepbrown");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("red")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepred");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("orange")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeporange");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("yellow")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepyellow");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("green")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepgreen");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lime")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeplime");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("cyan")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepcyan");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("blue")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepblue");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("lightblue")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeplightblue");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("purple")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeppurple");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("magenta")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheepmagenta");
			} else if ((entity.getPersistentData().getString("sheepcolor")).equals("pink")) {
				if (entity instanceof SheepEntity animatable)
					animatable.setTexture("sheeppink");
			}
		});
	}
}
