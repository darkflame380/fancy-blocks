package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class goldbrick extends Block {

 String goldbrick;
 
 public goldbrick(int par1, String goldbrick) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.goldbrick = goldbrick;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + goldbrick);
 }
}
