package net.karosene.morefurniture.world.tree;

import net.karosene.morefurniture.MoreFurniture;
import net.karosene.morefurniture.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator SEQUOIA = new SaplingGenerator(MoreFurniture.MOD_ID + ":sequoia",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SEQUOIA_KEY), Optional.empty());
}