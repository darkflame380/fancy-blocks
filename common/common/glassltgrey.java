package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class glassltgrey extends Block {

 String glassltgrey;
 
 public glassltgrey(int par1, String glassltgrey) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.glassltgrey = glassltgrey;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + glassltgrey);
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

