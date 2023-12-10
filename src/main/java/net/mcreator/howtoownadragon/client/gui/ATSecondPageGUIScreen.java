package net.mcreator.howtoownadragon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.howtoownadragon.world.inventory.ATSecondPageGUIMenu;
import net.mcreator.howtoownadragon.procedures.ATDeepOceanReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATDeepLukewarmOceanReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATDeepFrozenOceanReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATDeepDarkReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATDeepColdOceanReturnProcedure;
import net.mcreator.howtoownadragon.procedures.ATDarkForestReturnProcedure;
import net.mcreator.howtoownadragon.network.ATSecondPageGUIButtonMessage;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ATSecondPageGUIScreen extends AbstractContainerScreen<ATSecondPageGUIMenu> {
	private final static HashMap<String, Object> guistate = ATSecondPageGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_previous_page_arrow;
	ImageButton imagebutton_next_page_mcreator_copy;

	public ATSecondPageGUIScreen(ATSecondPageGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 110;
		this.imageHeight = 130;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("how_to_own_a_dragon:textures/screens/at_second_page_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_second_page"), 25, 4, -12829636);
		if (ATDarkForestReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_dark_forest"), 25, 21, -12829636);
		if (ATDeepColdOceanReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_deep_cold_ocean"), 15, 38, -12829636);
		if (ATDeepDarkReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_deep_dark"), 29, 55, -12829636);
		if (ATDeepFrozenOceanReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_deep_frozen_ocean"), 10, 73, -12829636);
		if (ATDeepLukewarmOceanReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_deep_lukewarm_ocean"), 5, 91, -12829636);
		if (ATDeepOceanReturnProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.how_to_own_a_dragon.at_second_page_gui.label_deep_ocean"), 29, 109, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_previous_page_arrow = new ImageButton(this.leftPos + 2, this.topPos + 107, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_previous_page_arrow.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new ATSecondPageGUIButtonMessage(0, x, y, z));
				ATSecondPageGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous_page_arrow", imagebutton_previous_page_arrow);
		this.addRenderableWidget(imagebutton_previous_page_arrow);
		imagebutton_next_page_mcreator_copy = new ImageButton(this.leftPos + 82, this.topPos + 107, 24, 20, 0, 0, 20, new ResourceLocation("how_to_own_a_dragon:textures/screens/atlas/imagebutton_next_page_mcreator_copy.png"), 24, 40, e -> {
			if (true) {
				HowToOwnADragonMod.PACKET_HANDLER.sendToServer(new ATSecondPageGUIButtonMessage(1, x, y, z));
				ATSecondPageGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_page_mcreator_copy", imagebutton_next_page_mcreator_copy);
		this.addRenderableWidget(imagebutton_next_page_mcreator_copy);
	}
}
