package com.nyinspires.mod;

import java.util.ArrayList;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

public class FlamingPigs implements ICommand {

	private List aliases = new ArrayList();
	private int numberOfPigs = 0;

	public FlamingPigs() {
		aliases.add("flamingpigs");
		aliases.add("fp");
	}

	

	public String getCommandUsage(ICommandSender sender) {
		return "/flamingpigs <number of pigs>";
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAliases() {
		return aliases;
	}

	public void execute(ICommandSender sender, String[] args)
			throws CommandException {
		if (args.length != 1) {
			sendErrorMessage(sender, "Invalid number of arguments!");
			return;
		}
		try {
			numberOfPigs = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			sendErrorMessage(sender, "The argument \"" + args[0]
					+ "\" is not a valid number!");
			return;
		}
		EntityPlayer player = (EntityPlayer) sender;
		for (int i = 0; i < numberOfPigs; i++) {
			EntityPig pig = new EntityPig(player.world);
			pig.setLocationAndAngles(player.posX, player.posY, player.posZ, 0,
					0);
			pig.setFire(10000);
			player.world.spawnEntity(pig);
		}
	}

	private void sendErrorMessage(ICommandSender sender, String message) {
		sender.sendMessage(new TextComponentString(ChatFormatting.GOLD + "Uh oh! Something went wrong! :("));
	}

	public boolean canCommandSenderUse(ICommandSender sender) {
		return sender instanceof EntityPlayer;
	}

	public List addTabCompletionOptions(ICommandSender sender, String[] args,
			net.minecraft.util.math.BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(ICommand arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			net.minecraft.util.math.BlockPos targetPos) {
		// TODO Auto-generated method stub
		return null;
	}

}
