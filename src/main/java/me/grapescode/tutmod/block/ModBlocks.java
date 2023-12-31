package me.grapescode.tutmod.block;

import me.grapescode.tutmod.TutMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK = RegBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_RUBY_BLOCK = RegBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERRACK)));
    private static Block RegBlock(String name, Block block) {
        RegisterBlock(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutMod.MOD_ID, name), block);
    }
    private static Item RegisterBlock(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void RegisterBlocks() {
        TutMod.LOGGER.info("[LEYENDAS] Registrando bloques...");
    }
}
