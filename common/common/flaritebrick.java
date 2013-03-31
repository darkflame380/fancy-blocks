package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class flaritebrick extends Block {

 String flaritebrick;
 
 public flaritebrick(int par1, String flaritebrick) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.flaritebrick = flaritebrick;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + flaritebrick);
 }
}
