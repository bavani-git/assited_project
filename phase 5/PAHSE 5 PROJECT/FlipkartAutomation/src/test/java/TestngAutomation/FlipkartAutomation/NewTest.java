package TestngAutomation.FlipkartAutomation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
 WebDriver driver;
	
	@BeforeTest
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 
		 long start = System.currentTimeMillis();
		 
		driver.get("https://www.flipkart.com/");
		System.out.println("Page loaded Successfully");
		 try {
				
				driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
				Thread.sleep(1000);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		    long finish = System.currentTimeMillis();
		    long totalTime = finish - start; 
		    System.out.println("Total Time for page load - "+totalTime); 
		    driver.manage().window().maximize();
	}
	
	@AfterTest
	public void aftertest() {
	//	driver.close();
		driver = null;
		
	}
	
	
	
	@Test(priority = 1)
	public void navigate() throws InterruptedException
	{
		driver.findElement(By.linkText("Mobiles")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
	    Thread.sleep(2000);
	    driver.findElement(By.className("_34RNph")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("APPLE iPhone 13 (Green")).click();
	    Thread.sleep(2000);
	}
	
	
	
	
	

	@Test(priority = 2)
	public void loadImage() throws InterruptedException {

		driver.get("https://www.flipkart.com/apple-iphone-13-green-128-gb/p/itm18a55937b2607?pid=MOBGC9VGSU9DWGJZ&lid=LSTMOBGC9VGSU9DWGJZTOZYKQ&marketplace=FLIPKART&q=iphone+13&store=tyy%2F4io&srno=s_1_4&otracker=search&otracker1=search&fm=organic&iid=3b1fbceb-87f2-4533-bf30-68d96efb9f7d.MOBGC9VGSU9DWGJZ.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=dup3to8u4w0000001666074823925&qH=c68a3b83214bb235");
		Thread.sleep(3000);
		//driver.navigate().refresh();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class); 
		wait.until(new Function<WebDriver, WebElement>() {

			@Test
			public WebElement apply(WebDriver driver) {
				WebElement img = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/img"));

				if (img.isDisplayed()) {
					System.out.println("\nImage Loaded");
					return img;
				} else {
					System.out.println("\nFluent Wait Fail!, Element Not Loaded Yet");
					return null;
				}	
			}
		});
	}
	
	@Test(priority = 3)
	public void bottom() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("\nNavigated to bottom of the page");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 4)
	public void Scrollavailable() throws Exception {
		String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		  JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
		  Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		  if (test == true) {
				System.out.print("Scrollbar is present.");
			} else if (test == false){
				System.out.print("Scrollbar is not present.");
			}

	}
	@Test(priority = 5)
	public void scrollFrequency() throws InterruptedException {
		Thread.sleep(2000);
		long start = System.currentTimeMillis();
		WebElement element = driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/200/200/cms-rpd-img/4dc94e380a844cfaa8976dc502fbfd1a_18359c0013a_image.png?q=90']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		long stop = System.currentTimeMillis();
		long totalTime = stop - start;
		System.out.println("\nScroll Frequency in millisecs - " + totalTime);

	}
	
	@Test(priority = 6)
	public void screenResolution() throws InterruptedException {
		Thread.sleep(1000);
		Dimension dimension = new Dimension(720, 1080);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);

		Dimension dimension1 = new Dimension(1280, 800);
		driver.manage().window().setSize(dimension1);
		Thread.sleep(3000);

		Dimension dimension2 = new Dimension(2256, 1504);
		driver.manage().window().setSize(dimension2);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		int contentHeight = ((Number) js.executeScript("return window.innerHeight")).intValue();
		int contentWidth = ((Number) js.executeScript("return window.innerWidth")).intValue();
		System.out.println("\nHeight: " + contentHeight + " Width: " + contentWidth + "\n");

	}
	
	
}
