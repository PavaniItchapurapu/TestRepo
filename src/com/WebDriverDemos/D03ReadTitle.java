package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args){
		String expTitle ="Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		/*if(expTitle.equals(acttitle)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		if(acttitle.contains("Meesho"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		driver.close();
	}

};