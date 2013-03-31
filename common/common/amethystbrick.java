package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class amethystbrick extends Block {

 String amethystbrick;
 
 public amethystbrick(int par1, String amethystbrick) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.amethystbrick = amethystbrick;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + amethystbrick);
 }
}