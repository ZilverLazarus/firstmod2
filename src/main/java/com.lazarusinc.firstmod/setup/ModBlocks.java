package com.lazarusinc.firstmod.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> XYLONITE_ORE = register("xylonite_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(3, 3).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLOCK_OF_XYLONITE = register("block_of_xylonite", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL).strength(5, 6).harvestLevel(2).sound(SoundType.METAL)));


    static void register() {}

    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}
