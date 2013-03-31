package common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;

@Mod(modid = "Fancyblocks", name = "FancyBlocks", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_fancyblocks {

  @SidedProxy(clientSide = "common.ClientProxy", serverSide = "common.CommonProxy")
  public static CommonProxy proxy;
 //Block declaration
   public static Block lapisbrick;
   public static Block goldbrick;
   public static Block diamondbrick;
   public static Block oreflarite;
   public static Block oreamethyst;
   public static Item flarite;
   public static Item amethyst;
   public static Block blockflarite;
   public static Block flaritebrick;
   public static Block blockamethyst;
   public static Block amethystbrick;
   public static Item amethystpick;
   public static Block glassred;
   public static Block glassblack;
   public static Block glasscyan;
   public static Block glassyellow;
   public static Block glassgreen;
   public static Block glasslime;
   public static Block glassmagenta;
   public static Block glasspurple;
   public static Block glasspink;
   public static Block glassblue;
   public static Block glassgrey;
   public static Block glassltgrey;
   public static Block glassorange;
   public static Block glassltblue;
   public static Block glassbrown;
 
   @PreInit
 public void preLoad(FMLPreInitializationEvent event) 
  {
	  
  }
//Put block stuff here
  @Init
 public void load(FMLInitializationEvent event) 
  {

	  proxy.registerRenderThings();
//lapisbrick
	  lapisbrick = new lapisbrick(1000, "lapisBrick").setUnlocalizedName("lapisBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(lapisbrick, "lapisBrick");
	  LanguageRegistry.addName(lapisbrick, "Lapis Brick");
	  GameRegistry.addRecipe(new ItemStack(lapisbrick,4), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', new ItemStack(Item.dyePowder, 1, 4)
			    });
//goldbrick
	  goldbrick = new goldbrick(1001, "goldBrick").setUnlocalizedName("goldBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(goldbrick, "goldBrick");
	  LanguageRegistry.addName(goldbrick, "Gold Brick");
	  GameRegistry.addRecipe(new ItemStack(goldbrick,4), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', Item.ingotGold
			    });
//diamondbrick
	  diamondbrick = new diamondbrick(1002, "diamondBrick").setUnlocalizedName("diamondBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(diamondbrick, "diamondBrick");
	  LanguageRegistry.addName(diamondbrick, "Diamond Brick");
	  GameRegistry.addRecipe(new ItemStack(diamondbrick,4), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', Item.diamond
			    });
//oreflarite
	  oreflarite = new oreflarite(1003, "oreflarite").setUnlocalizedName("oreflarite").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(oreflarite, "oreflarite");
	  LanguageRegistry.addName(oreflarite, "Flarite Ore");
	  GameRegistry.registerWorldGenerator(new oreflariteworldgen());
//oreamethyst
	  oreamethyst = new oreamethyst(1004, "oreamethyst").setUnlocalizedName("oreamethyst").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(oreamethyst, "oreamethyst");
	  LanguageRegistry.addName(oreamethyst, "Amethyst Ore");
	  GameRegistry.registerWorldGenerator(new oreamethystworldgen());
//flarite
	  flarite = new itemflarite(5500, "flarite").setUnlocalizedName("flarite");
	  GameRegistry.registerItem(flarite, "flarite");
	  LanguageRegistry.addName(flarite, "Flarite");
//amethyst
	  amethyst = new itemamethyst(5501, "amethyst").setUnlocalizedName("amethyst");
	  GameRegistry.registerItem(amethyst, "amethyst");
	  LanguageRegistry.addName(amethyst, "Amethyst");
//blockflarite
	  blockflarite = new blockflarite(1005, "blockflarite").setUnlocalizedName("blockflarite").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(blockflarite, "blockflarite");
	  LanguageRegistry.addName(blockflarite, "Flarite Block");
	  GameRegistry.addRecipe(new ItemStack(blockflarite,1), new Object[]
			    {
			     "XXX","XXX","XXX", 'X', common.mod_fancyblocks.flarite
			    });
//flaritebrick
	  flaritebrick = new flaritebrick(1006, "flariteBrick").setUnlocalizedName("flariteBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(flaritebrick, "flariteBrick");
	  LanguageRegistry.addName(flaritebrick, "Flarite Brick");
	  GameRegistry.addRecipe(new ItemStack(flaritebrick,4), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', common.mod_fancyblocks.flarite
			    });
//amethystblock
	  blockamethyst = new blockamethyst(1007, "blockamethyst").setUnlocalizedName("blockamethyst").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(blockamethyst, "blockamethyst");
	  LanguageRegistry.addName(blockamethyst, "Amethyst Block");
	  GameRegistry.addRecipe(new ItemStack(blockamethyst,1), new Object[]
			    {
			     "XXX","XXX","XXX", 'X', common.mod_fancyblocks.amethyst
			    });
//amethystbrick
	  amethystbrick = new amethystbrick(1008, "amethystBrick").setUnlocalizedName("amethystBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(amethystbrick, "amethystBrick");
	  LanguageRegistry.addName(amethystbrick, "Amethyst Brick");
	  GameRegistry.addRecipe(new ItemStack(amethystbrick,4), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', common.mod_fancyblocks.amethyst
			    });
//amethystpick	 
	 
	  amethystpick = new amethystpick(5502, EnumToolMaterial.IRON).setUnlocalizedName("amethystpick");
	  GameRegistry.registerItem(amethystpick, "amethystpick");
	  LanguageRegistry.addName(amethystpick, "Amethyst Pickaxe");
	  GameRegistry.addRecipe(new ItemStack(amethystpick), new Object[]
	      {
	       "XXX", " Z ", " Z ", 'X', common.mod_fancyblocks.amethyst, 'Z', Item.stick
	      });
//glassred
	  glassred = new glassred(1009, "glassred").setUnlocalizedName("glassred").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassred, "glassred");
	  LanguageRegistry.addName(glassred, "Red Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassred,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 1)
			    });  
//glassblack
	  glassblack = new glassblack(1010, "glassblack").setUnlocalizedName("glassblack").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassblack, "glassblack");
	  LanguageRegistry.addName(glassblack, "Black Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassblack,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 0)
			    });
