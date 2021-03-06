package com.strikerrocker.vt.blocks;

import com.strikerrocker.vt.blocks.pedestal.BlockPedestal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Contains, initializes, and registers all of Craft++'s blocks
 */
public class VTBlocks {

    public static BlockSugar sugar = new BlockSugar("sugarblock");
    public static BlockFlint flint = new BlockFlint("flintblock");
    public static BlockCharcoal charcoal = new BlockCharcoal("charcoalblock");
    public static BlockPedestal pedestal = new BlockPedestal();
    public static BlockBark acaciabark = new BlockBark("acaciabark", MapColor.STONE);
    public static BlockBark darkoakbark = new BlockBark("darkoakbark", BlockPlanks.EnumType.DARK_OAK.getMapColor());
    public static BlockBark oakbark = new BlockBark("oakbark", BlockPlanks.EnumType.SPRUCE.getMapColor());
    public static BlockBark sprucebark = new BlockBark("sprucebark", BlockPlanks.EnumType.DARK_OAK.getMapColor());
    public static BlockBark junglebark = new BlockBark("junglebark", BlockPlanks.EnumType.SPRUCE.getMapColor());
    public static BlockBark birchbark = new BlockBark("birchbark", MapColor.QUARTZ);


    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                sugar, flint, charcoal, pedestal, acaciabark, darkoakbark, oakbark, sprucebark, junglebark, birchbark
        );

        GameRegistry.registerTileEntity(pedestal.getTileEntityClass(), pedestal.getRegistryName().toString());
    }


    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                pedestal.createItemBlock(), sugar.createItemBlock(), flint.createItemBlock(),
                charcoal.createItemBlock(), acaciabark.createItemBlock(), birchbark.createItemBlock(),
                oakbark.createItemBlock(), darkoakbark.createItemBlock(), sprucebark.createItemBlock(),
                junglebark.createItemBlock()
        );
    }

    public static void registerModels() {
        sugar.registerItemModel(Item.getItemFromBlock(sugar));
        charcoal.registerItemModel(Item.getItemFromBlock(charcoal));
        flint.registerItemModel(Item.getItemFromBlock(flint));
        pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
        acaciabark.registerItemModel(Item.getItemFromBlock(acaciabark));
        birchbark.registerItemModel(Item.getItemFromBlock(birchbark));
        darkoakbark.registerItemModel(Item.getItemFromBlock(darkoakbark));
        oakbark.registerItemModel(Item.getItemFromBlock(oakbark));
        sprucebark.registerItemModel(Item.getItemFromBlock(sprucebark));
        junglebark.registerItemModel(Item.getItemFromBlock(junglebark));
    }
}