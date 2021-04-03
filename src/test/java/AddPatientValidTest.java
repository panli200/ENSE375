import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.*;

public class AddPatientValidTest
{
	
	
	@Test				
	public void testSelenium() {
// 	System.setProperty("webdriver.chrome.driver", "Google Chrome");
// 	WebDriver driver = new ChromeDriver();
// 	DesiredCapabilities cap = DesiredCapabilities.firefox();
// 	cap.setCapability("marionette", true);
// 	WebDriver driver = new FirefoxDriver(cap);
	System.setProperty("webdriver.gecko.driver", "geckodriver");	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");  
	String title = driver.getTitle();
	driver.quit();	
	assertTrue(title.contains("Demo Guru99 Page")); 		
	}
	
	@Test
	public void NormaAdd(){
	App app = new App();
	boolean AddNormal = app.addPatient("Patient One", "200000001", "K1S-4S4", 10);
	assertEquals(true, AddNormal);
	}

	@Test
	public void NormalAddMoreThanOne(){
	App app = new App();
	boolean AddFirst =  app.addPatient("Patient Two", "200000001", "K1S-4S4", 10);
	boolean AddLast = app.addPatient("Patient Three", "200000003", "K1S-4S6", 10);
	assertEquals(true, AddFirst);
	assertEquals(true, AddLast);
	}
	@Test
	public void NormalAddAgeZero(){
	App app = new App();
	boolean AddFirst =  app.addPatient("Patient One", "200000001", "K1S-4S4", 0);
	boolean AddLast = app.addPatient("Patient Three", "200000003", "K1S-4S6", 0);
	assertEquals(true, AddFirst);
	assertEquals(true, AddLast);
	}

}
