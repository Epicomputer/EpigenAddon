package fr.epicomputer.gen;

import org.apache.logging.log4j.Logger;

import fr.epicomputer.gen.handler.RegisteringHandler;
import fr.epicomputer.gen.proxy.CommonProxy;
import fr.epicomputer.init.ItemsAddon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = EpigenAddon.MODID, name= EpigenAddon.MODID, version = EpigenAddon.MODID)
public class EpigenAddon {
	
	public static final String MODID = "egen";
	public static final String NAME = "Epigen Addon";
	public static final String VERSION = "0.0.1";
	
	@Instance(EpigenAddon.MODID)
	   public static EpigenAddon instance;

	@SidedProxy(clientSide = "fr.epicomputer.gen.proxy.ClientProxy", serverSide = "fr.epicomputer.gen.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static CreativeTabs tabsGen = new CreativeTabs("epigenaddon_creative_tabs")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ItemsAddon.CAPACTITYPORTABLE);
        }
     
       
    };

    public static Logger logger;
    
    public EpigenAddon() {
    	MinecraftForge.EVENT_BUS.register(new RegisteringHandler());
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
        
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
    
    @EventHandler
    public void onServerStart(FMLServerStartingEvent event)
    {
 
    }

}
