package seleniumProgram;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class test_ng {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
					driver= new ChromeDriver();
		}
	  
	

	@Test
	public void register() {
		  
		  	driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&prevRID=X0PWH6ZFC1NW9PMJWVG3&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			driver.findElement(By.name("customerName")).sendKeys("bavani");	
			driver.findElement(By.name("email")).sendKeys("msbssankar@gmail.com");
			driver.findElement(By.name("password")).sendKeys("bavani@123");
			driver.findElement(By.name("passwordCheck")).sendKeys("bavani@123");
			driver.findElement(By.id("continue")).submit();	
	}

	@Test
	public void login() {
			
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("msbssankar@gmail.com");
			driver.findElement(By.id("continue")).submit();
			
			
		}

	@Test
	public void search() {
		
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		//WebElement searchElement = driver.findElement(By.id("nav-bb-search"));
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("noise earpods");;
		//searchElement.sendKeys("realme pods");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}



	@Test
	public void addtocart() {
		
		driver.get("https://www.amazon.in/iPhone-14-128GB-Product-RED/dp/B0BDJVSDMY/ref=sr_1_1_sspa?crid=2QRAO04OIQ9T&keywords=iphone+13&qid=1665337595&qu=eyJxc2MiOiI0LjQ4IiwicXNhIjoiMy45OCIsInFzcCI6IjMuNTIifQ%3D%3D&sprefix=iph%2Caps%2C308&sr=8-1-spons&psc=1");
		driver.manage().window().maximize();
		driver.findElement(By.name("submit.add-to-cart")).click();

		
	}








	  
	  
	  

	  
	  
	  
	  
		@AfterMethod
		public void afterMethod() {
			//driver.close();
			driver=null;
		}
	
}
		