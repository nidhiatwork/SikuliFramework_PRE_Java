package UITests;

import org.testng.Assert;
import org.testng.annotations.*;
import Utils.TestNGRunner;
import org.sikuli.script.*;

public class Test_GE_GlassPane extends TestNGRunner{

	@Test
	public void TestGlassPane() {

		try {

			screen.wait("imgs/Button_GoalScreen_CloseGoalScreen.png", constants.image_timeout);
			screen.click("imgs/Button_GoalScreen_CloseGoalScreen.png");
			screen.wait("imgs/BaselineIMG_PREMenuBar.png", constants.image_timeout);

			screen.click("imgs/Button_GuidedRoom.png");
	        screen.wait("imgs/Button_GuidedRoom_Active.png", constants.image_timeout);   
	        screen.click("imgs/Button_Guided_FunEdits.png");
	        screen.wait("imgs/BaselineIMG_GlassPane_Placeholder.png", constants.image_timeout);
	        screen.click("imgs/BaselineIMG_GlassPane_Placeholder.png");
	        
	        screen.wait("imgs/GlassPane_Step1_GlassPane.png", constants.image_timeout);
	        screen.click("imgs/Button_GE_Next.png");
	        screen.wait("imgs/BaselineIMG_GE_AddMediaHighlighted.png", constants.image_timeout);
	        screen.wait("imgs/GlassPane_Step2_GetStarted.png");
	        screen.click("imgs/Button_GE_Next.png");        
	        screen.wait("imgs/GlassPane_Step3_AddMedia.png", constants.image_timeout);       
	        screen.wait("imgs/BaselineIMG_AddMediaOptions.png");
	        screen.click("imgs/Dropdown_AddMedia_FilesAndFolders.png");
	        screen.wait("imgs/TextBox_ImportMediaPath.png", constants.image_timeout);               
	        screen.click("imgs/TextBox_ImportMediaPath.png"); 
	        screen.type(constants.TestDataFile_path);
	        screen.type(Key.ENTER);
	        screen.wait("imgs/GlassPane_Step4_ProjectAssets.png", constants.image_timeout);       
	        screen.dragDrop("imgs/GlassPane_GE_MediaFile_Track1.png", "imgs/VideoTrack1.png");
	        screen.wait("imgs/GlassPane_Step5_AddMediaToTimeline.png");        
	        screen.dragDrop("imgs/ProjectAssets_MediaFile_active.png", "imgs/VideoTrack2.png");        
	        screen.wait("imgs/GlassPane_Step6_AddOverlay_1.png", constants.image_timeout);
	        screen.wait(3f);
	        screen.click("imgs/Button_GE_Next.png");        
	        screen.wait("imgs/GlassPane_Step6_AddOverlay_2.png");
	        screen.wait("imgs/BaselineIMG_GE_MatteOverlaysHighlighted.png", constants.image_timeout);
	        screen.dragDrop("imgs/MatteOverlay01.png", "imgs/AudioTrack3.png");
	        screen.wait("imgs/BaselineIMG_GE_MatteOverlaysHighlighted.png", constants.image_timeout);
	        screen.wait(3f);
	        screen.wait("imgs/Button_GE_Next.png");
	        screen.wait(3f);
	        screen.click("imgs/Button_GE_Next.png");  
	        screen.wait("imgs/GlassPane_Step7_TrackMatteEffect_1.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_EffectsHighlighted.png", constants.image_timeout);
	        screen.click("imgs/BaselineIMG_EffectsHighlighted.png");
	        screen.wait("imgs/GlassPane_Step7_TrackMatteEffect_2.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_TrackMatteEffectHighlighted.png", constants.image_timeout);
	        screen.dragDrop("imgs/BaselineIMG_TrackMatteEffectHighlighted.png", "imgs/VideoTrack2_DropAreaForTrackMatte.png");
	        screen.wait("imgs/GlassPane_Step7_TrackMatteEffect_3.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_TrackMatteKey_paramsHighlighted.png", constants.image_timeout);
	        screen.click("imgs/DropDown_TrackMatte_None.png");
	        screen.click("imgs/DropDown_Matte_Video3Option.png");
	        screen.wait("imgs/GlassPane_Step7_TrackMatteEffect_3.png", constants.image_timeout);        
	        screen.click("imgs/DropDown_TrackMatte_ComositeUsing.png");
	        screen.click("imgs/DropDown_ComositeUsing_MatteLumaOption.png");
	        screen.wait("imgs/GlassPane_Step7_TrackMatteEffect_4.png", constants.image_timeout);
	        screen.wait(3f);
	        screen.click("imgs/Button_GE_Next.png");
	        screen.wait("imgs/GlassPane_Step8_AddBlurEffect_1.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_EffectsHighlighted.png", constants.image_timeout);
	        screen.click("imgs/BaselineIMG_EffectsHighlighted.png");        
	        screen.wait("imgs/GlassPane_Step8_AddBlurEffect_2.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_FastBlurHighlighted.png", constants.image_timeout);
	        screen.dragDrop("imgs/BaselineIMG_FastBlurHighlighted.png", "imgs/BaselineIMG_Media_VideoTrack1.png");
	        screen.wait("imgs/GlassPane_Step8_AddBlurEffect_3.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_FastBlur_ParamsHighlighted.png", constants.image_timeout);
	        screen.wait(3f);
	        screen.click("imgs/Button_GE_Next.png");                
	        screen.wait("imgs/GlassPane_Step9_AddAdjustments_1.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_AdjustmentHighlighted.png", constants.image_timeout);
	        screen.click("imgs/BaselineIMG_AdjustmentHighlighted.png");        
	        screen.wait("imgs/GlassPane_Step9_AddAdjustments_2.png", constants.image_timeout);
	        screen.wait("imgs/BaselineIMG_Temperature-TintHighlighted.png", constants.image_timeout);
	        screen.click("imgs/BaselineIMG_Temperature-TintHighlighted.png");   
	        screen.wait("imgs/BaselineIMG_TemperatureTint_Presets.png", constants.image_timeout);
	        screen.wait("imgs/GlassPane_Step9_AddAdjustments_3.png", constants.image_timeout);
	        screen.click("imgs/Preset_TemperatureTint.png");
	        screen.wait("imgs/GlassPane_Step9_AddAdjustments_4.png", constants.image_timeout);
	        screen.wait(3f);
	        screen.click("imgs/Button_GE_Next.png");                        
	        Assert.assertTrue(screen.exists("imgs/GlassPane_Step10_Done.png")!=null);
	        screen.click("imgs/Button_GlassPane_Done.png");
	        
		} catch (FindFailed FF)
		{
			System.out.println("Exception occurred while finding image on screen:\n" + FF.getMessage());
		}
	}
}
