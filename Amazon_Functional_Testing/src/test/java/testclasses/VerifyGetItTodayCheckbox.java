package testclasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SelectingGetItTodayCheckbox;

public class VerifyGetItTodayCheckbox {
	public static void main(String[] args) {
		//THIS CLASS IS NOT RUNNING BEACAUSE THE GUI IS CHANGING
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.amazon.in/");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	 driver.manage().window().maximize();
    	  
    	 SelectingGetItTodayCheckbox obj=new   SelectingGetItTodayCheckbox(driver);
    	 
    	 obj.sendToSearchBox("Watches");
    
    	 obj.clickOnSearchButton();
    	 
    	// List<String> list=new ArrayList<String>(driver.getWindowHandles());
    	 //list.get(1);
    	 // driver.switchTo().window( list.get(1)) ;
    	 obj.clickonexpandAll();
    	 
    	 //obj.verifyGetItToday();
    	 
    	 
	}

}
