package com.strikerrocker.vt.proxies;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

/**
 * The common (dual-side) proxy for Vanilla Tweaks
 */

@Mod.EventBusSubscriber
public class VTCommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
    }

    public void registerRenderers() {
    }

    public void registerKey() {
    }
}