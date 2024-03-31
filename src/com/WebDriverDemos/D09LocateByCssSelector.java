package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D09LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		emailId.sendKeys("pavani.svs@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[data-testid=\"royal_pass\"]"));
		password.sendKeys("Shankara123$$");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		loginBtn.click();
	}

}
