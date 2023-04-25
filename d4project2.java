package day4pro2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4project2 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("HARINI");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("M");
		WebElement ename=driver.findElement(By.id("input-email"));
		ename.sendKeys("727721eucs035@skcet.ac.in");
		WebElement pname=driver.findElement(By.id("input-password"));
		pname.sendKeys("harini301103@");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("input-newsletter-yes"));
		yesbutton.click();
		
		
	}

}