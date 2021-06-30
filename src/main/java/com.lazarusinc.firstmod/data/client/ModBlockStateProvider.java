package com.lazarusinc.firstmod.data.client;

import com.lazarusinc.firstmod.FirstMod;
import com.lazarusinc.firstmod.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, FirstMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLOCK_OF_XYLONITE.get());
        simpleBlock(ModBlocks.XYLONITE_ORE.get());
    }
}
