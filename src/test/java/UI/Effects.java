package UI;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.IOException;
import org.sikuli.script.*;

public class Effects {
	
	public Screen s;
	Process process;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setUp() throws IOException, InterruptedException 
	{
		s = new Screen();
		s.type("r", KeyModifier.KEY_CMD);
		s.type("C:\\Users\\nbhushan\\Desktop\\SikuliFramework_PRE2019\\BatFiles\\Kill_PRE_App.bat");
		s.type(Key.ENTER);
		Thread.sleep(2000);
		
		s.type("r", KeyModifier.KEY_CMD);
		s.type("C:\\Users\\nbhushan\\Desktop\\SikuliFramework_PRE2019\\BatFiles\\Clear_PRE_Cache.bat");
		s.type(Key.ENTER);
		Thread.sleep(2000);

		s.type("r", KeyModifier.KEY_CMD);
		s.type("C:\\Program Files\\Adobe\\Adobe Premiere Elements 2019\\PremiereElementsEditor.exe");
		s.type(Key.ENTER);
		Thread.sleep(2000);
		
		int timer = 0;
		while(s.exists("imgs/Button_GoalScreen_CloseGoalScreen.png")==null && timer<=20)
		{
			Thread.sleep(5000);
			++timer;
			System.out.println("Waited 5 more seconds.");
		}
	}

	@Test
	public void TestEffects() throws FindFailed {

		s.wait("imgs/Button_GoalScreen_CloseGoalScreen.png");
		s.click("imgs/Button_GoalScreen_CloseGoalScreen.png");
		s.wait("imgs/BaselineIMG_PREMenuBar.png");

		s.click("imgs/Button_ExpertRoom.png");         
		s.wait("imgs/BaselineIMG_ExportButtonInExpert.png");
		s.wait("imgs/Button_RHSPanels_Effects.png");

		s.click("imgs/Button_RHSPanels_Effects.png");
		s.wait("imgs/DropDown_EffectsPanel_AllCategories.png");
		s.click("imgs/DropDown_EffectsPanel_AllCategories.png");
		Assert.assertTrue(s.exists("imgs/BaselineIMG_Effects_AllCategories.png")!=null);

		s.click("imgs/Effects_Category_AdvancedAdjustments.png");
		s.click("imgs/Button_EffectCategories_Next.png");
		s.click("imgs/Button_EffectCategories_Back.png");
		Assert.assertTrue(s.exists("imgs/Effects_Category_AdvancedAdjustments_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Category_BlurSharpen_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Category_Channel_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_ColorCorrection_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Distort_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Generate_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_ImageControl_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Keying_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_NewBlueArtEffects_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_NewBlueCartoonrPlus_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_NewBlueFilmLooks_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Perspective_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Pixelate_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Render_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Stylize_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Time_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_Transform_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		Assert.assertTrue(s.exists("imgs/Effects_Categories_VideoMerge_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
		s.click("imgs/Button_EffectCategories_Next.png");

		Assert.assertTrue(s.exists("imgs/Effects_Categories_HollywoodLooks_items.png")!=null);

		s.click("imgs/Button_EffectCategories_Next.png");
	}

	@SuppressWarnings("deprecation")
	@AfterTest
	public void tearDown() throws IOException, InterruptedException 
	{

		s.type("r", KeyModifier.KEY_CMD);
		s.type("C:\\Users\\nbhushan\\Desktop\\SikuliFramework_PRE2019\\BatFiles\\Kill_PRE_App.bat");
		s.type(Key.ENTER);
		
	}

}

