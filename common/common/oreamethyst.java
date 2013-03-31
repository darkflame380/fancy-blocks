package common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class oreamethyst extends Block {

 String oreamethyst;
 
 public oreamethyst(int par1, String oreamethyst) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.oreamethyst = oreamethyst;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + oreamethyst);
 }
 
public int idDropped(int par1, Random par2Random, int par3)
{
    return common.mod_fancyblocks.flarite.itemID;
}
public int quantityDropped(Random par1Random)
{
    return 3;
}

}

