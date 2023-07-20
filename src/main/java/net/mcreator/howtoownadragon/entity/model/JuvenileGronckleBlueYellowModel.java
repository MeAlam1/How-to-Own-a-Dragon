package net.mcreator.howtoownadragon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.howtoownadragon.entity.JuvenileGronckleBlueYellowEntity;

public class JuvenileGronckleBlueYellowModel extends GeoModel<JuvenileGronckleBlueYellowEntity> {
	@Override
	public ResourceLocation getAnimationResource(JuvenileGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "animations/juvigronckle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JuvenileGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "geo/juvigronckle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JuvenileGronckleBlueYellowEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
