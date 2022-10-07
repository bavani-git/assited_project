package seleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_1 {
	
public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.get("https://www.shine.com/registration/");
	        
	    driver.manage().window().maximize(); 
	    Thread.sleep(1000); 
	    
	    driver.findElement(By.id("id_name")).sendKeys("bavani");
	    
	    driver.findElement(By.id("id_email")).sendKeys("msbssankarother@gmail.com");
	    
	    driver.findElement(By.id("id_cell_phone")).sendKeys("9943027797");
	    
	    driver.findElement(By.id("id_password")).sendKeys("Manick@123");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("registerButton")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    
	    driver.get("https://www.shine.com/login/");
	    
	    driver.findElement(By.id("id_email_login")).sendKeys("msbssankarother@gmail.com");
	    
	    driver.findElement(By.id("id_password")).sendKeys("Manick@123");
	    
	    driver.findElement(By.xpath("//button[@class='cls_base_1_pw_login_btn ui-btn ui-btn_n btn btn-lg btn-yellow search-btn submitred']")).submit();
	    
	    Thread.sleep(2000);
}
	
	

}
