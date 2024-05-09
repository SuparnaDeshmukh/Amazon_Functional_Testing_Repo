package ProductPomTest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductPom.ProductSpecification;
import pom.SelectingGetItTodayCheckbox;

public class VerifyProductSpecification {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		SelectingGetItTodayCheckbox obj = new SelectingGetItTodayCheckbox(driver);

		obj.sendToSearchBox("laptop");
        
		obj.clickOnSearchButton();
       Thread.sleep(2000);
		ProductSpecification obj1=(ProductSpecification)driver; 
        
		obj1.clickOnlaptop();
		
		
	}
}
