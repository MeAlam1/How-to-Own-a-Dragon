package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.BabyGronckleOrangeRedEntity;

public class BabyGronckleOrangeRedModel extends GeoModel<BabyGronckleOrangeRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyGronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/babygronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyGronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/babygronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyGronckleOrangeRedEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
