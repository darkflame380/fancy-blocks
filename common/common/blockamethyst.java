package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockamethyst extends Block {

 String blockamethyst;
 
 public blockamethyst(int par1, String blockamethyst) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.blockamethyst = blockamethyst;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + blockamethyst);
 }
}
