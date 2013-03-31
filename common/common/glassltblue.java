package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class glassltblue extends Block {

 String glassltblue;
 
 public glassltblue(int par1, String glassltblue) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.glassltblue = glassltblue;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + glassltblue);
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
