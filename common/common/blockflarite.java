package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockflarite extends Block {

 String blockflarite;
 
 public blockflarite(int par1, String blockflarite) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.blockflarite = blockflarite;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + blockflarite);
 }
}

