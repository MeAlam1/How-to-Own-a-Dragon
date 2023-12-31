
package net.mcreator.howtoownadragon.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.howtoownadragon.world.inventory.VanillaTabGroupsGUIMenu;
import net.mcreator.howtoownadragon.procedures.OpenNothingsHereProcedure;
import net.mcreator.howtoownadragon.procedures.OpenNetherTabGroupGUIProcedure;
import net.mcreator.howtoownadragon.procedures.OpenHusbandryTabGroupGUIProcedure;
import net.mcreator.howtoownadragon.procedures.OpenAdventureTabGroupGUIProcedure;
import net.mcreator.howtoownadragon.procedures.BackButtonMainAdvancementGUIProcedure;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VanillaTabGroupsGUIButtonMessage {
	private final int buttonID, x, y, z;

	public VanillaTabGroupsGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public VanillaTabGroupsGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(VanillaTabGroupsGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(VanillaTabGroupsGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = VanillaTabGroupsGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenNothingsHereProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenNetherTabGroupGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenNothingsHereProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenAdventureTabGroupGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenHusbandryTabGroupGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			BackButtonMainAdvancementGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HowToOwnADragonMod.addNetworkMessage(VanillaTabGroupsGUIButtonMessage.class, VanillaTabGroupsGUIButtonMessage::buffer, VanillaTabGroupsGUIButtonMessage::new, VanillaTabGroupsGUIButtonMessage::handler);
	}
}
