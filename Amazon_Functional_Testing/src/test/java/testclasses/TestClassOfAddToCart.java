package testclasses;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AddToCartScenario;

public class TestClassOfAddToCart {
	
	//well done Suprana you r awsome,program is working fine//
    public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in");
    	
    	
    	AddToCartScenario addToCartScenario=new AddToCartScenario(driver); 
    	addToCartScenario.sendValuesToSearchBox("purses");
    	addToCartScenario. clickOnSearchButton();
    	addToCartScenario.chooseYourPurse();
    	
    	 ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
    	 driver.switchTo().window(list.get(1));
    	 
    	addToCartScenario.clickOnAddToCart();
    	
	}
}
