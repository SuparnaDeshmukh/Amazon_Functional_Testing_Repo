package ProductPom;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ProductRating{
		
		@FindBy(xpath=("//input[@id='twotabsearchtextbox']"))
		private WebElement search;

		@FindBy(xpath=("//input[@id='nav-search-submit-button']"))
		private WebElement searchButton;

		@FindBy(xpath=("(//div[@class='puisg-col-inner']//h2//span)[1]"))
		private WebElement clickonfrstmobile;
		
		@FindBy(xpath=("(//span[@id='acrCustomerReviewText'])[1]"))
		private WebElement rating;

		
		
		//input[@id='nav-search-submit-button']
		public ProductRating(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public void  PasstheDataintoSearchTab(String senddata)
		{
			search.sendKeys(senddata);
		}

		public void ClickonSearchButton()
		{
			searchButton.click();
		}

		public void  ClickonMobile()
		{
			clickonfrstmobile.click();

		}
		public void  clickonRatingOfProuct() throws InterruptedException
		{
			//js=(JavascriptExecutor) driver;
			Thread.sleep(2000);
			
		   // js.executeScript("arguments[0].scrollIntoview(true),rating");
		   // act=new Actions(driver);
		   //act.moveToElement(rating).click().build().perform();
		    rating.click();
		}


	}

