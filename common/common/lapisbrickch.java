package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class lapisbrickch extends Block {

 String lapisbrickch;
 
 public lapisbrickch(int par1, String lapisbrickch) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.lapisbrickch = lapisbrickch;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + lapisbrickch);
 }
}
