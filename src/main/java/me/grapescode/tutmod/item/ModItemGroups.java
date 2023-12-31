package me.grapescode.tutmod.item;

import me.grapescode.tutmod.TutMod;
import me.grapescode.tutmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        //Materiales
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        //Bloques
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        //Armaduras
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                    }).build());
    public static void RegisterItemGroups() {
        TutMod.LOGGER.info("[LEYENDAS] Registrando grupos...");
    }
}
