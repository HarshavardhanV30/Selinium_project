package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerence {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-button']")).submit();
		Thread.sleep(3000);
		//add to cart
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		//click to cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		//checkout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		//adding the names
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("harsha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("vardhan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("515411");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();

	}

}
