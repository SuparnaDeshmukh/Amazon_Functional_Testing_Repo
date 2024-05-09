package testclasses;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionAlertIsPresent {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='iframeResult']")));
		
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		WebElement tryit1=wait.until(ExpectedConditions.elementToBeClickable(tryit)); 
		tryit.click();
		
		
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
 
		alt.accept();
		
	boolean result=	wait.until(ExpectedConditions.urlToBe("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"));
		
		System.out.println(result);
		
	
		
	}

}
