package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.entity.Entity;

public class ATDeepOceanReturnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity.getPersistentData().getBoolean("DeepOceanCheck") == true)) {
			return true;
		}
		return false;
	}
}
