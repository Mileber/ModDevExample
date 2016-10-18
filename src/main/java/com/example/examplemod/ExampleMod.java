package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
	
	@SidedProxy(clientSide="com.example.examplemod.ClientProxy", serverSide="com.example.examplemod.ServerProxy")
	public static CommonProxy proxy;
	
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @Instance
    public static ExampleMod instance = new ExampleMod();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("这里是PreInit方法");
        this.proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("这里是Init方法");
        this.proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("这里是PostInit方法");
        this.proxy.postInit(event);
    }
}
