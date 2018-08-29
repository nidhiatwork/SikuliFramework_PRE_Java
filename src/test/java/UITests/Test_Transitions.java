package UITests;
import org.testng.Assert;
import org.testng.annotations.*;
import Utils.TestNGRunner;
import org.sikuli.script.*;

public class Test_Transitions extends TestNGRunner{

	@Test
	public void TestTransitions() {

		try {

			screen.wait("imgs/Button_GoalScreen_CloseGoalScreen.png");
			screen.click("imgs/Button_GoalScreen_CloseGoalScreen.png");
			screen.wait("imgs/BaselineIMG_PREMenuBar.png");
			screen.click("imgs/Button_ExpertRoom.png");
			screen.wait("imgs/BaselineIMG_ExportButtonInExpert.png");
			screen.wait(2f);

			screen.click("imgs/Button_RHSPanels_Transitions.png");
			Assert.assertTrue(screen.exists("imgs/DropDown_TransitionssPanel_AllCategories.png")!=null);
			screen.click("imgs/DropDown_TransitionssPanel_AllCategories.png");
			Assert.assertTrue(screen.exists("imgs/BaselineIMG_Transitions_AllCategories.png")!=null);        
			screen.click("imgs/Transition_Category_3DMotion.png");       
			Assert.assertTrue(screen.exists("imgs/Transition_Category_3DMotion_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Dissolve_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");        
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Iris_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");   
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Map_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_NewBlue3DExplosion_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_NewBlue3DTransformations_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_NewBlue_ArtBlends_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_NewBlue_MotionBlends_items.png")!=null);
			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_PagePeel_items.png")!=null);

			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_PictureWipes_items.png")!=null);

			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Slide_items.png")!=null);

			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_SpecialEffects_items.png")!=null);

			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");              
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Stretch_items.png")!=null);

			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");   
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Wipe_items.png")!=null);

			screen.click("imgs/Transition_Category_Next.png");
			screen.click("imgs/NonClickable_TransitionsPanel_EffectsText.png");
			Assert.assertTrue(screen.exists("imgs/Transition_Category_Zoom_items.png")!=null);

		} catch (FindFailed FF)
		{
			System.out.println("Exception occurred while finding image on screen:\n" + FF.getMessage());
		}
	}
}
