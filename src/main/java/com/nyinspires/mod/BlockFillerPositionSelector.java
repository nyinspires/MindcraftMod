package com.nyinspires.mod;

import java.util.ArrayList;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.init.Items;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

// Not working on purpose.
public class BlockFillerPositionSelector {
	
	static List<Integer> pos1 = new ArrayList();
	static List<Integer> pos2 = new ArrayList();

	@SubscribeEvent
	public void choosePositions(PlayerInteractEvent event) {
		if (event.getEntityPlayer().getHeldItemMainhand() == null
				|| event.getEntityPlayer().getHeldItemMainhand().getItem() != Items.WOODEN_AXE
				|| !event.getEntityPlayer().capabilities.isCreativeMode) {
			return;
		}
		if (event.action == Action.RIGHT_CLICK_BLOCK) {
			pos1.clear();
			pos1.add(event.getPos().getX());
			pos1.add(event.getPos().getY());
			pos1.add(event.getPos().getZ());
			event.getEntityPlayer().sendMessage(new TextComponentString(
					ChatFormatting.GREEN + "Position 1 set to " + event.getPos().getX()
							+ ", " + event.getPos().getY() + ", " + event.getPos().getZ() + "."));
			event.setCanceled(true);
		} else if (event.action == Action.LEFT_CLICK_BLOCK) {
			pos2.clear();
			pos2.add(event.getPos().getX());
			pos2.add(event.getPos().getY());
			pos2.add(event.getPos().getZ());
			event.getEntityPlayer().sendMessage(new TextComponentString(
					ChatFormatting.GREEN + "Position 2 set to " + event.getPos().getX()
							+ ", " + event.getPos().getY() + ", " + event.getPos().getZ() + "."));
			event.setCanceled(true);
		}
	}

}
