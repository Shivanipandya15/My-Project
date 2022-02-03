package basepackaje;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class BaseclassDemoStore {
public static	Properties prop=new Properties(); 
public static	WebDriver driver;
	public BaseclassDemoStore() {
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\Pruthvish Pandya\\Desktop\\Shivani Eclipse\\TestNgproject\\src\\test\\java\\Environment\\configration.properties");
	    prop.load(file);
		
		}
	catch(FileNotFoundException  e) {
    e.printStackTrace();
}
		catch (IOException c){
        c.printStackTrace();			
			
		}}
	
	public static void initiation() {
String browsername=		prop.getProperty("Browser");
if(browsername.equalsIgnoreCase("Chrome") ) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	
}
else {
System.setProperty("webdriver.gecko.driver","geckodriver.exe");
driver=new FirefoxDriver();


	}
driver.get(prop.getProperty("url"));
	}}
	
	
	
