package UI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.testng.TestNG;
import org.testng.annotations.*;
import Utils.Constants;

public class TestNGRunner {

	public Screen screen;
	public Constants constants;

	int image_timeout = 60;

	@BeforeTest
	public void setUp()
	{
		constants = new Constants();
		screen = new Screen();
		screen.type("r", Key.CMD);
		screen.type("C:\\Users\\nbhushan\\Desktop\\SikuliFramework_PRE2019\\BatFiles\\Kill_PRE_App.bat");
		screen.type(Key.ENTER);
		screen.wait(3f);

		screen.type("r", Key.CMD);
		screen.type("C:\\Users\\nbhushan\\Desktop\\SikuliFramework_PRE2019\\BatFiles\\Clear_PRE_Cache.bat");
		screen.type(Key.ENTER);
		screen.wait(3f);

		screen.type("r", Key.CMD);
		screen.type("C:\\Program Files\\Adobe\\Adobe Premiere Elements 2019\\PremiereElementsEditor.exe");
		screen.type(Key.ENTER);
		screen.wait(3f);

		int timer = 0;
		while(screen.exists("imgs/Button_GoalScreen_CloseGoalScreen.png", image_timeout)==null && timer<=20)
		{
			System.out.println("Launched PRE application successfully.");
		}
	}

	public static void main(String[] args) {

		// Create object of TestNG Class
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("testng.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	}

	@AfterTest
	public void tearDown() throws IOException, InterruptedException 
	{
		screen.type("r", Key.CMD);
		screen.type("C:\\Users\\nbhushan\\Desktop\\SikuliFramework_PRE2019\\BatFiles\\Kill_PRE_App.bat");
		screen.type(Key.ENTER);
	}
}