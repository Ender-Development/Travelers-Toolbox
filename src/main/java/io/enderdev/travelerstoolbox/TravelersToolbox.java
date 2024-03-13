package io.enderdev.travelerstoolbox;

import io.enderdev.travelerstoolbox.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TravelersToolbox.MODID, name = TravelersToolbox.NAME, acceptedMinecraftVersions = TravelersToolbox.VERSIONS)
public class TravelersToolbox {
    public static final String MODID = "travelerstoolbox";
    public static final String NAME = "Traveler's Toolbox";
    public static final String CFGDIR = "travelerstoolbox/";
    public static final String VERSIONS = "[1.12.2]";

    @Mod.Instance(MODID)
    public static TravelersToolbox instance;

    @SidedProxy(clientSide = "io.enderdev.travelerstoolbox.proxy.ClientProxy", serverSide = "io.enderdev.travelerstoolbox.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
