package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class diamondbrickch extends Block {

 String diamondbrickch;
 
 public diamondbrickch(int par1, String diamondbrickch) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.diamondbrickch = diamondbrickch;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + diamondbrickch);
 }
}
