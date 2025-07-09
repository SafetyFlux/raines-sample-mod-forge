package com.safetyflux.rainessamplemod.item;

import com.safetyflux.rainessamplemod.RainesSampleMod;
import com.safetyflux.rainessamplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RainesSampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAINES_SAMPLE_MOD_TAB = CREATIVE_MODE_TABS.register("raines_sample_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOPAZ.get()))
                    .title(Component.translatable("creativetab.rainessamplemod.raines_sample_mod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.TOPAZ_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