//glasscyan
	  glasscyan = new glasscyan(1011, "glasscyan").setUnlocalizedName("glasscyan").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasscyan, "glasscyan");
	  LanguageRegistry.addName(glasscyan, "Cyan Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasscyan,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 6)
			    });
//glassyellow
	  glassyellow = new glassyellow(1012, "glassyellow").setUnlocalizedName("glassyellow").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassyellow, "glassyellow");
	  LanguageRegistry.addName(glassyellow, "Yellow Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassyellow,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 11)
			    });
//glassgreen
	  glassgreen = new glassgreen(1023, "glassgreen").setUnlocalizedName("glassgreen").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassgreen, "glassgreen");
	  LanguageRegistry.addName(glassgreen, "Green Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassgreen,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 2)
			    });
//glasslime
	  glasslime = new glasslime(1013, "glasslime").setUnlocalizedName("glasslime").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasslime, "glasslime");
	  LanguageRegistry.addName(glasslime, "Lime Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasslime,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 10)
			    });
//glassmagenta
	  glassmagenta = new glassmagenta(1014, "glassmagenta").setUnlocalizedName("glassmagenta").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassmagenta, "glassmagenta");
	  LanguageRegistry.addName(glassmagenta, "Magenta Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassmagenta,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 13)
			    });
//glasspurple
	  glasspurple = new glasspurple(1015, "glasspurple").setUnlocalizedName("glasspurple").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasspurple, "glasspurple");
	  LanguageRegistry.addName(glasspurple, "Purple Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasspurple,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 5)
			    });
//glasspink
	  glasspink = new glasspink(1016, "glasspink").setUnlocalizedName("glasspink").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasspink, "glasspink");
	  LanguageRegistry.addName(glasspink, "Pink Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasspink,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 9)
			    });
//glassblue
	  glassblue = new glassblue(1017, "glassblue").setUnlocalizedName("glassblue").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassblue, "glassblue");
	  LanguageRegistry.addName(glassblue, "Blue Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassblue,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 4)
			    });
//glassgrey
	  glassgrey = new glassgrey(1018, "glassgrey").setUnlocalizedName("glassgrey").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassgrey, "glassgrey");
	  LanguageRegistry.addName(glassgrey, "Grey Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassgrey,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 8)
			    });
//glassltgrey
	  glassltgrey = new glassltgrey(1019, "glassltgrey").setUnlocalizedName("glassltgrey").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassltgrey, "glassltgrey");
	  LanguageRegistry.addName(glassltgrey, "LightGrey Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassltgrey,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 7)
			    });
//glassorange
	  glassorange = new glassorange(1020, "glassorange").setUnlocalizedName("glassorange").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassorange, "glassorange");
	  LanguageRegistry.addName(glassorange, "Orange Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassorange,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 14)
			    });
//glassltblue
	  glassltblue = new glassltblue(1021, "glassltblue").setUnlocalizedName("glassltblue").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassltblue, "glassltblue");
	  LanguageRegistry.addName(glassltblue, "LightBlue Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassltblue,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 12)
			    });
//glassbrown
	  glassbrown = new glassbrown(1022, "glassbrown").setUnlocalizedName("glassbrown").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassbrown, "glassbrown");
	  LanguageRegistry.addName(glassbrown, "Brown Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassbrown,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 3)
			    });
	  

  }

  @PostInit
 public void modsLoaded(FMLPostInitializationEvent event)
  {

  }
 
}

