package pom;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartScenario {
	@FindBy(xpath = ("//input[@id='twotabsearchtextbox']"))//1
	private WebElement searchbox;

	@FindBy(xpath = ("//input[@id='nav-search-submit-button']"))  //2
	private WebElement searchbutton;
	
	@FindBy(xpath = ("(//div[2]//span//a//img[@class='s-image'])[1]"))   //3
	private WebElement purse;
	
	@FindBy(xpath = ("//span[@id='submit.add-to-cart']"))    //4
	private WebElement AddToCart;

	
	public  AddToCartScenario(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		

		public void sendValuesToSearchBox(String value) {
			searchbox.sendKeys("purses");
		}

		public void clickOnSearchButton() {
			searchbutton.click();
		}
	

		public void chooseYourPurse() {
			purse.click();
		}

		public void clickOnAddToCart() {
			AddToCart.click();
			System.out.println("Item is added to the cart successfully");
		}
	
	
}
//public static void main(String[] args) {
//	  WebDriver driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//	        driver.get("https://www.amazon.in");
//	   WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); //1    
//	  //finding the search bar
//	   searchbox.sendKeys("purse");
//	   //sending keys to searchbox
//	   WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")); //2
//	   //finding the search button
//	   searchbutton.click();
//	   //clicking the search button
//	   WebElement purse=driver.findElement(By.xpath("(//div[2]//span//a//img[@class='s-image'])[1]")); //3   
//	   //finding reletive xpath for the purses option from search dropdownbox
//	   purse.click();
//	   //clicking on perse option
//	 ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
//	 //now browser has opened the child browser window so need to find out address of child browser
//	 driver.switchTo().window(list.get(1));
//	  //now move the selenium focus to child window browser
//	 WebElement AddToCart=driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")); //4 
//	 //serchling addtocart webelement from child browser window
//	   AddToCart.click();
//	   //clicking on addtocart 