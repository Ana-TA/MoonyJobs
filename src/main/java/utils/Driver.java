package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Driver {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver initDriver(String browser) {
		
		switch(browser) {
			case "chrome":
				driver.set(new ChromeDriver(getChromeOptions()));
				break;
			case "edge":
				driver.set(new EdgeDriver(getEdgeOptions()));
				break;
		}
		return driver.get();
	}
	
	public ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		return options;
	}
	
	public EdgeOptions getEdgeOptions() {
		EdgeOptions options = new EdgeOptions();
		return options;
	}

}
