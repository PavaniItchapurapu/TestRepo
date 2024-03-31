package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D06LocateByNameandID {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://staragile.melimu.com/");
		WebElement emailId= driver.findElement(By.name("username"));
		emailId.sendKeys("pavani.svs@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Shankara123$$");
		WebElement login = driver.findElement(By.id("loginbtn"));
		//WebElement emailId = driver.findElement(By.name("email"));-> is when we are search with name atrtribute in inspect
		login.click();
	}
	

}
