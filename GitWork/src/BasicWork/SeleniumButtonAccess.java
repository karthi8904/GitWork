package BasicWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumButtonAccess {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabari\\Downloads\\chromedriver_win32\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
			//Goals
				// Find position of button (x,y)	
				// Find button color
				// Find the height and width
				//	Click button to travel home page
//		Here We USE POIT Class for identify the Size  
		
//		 Find position of button (x,y)
		
		WebElement  GetPosition =driver.findElement(By.id("position"));
		Point xypoint = GetPosition.getLocation();
		int xpoint=  xypoint.getX();
		int ypoint = xypoint.getY();
		System.out.println("xpoint Position is:"+ xypoint + "ypoint Position is:"+ ypoint );

//		Find button color
		
		WebElement ColorButton =driver.findElement(By.id("color"));
		String color = ColorButton.getCssValue("background-color");
		System.out.println("Button Color is: "+ color);
		
	// Find the height and width
		WebElement  ButtonSize = driver.findElement(By.id("size"));
		int height = ButtonSize.getSize().getHeight();
		int width  = ButtonSize.getSize().getWidth();
		System.out.println("Button Height is: "+ height +"Button width is: " + width);
		
//		Click button to travel home page
		WebElement ClickThisButton = driver.findElement(By.id("home"));
		ClickThisButton.click();
		
	//Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver.
	//The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html
		

		}
}
