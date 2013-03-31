package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class itemflarite extends Item {

 String itemflarite;

 public itemflarite(int id, String itemflarite) {
  super(id);
  setCreativeTab(CreativeTabs.tabMaterials);
  this.itemflarite = itemflarite;
 }


 public void updateIcons(IconRegister iconRegister) {
  iconIndex = iconRegister.registerIcon("fancyblocks:" + itemflarite);
 }

}
