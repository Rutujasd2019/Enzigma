package LoginPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidUserAndPass {
	
			public static void main(String[] args) throws InterruptedException {
				  
				  // Open the browser
				  ChromeDriver driver = new ChromeDriver();

				  // Maximize the browser
				  driver.manage().window().maximize();
				  
				  //Waiting Condition
				  Thread.sleep(2000);

				  // Navigate to the URL
				  driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
				  Thread.sleep(2000);
				  
				  //Enter email in Email text field
				   WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
				   username.sendKeys("rutujadumbre204@gmail.com");
				   Thread.sleep(2000);
				     
				   //Enter password into the Password text field
				   WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
				   password.sendKeys("Rutu@123");
				   Thread.sleep(2000);
				     
				   //Click on Login button
				   WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
				   login.click();
				   Thread.sleep(8000);
				 WebElement dashBoard = driver.findElement(By.xpath("//div[@id='id_17367615446143648']"));
				 if(dashBoard.isDisplayed()) {
					 System.out.println("Login Success and redirected to dashBoard ");
				 }else {
					 System.out.println("Inavlid user/pass");
				 }


		}
}
