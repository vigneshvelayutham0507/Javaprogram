package trident.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAtomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("vignesh");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("velayutham");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("chennai ekattuthangal");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("trident@gmail.com");
		
		WebElement number = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		number.sendKeys("1234567890");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='Male']"));
		radioButton.click();
		
		WebElement checkBox = driver.findElement(By.id("checkbox2"));
		checkBox.click();
		
		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		language.click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select  sk = new Select (skills);
		sk.selectByValue("Adobe Photoshop");
		
		
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		Select place = new Select (country);
		place.selectByVisibleText("Select Country");
		
		WebElement countries = driver.findElement(By.xpath("//select[@id='country']"));
		Select coun = new Select (countries);
		coun.selectByVisibleText("India");
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select yr = new Select (year);
		yr.selectByVisibleText("1917");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select mo = new Select (month);
		mo.selectByVisibleText("July");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select dy = new Select (day);
		dy.selectByVisibleText("5");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys("123456789");
		
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmPassword.sendKeys("123456789");
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		upload.sendKeys("D:\\Logo\\logo\\itTrident-logo.png");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();
		
		
		
		
		
		
	
		

	}

}
