package UITests;

import org.testng.Assert;
import org.testng.annotations.*;
import Utils.TestNGRunner;
import org.sikuli.script.*;

public class Test_Effects extends TestNGRunner{

	@Test
	public void TestEffects() {

		try {

			screen.wait("imgs/Button_GoalScreen_CloseGoalScreen.png", constants.image_timeout);
			screen.click("imgs/Button_GoalScreen_CloseGoalScreen.png");
			screen.wait("imgs/BaselineIMG_PREMenuBar.png", constants.image_timeout);

			screen.click("imgs/Button_ExpertRoom.png");         
			screen.wait("imgs/BaselineIMG_ExportButtonInExpert.png", constants.image_timeout);
			screen.wait("imgs/Button_RHSPanels_Effects.png", constants.image_timeout);

			screen.click("imgs/Button_RHSPanels_Effects.png");
			screen.wait("imgs/DropDown_EffectsPanel_AllCategories.png", constants.image_timeout);
			screen.click("imgs/DropDown_EffectsPanel_AllCategories.png", constants.image_timeout);
			Assert.assertTrue(screen.exists("imgs/BaselineIMG_Effects_AllCategories.png")!=null);

			screen.click("imgs/Effects_Category_AdvancedAdjustments.png");
			screen.click("imgs/Button_EffectCategories_Next.png");
			screen.click("imgs/Button_EffectCategories_Back.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Category_AdvancedAdjustments_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Category_BlurSharpen_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Category_Channel_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_ColorCorrection_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Distort_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Generate_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_ImageControl_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Keying_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_NewBlueArtEffects_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_NewBlueCartoonrPlus_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_NewBlueFilmLooks_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Perspective_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Pixelate_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Render_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Stylize_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Time_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_Transform_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			Assert.assertTrue(screen.exists("imgs/Effects_Categories_VideoMerge_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			screen.click("imgs/Button_EffectCategories_Next.png");

			Assert.assertTrue(screen.exists("imgs/Effects_Categories_HollywoodLooks_items.png")!=null);

			screen.click("imgs/Button_EffectCategories_Next.png");
			
		} catch(FindFailed FF)
		{
			System.out.println("Exception occurred while finding image on screen:\n" + FF.getMessage());
		}

	}
}

