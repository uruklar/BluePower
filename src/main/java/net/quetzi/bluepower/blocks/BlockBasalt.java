package net.quetzi.bluepower.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.quetzi.bluepower.init.Blocks;
import net.quetzi.bluepower.references.Refs;

public class BlockBasalt extends Block {
    public BlockBasalt() {
        super(Material.rock);
        this.textureName = Refs.BASALT_TEXTURE_NAME;
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
    }

    public Item getItemDropped(int par1, Random par2, int par3) {
        return Item.getItemFromBlock(Blocks.basalt_cobble);
    }
    
    public void registerBlockIcon(IIconRegister iconRegister) {
        iconRegister.registerIcon("bluepower:" + Refs.BASALT_TEXTURE_NAME);
    }
}
