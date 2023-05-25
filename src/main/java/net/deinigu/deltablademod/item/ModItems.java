package net.deinigu.deltablademod.item;

import net.deinigu.deltablademod.DeltabladeMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeltabladeMod.MOD_ID);

    public static final RegistryObject<Item> DELTA = ITEMS.register("delta", ()->new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)));
    public static final RegistryObject<Item> BLADE = ITEMS.register("blade",()->new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}