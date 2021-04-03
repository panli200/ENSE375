import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;

public class AppPatientValidTestCases()
{
	
	
	@Test				
	public void testSelenium() {	
	driver.get("http://demo.guru99.com/test/guru99home/");  
	String title = driver.getTitle();				 
	Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}
	
	@Test
	public void NormaAdd(){
	App app = new App();
	boolean AddNormal = app.addPatient("Patient1", "1", "S4S-4S4", 10);
	assertEquals(true, AddNormal);
	}

	@Test
	public void NormalAddMoreThanOne(){
	App app = new App();
	boolean AddFirst =  app.addPatient("Patient1", "1", "S4S-4S4", 10);
	boolean AddLast = app.addPatient("Patient3", "3", "S4S-4S6", 10);
	assertEquals(true, AddFirst);
	assertEquals(true, AddLast);
	}
	@Test
	public void NormalAddAgeZero(){
	App app = new App();
	boolean AddFirst =  app.addPatient("Patient1", "1", "S4S-4S4", 0);
	boolean AddLast = app.addPatient("Patient3", "3", "S4S-4S6", 0);
	assertEquals(true, AddFirst);
	assertEquals(true, AddLast);
	}

}