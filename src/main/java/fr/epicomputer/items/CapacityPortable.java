package fr.epicomputer.items;

import fr.epicomputer.gen.EpigenAddon;
import fr.epicomputer.init.ItemsAddon;
import net.minecraft.item.Item;

public class CapacityPortable extends Item {
	
	public static final String NAME = "capacity_portable";
	
    public CapacityPortable()
    {
        super();
        ItemsAddon.setItemName(this, NAME);
        setCreativeTab(EpigenAddon.tabsGen);
    }

}
