package ForgotPassValidation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisteredEmail {
	public static void main(String[] args) throws InterruptedException {
		// Open the browser
		  ChromeDriver driver = new ChromeDriver();

		  // Maximize the browser
		  driver.manage().window().maximize();
		  
		  //waiting condition
		  Thread.sleep(2000);
		  
		  // Navigate to the URL
		  driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		  Thread.sleep(2000);

		  // Click on Forgot Password text
		  driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		  Thread.sleep(2000);

		  // Enter email into the text field
		  driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("rutujadumbre204@gmail.com");
		  Thread.sleep(2000);

		  // Click on Proceed button
		  driver.findElement(By.xpath("//div[text()='Proceed']")).click();
		  Thread.sleep(2000);
		  String sucess="Verification code sent successfully";
		  Thread.sleep(2000);
		  WebElement msg = driver.findElement(By.xpath("//h2[text()='Verification code sent successfully']"));
		 
		  
		  if(sucess.equals(msg.getText())) {
			  System.out.println(sucess);
		  }else {
			  System.out.println(msg.getText());
		  }
	}
}


