package de.ropemc.api.event.player;

import de.ropemc.api.event.Event;
import de.ropemc.api.event.EventManager;
import de.ropemc.api.inject.Inject;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;

public class PlayerUpdateEvent extends Event {

    public PlayerUpdateEvent() {

    }

    @Inject(EntityPlayerSP.class)
    public static class PlayerUpdateEventInjector {
        @Inject.Start
        public static void onLivingUpdate() {
            EventManager.callEvent(new PlayerUpdateEvent());
        }
    }
}
