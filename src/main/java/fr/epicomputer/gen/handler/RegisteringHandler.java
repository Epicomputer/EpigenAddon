package fr.epicomputer.gen.handler;

import fr.epicomputer.init.ItemsAddon;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringHandler {
	
	/*@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
	    //event.getRegistry().registerAll(BlocksCore.COMPUTER_CASE);
	}
	*/
	@SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ItemsAddon.CAPACTITYPORTABLE);
        
    }

}
