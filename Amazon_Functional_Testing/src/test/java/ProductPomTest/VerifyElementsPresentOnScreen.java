package ProductPomTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductPom.ElementsPresentOnScreen;

public class  VerifyElementsPresentOnScreen
{//THIS TEST CASE IS PASSED!!!!!!HURREYYYYYYY
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
       
       ElementsPresentOnScreen eps= new  ElementsPresentOnScreen(driver);
       
       eps.checkAutoSuggestion("mobile");
       
       eps.clickOnSearchButton();
       
     
	}
	
}


