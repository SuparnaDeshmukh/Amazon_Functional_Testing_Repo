package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.LogInOrSignUpPage;
import pom.SearchButtonFunctionality;

public class TestClassOfSearchButtonFunctionality {
//THIS PROGRAM IS RUNNING PROPERLY,PEFECT SUPARNA//
public static void main(String[] args) throws InterruptedException {
		
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in");
    	SearchButtonFunctionality searchbuttonfunctionality =new SearchButtonFunctionality(driver);
    	
    	searchbuttonfunctionality.sendValuesToSearchBox("purses");
    	
    	Thread.sleep(3000);
    	
    	searchbuttonfunctionality.clickOnSearchButton();
    	
	
}
}
