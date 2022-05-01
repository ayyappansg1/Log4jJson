import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log4jReadingEx {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		FileInputStream stream=new FileInputStream("config2.properties");
		
		Properties property=new Properties();
		property.load(stream);
		
		String browser=property.getProperty("browser");
		String location=property.getProperty("location");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", location);
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", location);
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.co.in");	
		System.out.println(browser+location);
				
	}

}
