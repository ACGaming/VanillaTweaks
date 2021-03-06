package com.strikerrocker.vt.worldgen;

import com.strikerrocker.vt.handlers.VTConfigHandler;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.*;

public class NetherPocketer {
    @SubscribeEvent
    public void onPopulateChunk(PopulateChunkEvent.Populate event) {
        if ((VTConfigHandler.NoMoreLavaPocketGen) && event.getType() == NETHER_LAVA) {
            event.setResult(Event.Result.DENY);
        } else if ((VTConfigHandler.NoMoreLavaPocketGen) && event.getType() == NETHER_LAVA2) {
            event.setResult(Event.Result.DENY);
        } else if ((VTConfigHandler.NoMoreLavaPocketGen) && event.getType() == NETHER_MAGMA) {
            event.setResult(Event.Result.DENY);
        }
    }
}
