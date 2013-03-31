package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class glassmagenta extends Block {

 String glassmagenta;
 
 public glassmagenta(int par1, String glassmagenta) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.glassmagenta = glassmagenta;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + glassmagenta);
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
