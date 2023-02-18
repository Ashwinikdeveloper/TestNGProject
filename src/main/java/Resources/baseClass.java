package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseClass {

	public void driverInitilize() throws IOException {
		
		//this will read the properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\ashwi\\eclipse-workspace\\SeleniumTestNGproject2023\\src\\main\\java\\Resources\\data.properties");
	
	//access the properties file--
		Properties prop=new Properties();
	     	prop.load(fis);
	     	
	     	String browserName= prop.getProperty("browser");
	     	if(browserName.equalsIgnoreCase("chrome")) {
	     		WebDriver driver= new ChromeDriver
	     		
	     		}
	
	     	
	
	
	}	
}
