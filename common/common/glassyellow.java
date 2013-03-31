package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class glassyellow extends Block {

 String glassyellow;
 
 public glassyellow(int par1, String glassyellow) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.glassyellow = glassyellow;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + glassyellow);
 }

 public int getRenderBlockPass()
 {
     return 1;
 }

 public boolean isOpaqueCube()
 {
     return false;
 }

 public boolean renderAsNormalBlock()
 {
     return false;
 }
}
