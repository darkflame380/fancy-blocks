package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class itemamethyst extends Item {

 String itemamethyst;

 public itemamethyst(int id, String itemamethyst) {
  super(id);
  setCreativeTab(CreativeTabs.tabMaterials);
  this.itemamethyst = itemamethyst;
 }


 public void updateIcons(IconRegister iconRegister) {
  iconIndex = iconRegister.registerIcon("fancyblocks:" + itemamethyst);
 }

}
