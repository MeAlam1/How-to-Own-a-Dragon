package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.howtoownadragon.world.inventory.NotGrownMaleGronckleOrangeRedGUIMenu;
import net.mcreator.howtoownadragon.procedures.GronckleOrangeRedRenderProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class NotGrownMaleGronckleOrangeRedGUIScreen extends AbstractContainerScreen<NotGrownMaleGronckleOrangeRedGUIMenu> {
	private final static HashMap<String, Object> guistate = NotGrownMaleGronckleOrangeRedGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public NotGrownMaleGronckleOrangeRedGUIScreen(NotGrownMaleGronckleOrangeRedGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/not_grown_male_gronckle_orange_red_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (GronckleOrangeRedRenderProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + 35, this.topPos + 52, 10, 0f + (float) Math.atan((this.leftPos + 35 - mouseX) / 40.0), (float) Math.atan((this.topPos + 2 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("how_to_own_a_dragon:textures/screens/man_symbol_-_copy.png"));
		this.blit(ms, this.leftPos + 76, this.topPos + 5, 0, 0, 10, 11, 10, 11);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.not_grown_male_gronckle_orange_red_gui.label_male_gronckle"), 6, 6, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.not_grown_male_gronckle_orange_red_gui.label_inventory"), 7, 70, -13421773);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
