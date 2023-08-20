
package net.mcreator.howtoownadragon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.howtoownadragon.entity.OrangeRedGronckleEggEntityEntity;
import net.mcreator.howtoownadragon.client.model.ModelGronckleEggItemImprovedentity;

public class OrangeRedGronckleEggEntityRenderer extends MobRenderer<OrangeRedGronckleEggEntityEntity, ModelGronckleEggItemImprovedentity<OrangeRedGronckleEggEntityEntity>> {
	public OrangeRedGronckleEggEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGronckleEggItemImprovedentity(context.bakeLayer(ModelGronckleEggItemImprovedentity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangeRedGronckleEggEntityEntity entity) {
		return new ResourceLocation("how_to_own_a_dragon:textures/entities/gronckletextureimprovedentity.png");
	}
}
