package com.drazisil.com.portalcontrol;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onPortalCreation(PortalCreateEvent event) {

        // NETHER_PAIR, FIRE

        event.setCancelled(true);

    }
}
