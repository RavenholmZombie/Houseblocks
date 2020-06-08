package ravenholmzombie.houseblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockYellowOut extends Block {

	protected BlockYellowOut(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
	public IIcon[] icons = new IIcon[6];

	@Override public IIcon getIcon(int side, int meta)
	{
	    return side != meta ? icons[1] : icons[2];
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i++) {
	        icons[1] = reg.registerIcon("houseblocks:drywall");
	    }
	    icons[2] = reg.registerIcon("houseblocks:wallPanel_yellow");
	}
		
	@Override public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
	    int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

	    if (l == 0)
	    {
	        par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
	    }
	    
	    if (l == 1)
	    {
	        par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
	    }

	    if (l == 2)
	    {
	        par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
	    }

	    if (l == 3)
	    {
	        par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
	    }

	}

}
