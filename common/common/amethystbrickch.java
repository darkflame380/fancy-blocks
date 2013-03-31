package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class amethystbrickch extends Block {

 String amethystbrickch;
 
 public amethystbrickch(int par1, String amethystbrickch) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.amethystbrickch = amethystbrickch;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + amethystbrickch);
 }
}
