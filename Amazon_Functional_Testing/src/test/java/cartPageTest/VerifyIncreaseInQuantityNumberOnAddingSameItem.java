package cartPageTest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cartPagePom.IncreaseInQuantityNumberOnAddingSameItem;
import pom.AddToCartScenario;

public class VerifyIncreaseInQuantityNumberOnAddingSameItem {
	
	//TEST CASE PASS...CONGRADULATIONS SUPARNA!!!!!!!!!!!!!!
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		IncreaseInQuantityNumberOnAddingSameItem qty = new IncreaseInQuantityNumberOnAddingSameItem(driver);
		qty.sendValuesToSearchBox(" casio watches");
		qty.clickOnSearchButton();
		qty.chooseYourWatch();
		
		

		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
        qty.clickOnquantityButton();
		qty.clickOnAddToCart();
		qty.clickOnskipButton();
		
		
		qty.clickOnAddToCartImage();
		qty. checkqtyButton();

	}
}