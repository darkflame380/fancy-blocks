package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class glasslime extends Block {

 String glasslime;
 
 public glasslime(int par1, String glasslime) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.glasslime = glasslime;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + glasslime);
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
