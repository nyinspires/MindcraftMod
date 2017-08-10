package com.nyinspires.mod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "nyinspires";
    public static final String VERSION = "1.0";
    
    public static Block enderBlock;
    public static Item enderIngot;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosionsWithoutFuse());
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
        MinecraftForge.EVENT_BUS.register(new BouncySponges());
        
        MinecraftForge.EVENT_BUS.register(new CreeperReinforcements());
        MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
        
        
        
    }
}
