package net.mcreator.howtoownadragon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.howtoownadragon.HowToOwnADragonMod;

public class GrowingTickNadderProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HowToOwnADragonMod.queueServerWork(600, () -> {
			if (entity.isAlive()) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
					GrowUpMessageNadderProcedure.execute(entity);
				} else {
					HowToOwnADragonMod.queueServerWork(600, () -> {
						if (entity.isAlive()) {
							if (Mth.nextInt(RandomSource.create(), 3, 10) <= 4) {
								GrowUpMessageNadderProcedure.execute(entity);
							} else {
								HowToOwnADragonMod.queueServerWork(600, () -> {
									if (entity.isAlive()) {
										if (Mth.nextInt(RandomSource.create(), 5, 10) <= 6) {
											GrowUpMessageNadderProcedure.execute(entity);
										} else {
											HowToOwnADragonMod.queueServerWork(600, () -> {
												if (entity.isAlive()) {
													if (Mth.nextInt(RandomSource.create(), 7, 10) <= 8) {
														GrowUpMessageNadderProcedure.execute(entity);
													} else {
														HowToOwnADragonMod.queueServerWork(600, () -> {
															if (entity.isAlive()) {
																GrowUpMessageNadderProcedure.execute(entity);
															}
														});
													}
												}
											});
										}
									}
								});
							}
						}
					});
				}
			}
		});
	}
}
