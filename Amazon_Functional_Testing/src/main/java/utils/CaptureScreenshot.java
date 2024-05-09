package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
    public static void captureScreenshot() throws IOException
    {
    	WebDriver driver=new ChromeDriver();
	Random ran=new Random();
    for(int i=1;i<=5;i++)
    {
    	Date now=new Date();
  SimpleDateFormat date=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
     String formateddate= date.format(now);
    	
    int randomnumber =ran.nextInt(100);
    	TakesScreenshot t=(TakesScreenshot)driver;
  File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File dest=new File("C:\\Users\\Admin\\Desktop\\sellenium automation\\Screenshots of selenium\\Test_"+
 ran + formateddate+ i+" "+".png"); 
  FileHandler.copy(source, dest);
  
    }
    System.out.println("End");
    driver.quit();
	
}
}
