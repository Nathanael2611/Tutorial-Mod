package fr.nathanael2611.tutomod.event;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModEventListener {

    @SubscribeEvent
    public static void entityJoinWorld(EntityJoinWorldEvent event) {
        if (!event.getWorld().isRemote) {
            event.getEntity().sendMessage(new TextComponentString("Bienvenue à toi " + event.getEntity().getName()));
        }
    }

}
