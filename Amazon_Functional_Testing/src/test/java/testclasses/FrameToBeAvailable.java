package testclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameToBeAvailable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='iframeResult']")));

		WebElement paragraph = driver.findElement(By.xpath("//p[text()='This is a paragraph.']"));

	String text = paragraph.getText();

		System.out.println(text);
}
}
