package Integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Beauty_001 {
	
	@Test
	public void toLunchlakme()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com");
		
		driver.quit();

}
}



