package cartPagePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotalAmountIsDisplayedToUser {
	@FindBy(xpath = ("(//div[@data-name='Subtotals'])[2]"))//1
	private WebElement subtotal;
	
	
	public   TotalAmountIsDisplayedToUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void checksubtotal()
	{
	 String text=subtotal.getText();
	 System.out.println(text);
    
	
	
}
}
