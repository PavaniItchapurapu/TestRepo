package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D01LaunchingEdge {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.close();
		
		/*Create java project with Module info checkbox off and java 11  or 17
		 * create package		 * 
		 * adding jar file to project
		 * *right click on Project name
		 * * build path-> configure build path
		 * * libraries _> click on class path
		 * *click OK -> add external jar files
		 * * select the folder selenium jar files
		 * *select the file selenium server 4.18.1
		 * open _>apply and close
		 */
		

	}

}
