package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.PropertiesUtils;

public class BaseClass {

	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger("BaseClass");
	
	public static void initialization() {
		log.info("Reading property file for browser");
		System.out.println("Reading property file for browser");
		String browserName= PropertiesUtils.readproperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver126.exe");
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
}
