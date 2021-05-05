package gregtech.common.tileentities.storage;

import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.objects.GT_RenderedGlowTexture;
import gregtech.api.objects.GT_RenderedTexture;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.ArrayList;
import java.util.Collection;

import static gregtech.api.enums.Textures.BlockIcons.MACHINE_CASINGS;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_SCHEST;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_SCHEST_GLOW;

public class GT_MetaTileEntity_SuperChest extends GT_MetaTileEntity_DigitalChestBase {
    public int mItemCount = 0;
    public ItemStack mItemStack = null;

    public GT_MetaTileEntity_SuperChest(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier);
    }

    public GT_MetaTileEntity_SuperChest(String aName, int aTier, String aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures);
    }

    public GT_MetaTileEntity_SuperChest(String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures);
    }

    @Override
    protected ItemStack getItemStack() {
        return mItemStack;
    }

    @Override
    protected void setItemStack(ItemStack s) {
        mItemStack = s;
    }

    @Override
    protected int getItemCount() {
        return mItemCount;
    }

    @Override
    public void setItemCount(int aCount) {
        mItemCount = aCount;
    }

    @Override
    protected String chestName() {
        return "Super Chest";
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_SuperChest(mName, mTier, mDescriptionArray, mTextures);
    }
}
