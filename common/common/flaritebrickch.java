package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class flaritebrickch extends Block {

 String flaritebrickch;
 
 public flaritebrickch(int par1, String flaritebrickch) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.flaritebrickch = flaritebrickch;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + flaritebrickch);
 }
}
