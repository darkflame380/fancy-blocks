package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class glassbrown extends Block {

 String glassbrown;
 
 public glassbrown(int par1, String glassbrown) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.glassbrown = glassbrown;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + glassbrown);
 }

 public int getRenderBlockPass()
 {
     return 1;
 }

 public boolean isOpaqueCube()
 {
     return false;
 }

 public boolean renderAsNormalBlock()
 {
     return false;
 }
}
