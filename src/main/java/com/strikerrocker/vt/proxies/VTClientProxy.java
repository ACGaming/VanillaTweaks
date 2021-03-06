package com.strikerrocker.vt.proxies;

import com.strikerrocker.vt.blocks.pedestal.TESRPedestal;
import com.strikerrocker.vt.blocks.pedestal.TileEntityPedestal;
import com.strikerrocker.vt.vt;
import com.strikerrocker.vt.vtModInfo;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

/**
 * The client-side proxy for Vanilla Tweaks
 */

public class VTClientProxy extends VTCommonProxy {

    private static final String CATEGORY = "key.category.vt:general";
    public static final KeyBinding bauble = new KeyBinding("key.vt:zoom", KeyConflictContext.IN_GAME, Keyboard.KEY_Z, CATEGORY);

    @Override
    public void registerKey() {
        if (vt.baubles) ClientRegistry.registerKeyBinding(bauble);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(vtModInfo.MOD_ID + ":" + id, "inventory"));
    }

    @Override
    public void registerRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPedestal.class, new TESRPedestal());
    }
}

