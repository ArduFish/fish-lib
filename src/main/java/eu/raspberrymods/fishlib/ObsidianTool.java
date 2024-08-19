package eu.raspberrymods.fishlib;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

//import net.minecraft.*;
public class ObsidianTool implements ToolMaterial {
	// Your IDE should override the interface's methods for you, or at least shout at you to do so.
    @Override
    public int getDurability() {
	    return 3400;
    }
    @Override
    public float getMiningSpeedMultiplier() {
	    return 1.0F;
    }
    @Override
    public TagKey<Block> getInverseTag() {
	    return BlockTags.INCORRECT_FOR_WOODEN_TOOL;
    }
    @Override
    public int getEnchantability() {
	    return 22;
    }
    @Override
    public Ingredient getRepairIngredient() {
    	return Ingredient.ofItems(Items.OBSIDIAN);
    }
    @Override
    public float getAttackDamage() {
        return 15F;
    }
    public static final ObsidianTool INSTANCE = new ObsidianTool();
}