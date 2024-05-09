package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AccountsAndLists;

public class VerifyAccountsAndLists {
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		 AccountsAndLists act=new AccountsAndLists(driver);
		 
		 act.clickAccountsAndLists();
		 
  	  
	}
}
