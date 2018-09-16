/**
 * Copyright (c) 2018 Gregorius Techneticies
 *
 * This file is part of GregTech.
 *
 * GregTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GregTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GregTech. If not, see <http://www.gnu.org/licenses/>.
 */

package gregtech.loaders.c;

import static gregapi.data.CS.*;

import java.util.List;

import gregapi.block.metatype.BlockMetaType;
import gregapi.data.ANY;
import gregapi.data.CS.BlocksGT;
import gregapi.data.FL;
import gregapi.data.IL;
import gregapi.data.MT;
import gregapi.data.OP;
import gregapi.data.RM;
import gregapi.recipes.GT_ModHandler;
import gregapi.util.CR;
import gregapi.util.OM;
import gregapi.util.ST;
import gregapi.util.UT;
import gregapi.wooddict.BeamEntry;
import gregapi.wooddict.PlankEntry;
import gregapi.wooddict.WoodDictionary;
import gregapi.wooddict.WoodEntry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class Loader_Recipes_Woods implements Runnable {
	public static FL[] OILS = {FL.Oil_Seed, FL.Oil_Lin, FL.Oil_Hemp, FL.Oil_Nut, FL.Oil_Olive, FL.Oil_Sunflower, FL.Oil_Creosote};
	
	@Override public void run() {OUT.println("GT_Mod: Doing Recipes for Woods.");
		for (int i = 0; i <  4; i++) {
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.Log1 , 1, i), ST.make(BlocksGT.Log1FireProof , 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.LogA , 1, i), ST.make(BlocksGT.LogAFireProof , 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.LogB , 1, i), ST.make(BlocksGT.LogBFireProof , 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.Beam1, 1, i), ST.make(BlocksGT.Beam1FireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.Beam2, 1, i), ST.make(BlocksGT.Beam2FireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.Beam3, 1, i), ST.make(BlocksGT.Beam3FireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.BeamA, 1, i), ST.make(BlocksGT.BeamAFireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.plate.mat(MT.WaxRefractory, 6), ST.make(BlocksGT.BeamB, 1, i), ST.make(BlocksGT.BeamBFireProof, 1, i));
		
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.Log1 , 1, i), ST.make(BlocksGT.Log1FireProof , 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.LogA , 1, i), ST.make(BlocksGT.LogAFireProof , 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.LogB , 1, i), ST.make(BlocksGT.LogBFireProof , 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.Beam1, 1, i), ST.make(BlocksGT.Beam1FireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.Beam2, 1, i), ST.make(BlocksGT.Beam2FireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.Beam3, 1, i), ST.make(BlocksGT.Beam3FireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.BeamA, 1, i), ST.make(BlocksGT.BeamAFireProof, 1, i));
		RM.Laminator    .addRecipe2(T, 16,  192, OP.foil.mat(MT.WaxRefractory, 24), ST.make(BlocksGT.BeamB, 1, i), ST.make(BlocksGT.BeamBFireProof, 1, i));
		
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.Log1 , 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.Log1FireProof , 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.LogA , 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.LogAFireProof , 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.LogB , 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.LogBFireProof , 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.Beam1, 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.Beam1FireProof, 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.Beam2, 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.Beam2FireProof, 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.Beam3, 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.Beam3FireProof, 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.BeamA, 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.BeamAFireProof, 1, i));
		RM.Bath         .addRecipe1(T,  0,  192, ST.make(BlocksGT.BeamB, 1, i), FL.Potion_FireResistance_1L.make(300), NF, ST.make(BlocksGT.BeamBFireProof, 1, i));
		}
		for (int i = 0; i < 16; i++) {
		RM.Laminator    .addRecipe2(T, 16,   32, OP.plate.mat(MT.WaxRefractory, 1), ST.make(BlocksGT.Planks                             , 1, i), ST.make(BlocksGT.PlanksFireProof                           , 1, i));
		RM.Laminator    .addRecipe2(T, 16,   32, OP.plate.mat(MT.WaxRefractory, 1), ST.make(((BlockMetaType)BlocksGT.Planks).mSlabs[0]  , 2, i), ST.make(((BlockMetaType)BlocksGT.PlanksFireProof).mSlabs[0], 2, i));
		
		RM.Laminator    .addRecipe2(T, 16,   32, OP.foil.mat(MT.WaxRefractory,  4), ST.make(BlocksGT.Planks                             , 1, i), ST.make(BlocksGT.PlanksFireProof                           , 1, i));
		RM.Laminator    .addRecipe2(T, 16,   16, OP.foil.mat(MT.WaxRefractory,  2), ST.make(((BlockMetaType)BlocksGT.Planks).mSlabs[0]  , 1, i), ST.make(((BlockMetaType)BlocksGT.PlanksFireProof).mSlabs[0], 1, i));
		
		RM.Bath         .addRecipe1(T,  0,   32, ST.make(BlocksGT.Planks                            , 1, i), FL.Potion_FireResistance_1L.make(50), NF, ST.make(BlocksGT.PlanksFireProof                             , 1, i));
		RM.Bath         .addRecipe1(T,  0,   16, ST.make(((BlockMetaType)BlocksGT.Planks).mSlabs[0] , 1, i), FL.Potion_FireResistance_1L.make(25), NF, ST.make(((BlockMetaType)BlocksGT.PlanksFireProof).mSlabs[0]  , 1, i));
		}
		
		if (IL.IE_Treated_Slab.exists())
		RM.Bath.addRecipe1(T, 0, 16, IL.IE_Treated_Slab  .get(1), FL.Oil_Creosote.make(250), NF, IL.RC_Tie_Wood.get(1));
		RM.Bath.addRecipe1(T, 0, 16, IL.Treated_Plank_Slab.get(1), FL.Oil_Creosote.make(250), NF, IL.RC_Tie_Wood.get(1));
		
		
		for (WoodEntry aEntry : WoodDictionary.WOODS.values()) {
			if (aEntry.mBeamEntry != null)
			RM.debarking(16, 64,               aEntry.mLog, ST.validMeta(1, aEntry.mBeamEntry.mBeam), aEntry.mBark);
			RM.pulverizing(                    aEntry.mLog, OP.dust.mat(aEntry.mMaterialWood, aEntry.mPlankCountBuzz), aEntry.mBark, 50, F);
			RM.sawing(16, 128, F, 4,           aEntry.mLog, ST.validMeta(aEntry.mPlankCountBuzz, aEntry.mPlankEntry.mPlank), aEntry.mBark);
			GT_ModHandler.addSawmillRecipe(    aEntry.mLog, ST.validMeta(aEntry.mPlankCountBuzz, aEntry.mPlankEntry.mPlank), aEntry.mBark);
			RM.CokeOven.addRecipe1(T, 0, 3600, aEntry.mLog, NF, FL.Oil_Creosote.make(aEntry.mCreosoteAmount), aEntry.mCharcoalCount < 1 ? NI : OP.gem.mat(MT.Charcoal, aEntry.mCharcoalCount));
			RM.Lathe.addRecipe1(T, 16, 80,     aEntry.mLog, ST.validMeta(aEntry.mStickCountLathe, aEntry.mStick), OM.dust(aEntry.mMaterialWood));
			if (IL.RC_Creosote_Wood.exists())
			RM.Bath.addRecipe1(T, 0, 16,       aEntry.mLog, FL.Oil_Creosote.make(1000), NF, IL.RC_Creosote_Wood.get(1));
			
			
			CR.remove(ST.validMeta(1, aEntry.mLog));
			CR.shaped   (ST.validMeta(NERFED_WOOD?aEntry.mStickCountSaw :aEntry.mStickCountLathe, aEntry.mStick            ), CR.DEF_NAC_NCC, "sLf", 'L', aEntry.mLog);
			CR.shaped   (ST.validMeta(NERFED_WOOD?aEntry.mPlankCountSaw :aEntry.mPlankCountBuzz , aEntry.mPlankEntry.mPlank), CR.DEF_NAC_NCC, "s", "L", 'L', aEntry.mLog);
			CR.shapeless(ST.validMeta(NERFED_WOOD?aEntry.mPlankCountHand:aEntry.mPlankCountSaw  , aEntry.mPlankEntry.mPlank), CR.DEF_NAC_NCC, new Object[] {aEntry.mLog});
		}
		for (BeamEntry aEntry : WoodDictionary.BEAMS.values()) {
			RM.generify(                       aEntry.mBeam, IL.Beam.get(1));
			RM.pulverizing(                    aEntry.mBeam, OP.dust.mat(aEntry.mMaterialBeam, aEntry.mPlankCountBuzz));
			RM.sawing(16, 128, F, 4,           aEntry.mBeam, ST.validMeta(aEntry.mPlankCountBuzz, aEntry.mPlankEntry.mPlank), OM.dust(aEntry.mMaterialBeam));
			GT_ModHandler.addSawmillRecipe(    aEntry.mBeam, ST.validMeta(aEntry.mPlankCountBuzz, aEntry.mPlankEntry.mPlank), OM.dust(aEntry.mMaterialBeam));
			RM.CokeOven.addRecipe1(T, 0, 3600, aEntry.mBeam, NF, FL.Oil_Creosote.make(aEntry.mCreosoteAmount), aEntry.mCharcoalCount < 1 ? NI : OP.gem.mat(MT.Charcoal, aEntry.mCharcoalCount));
			RM.Lathe.addRecipe1(T, 16, 80,     aEntry.mBeam, ST.validMeta(aEntry.mStickCountLathe, aEntry.mStick), OM.dust(aEntry.mMaterialBeam));
			
			CR.shaped   (ST.validMeta(NERFED_WOOD?aEntry.mStickCountSaw :aEntry.mStickCountLathe, aEntry.mStick            ), CR.DEF_NAC_NCC, "sBf", 'B', aEntry.mBeam);
			CR.shaped   (ST.validMeta(NERFED_WOOD?aEntry.mPlankCountSaw :aEntry.mPlankCountBuzz , aEntry.mPlankEntry.mPlank), CR.DEF_NAC_NCC, "s", "B", 'B', aEntry.mBeam);
			CR.shapeless(ST.validMeta(NERFED_WOOD?aEntry.mPlankCountHand:aEntry.mPlankCountSaw  , aEntry.mPlankEntry.mPlank), CR.DEF_NAC_NCC, new Object[] {aEntry.mBeam});
		}
		for (PlankEntry aEntry : WoodDictionary.PLANKS.values()) {
			ItemStack aPlank = ST.validMeta_(1, aEntry.mPlank);
			RM.generify(aEntry.mPlank, IL.Plank.get(1));
			RM.pulverizing(aEntry.mPlank, OP.dust.mat(aEntry.mMaterialPlank, 1));
			if (ANY.WoodUntreated.mToThis.contains(aEntry.mMaterialPlank)) {
				if (IL.MaCu_Polished_Planks.exists())
				RM.Bath.addRecipe1(T, 0, 144, aEntry.mPlank, FL.Oil_Fish.make(1000), NF, IL.MaCu_Polished_Planks.get(1));
				
				ItemStack
				tTreated = IL.IE_Treated_Planks.get(1, IL.Treated_Plank.get(1));
				for (FL tFluid : OILS)
				RM.Bath.addRecipe1(T, 0, 144, aEntry.mPlank, tFluid.make(100), NF, tTreated);
				
				if (ST.valid(aEntry.mStair) && IL.IE_Treated_Stairs.exists()) {
				tTreated = IL.IE_Treated_Stairs.get(1);
				for (FL tFluid : OILS)
				RM.Bath.addRecipe1(T, 0, 102, aEntry.mStair, tFluid.make( 75), NF, tTreated);
				}
				if (ST.valid(aEntry.mSlab)) {
				tTreated = IL.IE_Treated_Slab.get(1, IL.Treated_Plank_Slab.get(1));
				for (FL tFluid : OILS)
				RM.Bath.addRecipe1(T, 0,  72, aEntry.mSlab , tFluid.make( 50), NF, tTreated);
				}
				
				if (IL.ERE_White_Plank.exists() && !IL.ERE_White_Plank.equal(aEntry.mPlank, F, T)) {
					tTreated = IL.ERE_White_Plank.get(1);
					for (List<FluidStack> tDyes : DYE_FLUIDS) for (FluidStack tFluid : tDyes)
					RM.Bath.addRecipe1(T, 0, 144, aEntry.mPlank, tFluid, NF, tTreated);
					
					if (ST.valid(aEntry.mStair) && IL.ERE_White_Stairs.exists()) {
					tTreated = IL.ERE_White_Stairs.get(1);
					for (List<FluidStack> tDyes : DYE_FLUIDS) for (FluidStack tFluid : tDyes)
					RM.Bath.addRecipe1(T, 0, 102, aEntry.mStair, UT.Fluids.mul(tFluid, 3, 4, T), NF, tTreated);
					}
					if (ST.valid(aEntry.mSlab) && IL.ERE_White_Slab.exists()) {
					tTreated = IL.ERE_White_Slab.get(1);
					for (List<FluidStack> tDyes : DYE_FLUIDS) for (FluidStack tFluid : tDyes)
					RM.Bath.addRecipe1(T, 0,  72, aEntry.mSlab , UT.Fluids.mul(tFluid, 1, 2, T), NF, tTreated);
					}
				}
			}
			if (ST.valid(aEntry.mSlab)) {
				CR.remove(aPlank, aPlank, aPlank);
				CR.shaped(ST.validMeta_(2, aEntry.mSlab), CR.DEF_NAC_NCC_MIR, "sP", 'P', aEntry.mPlank);
				RM.sawing(16, 72, F, 3, aEntry.mPlank, ST.validMeta_(2, aEntry.mSlab));
				GT_ModHandler.addSawmillRecipe(aEntry.mPlank, ST.validMeta_(2, aEntry.mSlab), NI);
			}
			if (ST.valid(aEntry.mStair)) {
				CR.remove(NI, NI, aPlank, NI, aPlank, aPlank, aPlank, aPlank, aPlank);
				CR.remove(aPlank, NI, NI, aPlank, aPlank, NI, aPlank, aPlank, aPlank);
				if (ST.valid(aEntry.mSlab)) {
					CR.shaped(ST.validMeta_(1, aEntry.mSlab), CR.DEF_NCC_MIR, "sP", 'P', aEntry.mStair);
					CR.shaped(ST.validMeta_(2, aEntry.mStair), CR.DEF_NCC_MIR, "sP", "PP", 'P', aEntry.mSlab);
				}
				CR.shaped(ST.validMeta_(4, aEntry.mStair), CR.DEF_NCC_MIR, "sP", "PP", 'P', aEntry.mPlank);
			}
			if (ST.valid(aEntry.mStick)) {
				RM.Lathe.addRecipe1(T, 16, 16, aEntry.mPlank, ST.validMeta_(aEntry.mStickCountLathe, aEntry.mStick));
				CR.remove(aPlank, NI, NI, aPlank);
				CR.shaped(ST.validMeta_((NERFED_WOOD?aEntry.mStickCountHand:aEntry.mStickCountSaw)*2, aEntry.mStick), CR.DEF_NAC_NCC, "P", "P", 'P', aEntry.mPlank);
				CR.shaped(ST.validMeta_( NERFED_WOOD?aEntry.mStickCountSaw :aEntry.mStickCountLathe , aEntry.mStick), CR.DEF_NAC_NCC, "s", "P", 'P', aEntry.mPlank);
			}
			if (!IL.Crate.equal(aEntry.mPlank, F, T) && !IL.Crate_Fireproof.equal(aEntry.mPlank, F, T)) {
			RM.Boxinator.addRecipe2(T, 16, 16, ST.amount(16, aEntry.mPlank), IL.Crate.get(1), OP.crateGtPlate.mat(aEntry.mMaterialPlank, 1));
			RM.Boxinator.addRecipe2(T, 16, 16, ST.amount(16, aEntry.mPlank), IL.Crate_Fireproof.get(1), OP.crateGtPlate.mat(aEntry.mMaterialPlank, 1));
			}
			RM.Boxinator.addRecipe2(T, 16, 16, ST.amount( 9, aEntry.mPlank), ST.tag(9), OP.blockPlate.mat(aEntry.mMaterialPlank, 1));
//          RM.CNC.addRecipe2(T, 16, 64, ST.amount(4, aEntry.mPlank), NI, OP.gearGt.mat(aEntry.mMaterialPlank, 1));
		}
	}
}
