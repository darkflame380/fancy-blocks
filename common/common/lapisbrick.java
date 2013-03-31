package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class lapisbrick extends Block {

 String lpbrick;
 
 public lapisbrick(int par1, String lpbrick) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.lpbrick = lpbrick;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + lpbrick);
 }
}