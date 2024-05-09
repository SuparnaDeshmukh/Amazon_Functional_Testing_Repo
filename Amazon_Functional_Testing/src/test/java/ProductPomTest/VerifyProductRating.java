package ProductPomTest;



	
	import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import ProductPom.ProductRating;




	public class VerifyProductRating {
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			

			ProductRating rt=new  ProductRating(driver);
			rt.PasstheDataintoSearchTab("Mobile phones");
			rt.ClickonSearchButton();

			rt.ClickonMobile();
			
			//Rating2 ratin2=new Rating2(driver);
			
			List<String> list=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(list.get(1));
			rt.clickonRatingOfProuct();
		    System.out.println("Rating is displayed");

			
}

}

