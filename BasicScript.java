package Enzigma;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {
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
		
	}
}
