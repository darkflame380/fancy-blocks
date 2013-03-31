package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class goldbrickch extends Block {

 String goldbrickch;
 
 public goldbrickch(int par1, String goldbrickch) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.goldbrickch = goldbrickch;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + goldbrickch);
 }
}
