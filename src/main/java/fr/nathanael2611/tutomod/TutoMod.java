package fr.nathanael2611.tutomod;

import fr.nathanael2611.tutomod.event.ModEventListener;
import fr.nathanael2611.tutomod.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutoMod.MODID)
public class TutoMod {

    public static final String MODID = "tutomod";

    @SidedProxy(clientSide = "fr.nathanael2611.tutomod.proxy.ClientProxy", serverSide = "fr.nathanael2611.tutomod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event){
        proxy.preInitialization(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void initialization(FMLInitializationEvent event){
        proxy.initialization();
    }

}
