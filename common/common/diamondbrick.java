package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class diamondbrick extends Block {

 String diamondbrick;
 
 public diamondbrick(int par1, String diamondbrick) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.diamondbrick = diamondbrick;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + diamondbrick);
 }
}
