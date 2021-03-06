package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class amethystpick extends ItemPickaxe
{
	 String amethystpick;

	 public void updateIcons(IconRegister iconRegister) {
	  iconIndex = iconRegister.registerIcon("fancyblocks:" + amethystpick);
	 }
 
	
	public amethystpick(int par1, EnumToolMaterial par2EnumToolMaterial)
 {
  super(par1, par2EnumToolMaterial);
 }

 public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.obsidian ? this.toolMaterial.getHarvestLevel() == 2 : (par1Block != Block.blockDiamond && par1Block != Block.oreDiamond ? (par1Block == Block.oreEmerald ? this.toolMaterial.getHarvestLevel() >= 2 : (par1Block != Block.blockGold && par1Block != Block.oreGold ? (par1Block != Block.blockSteel && par1Block != Block.oreIron ? (par1Block != Block.blockLapis && par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone && par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true : par1Block.blockMaterial == Material.iron) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2)) : this.toolMaterial.getHarvestLevel() >= 2);
    }
 
 public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
  if(par2Block.blockID == Block.obsidian.blockID)
  {
   return 8F;
  }
  else
   return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }


}


