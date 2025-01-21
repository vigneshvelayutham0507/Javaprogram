package trident.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		/*
		 * WebElement username = driver.findElement(By.id("user-name"));
		 * 
		 * WebElement password = driver.findElement(By.id("password"));
		 * 
		 * WebElement password = driver.findElement(By.id("login-button"));
		 */

		// WebElement username = driver.findElement(By.name("user-name"));

		/*
		 * WebElement password = driver.findElement(By.name("password")); WebElement
		 * button = driver.findElement(By.name("login-button"));
		 * 
		 * 
		 * WebElement username =
		 * driver.findElement(By.xpath("//input[@id=\"user-name\"]")); WebElement
		 * password =driver.findElement(By.xpath("")); WebElement button
		 * =driver.findElement(By.xpath(""));
		 */

	    	WebElement username = driver.findElement(By.id("user-name"));
		 WebElement password = driver.findElement(By.name("password"));
		 WebElement button = driver.findElement(By.id("login-button"));
		
		
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		button.click();
		
		
//		WebElement text = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
//		text.click();
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		for(int i = 0; i<price.size(); i++) {
		String text1 = price.get(i).getText();
		System.out.println(text1);
			
		}
		
		
//		WebElement cart = driver.findElement(By.xpath("//button[contains(text(),'cart')]"));
//		cart.click();

	}

}
