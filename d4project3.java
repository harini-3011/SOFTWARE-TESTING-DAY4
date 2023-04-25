package day4pro2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class d4project3 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("HARINI");
		WebElement ename=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		ename.sendKeys("727721eucs035@skcet.ac.in");
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		fname.sendKeys("HARINI");
		WebElement yname=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yname.sendKeys("hmsharini301103@gmail.com");
		WebElement yesbutton=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		yesbutton.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		WebElement mname=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		mname.sendKeys("hi guys:)");
		JavascriptExecutor us=(JavascriptExecutor)driver;
		us.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		WebElement cbutton=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		cbutton.click();
		WebElement dbutton=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button"));
	    dbutton.click();
		
		
		
	}

}