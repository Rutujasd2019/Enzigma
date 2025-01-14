package SignUpValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidEmail {
	public static void main(String[] args) throws InterruptedException {
			//open the browser
				ChromeDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//waiting condition
				Thread.sleep(2000);
				//navigate to url
				driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
				Thread.sleep(2000);
				//click on sign up button
				driver.findElement(By.xpath("//a[text()='Sign up']")).click();
				//enter email in textFeild
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("rutujadumbre123.com");
				Thread.sleep(2000);
				//check the checkbox
				driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
				Thread.sleep(2000);
				//click on proceed button
				driver.findElement(By.xpath("//div[text()='Proceed']")).click();
				//verify error
				WebElement error_msg = driver.findElement(By.xpath("//h2[text()='Please enter a valid email']"));
				//extracting error message
				String Error=error_msg.getText();
				//printing the error
				System.out.println(Error);
				//close the browser
				driver.quit();
	}
}
