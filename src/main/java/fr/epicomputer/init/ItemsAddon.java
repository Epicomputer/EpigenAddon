package fr.epicomputer.init;

import fr.epicomputer.gen.EpigenAddon;
import fr.epicomputer.items.CapacityPortable;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsAddon {

	public static final Item CAPACTITYPORTABLE = new CapacityPortable();
	
	public static void setItemName(Item item, String name)
	{
		item.setRegistryName(EpigenAddon.MODID, name).setUnlocalizedName(EpigenAddon.MODID + "." + name);
	}
	 
	 
	// En 1.12+
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerItemsModels(ModelRegistryEvent event)
	{
		//registre ton model
		registerModel(CAPACTITYPORTABLE, 0);
	    	
	}
	 
	@SideOnly(Side.CLIENT)
	public static void registerModel(Item item, int metadata)
	{
		if (metadata < 0) metadata = 0;
		String resourceName = item.getUnlocalizedName().substring(5).replace('.', ':');
		if (metadata > 0) resourceName += "_m" + String.valueOf(metadata);
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(resourceName, "inventory"));
	}

}
