import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class AppPatientValidTestCases()
{
	@Test
	public void NormalDelete(){
	App app = new App();
	app.addPatient("Patient1", "1", "S4S-4S4", 10);
	boolean DeleteNormal = app.deletePatient("1");
	assertEquals(true, DeleteFirst);
	}

	@Test
	public void NormalDeleteBoundsFirst(){
	App app = new App();
	app.addPatient("Patient1", "1", "S4S-4S4", 10);
	app.addPatient("Patient2", "2", "S4S-4S5", 10);
	app.addPatient("Patient3", "3", "S4S-4S6", 10);
	boolean DeleteFirst = app.deletePatient("1");
	assertEquals(true, DeleteFirst);
	}

	@Test
	public void NormalDeleteBoundsLast(){
	App app = new App();
	app.addPatient("Patient1", "1", "S4S-4S4", 10);
	app.addPatient("Patient2", "2", "S4S-4S5", 10);
	app.addPatient("Patient3", "3", "S4S-4S6", 10);
	boolean DeleteLast = app.deletePatient("3");
	assertEquals(true, DeleteFirst);
	}

	@Test
	public void NormalDeleteMultiple(){
	App app = new App();
	app.addPatient("Patient1", "1", "S4S-4S4", 10);
	app.addPatient("Patient2", "2", "S4S-4S5", 10);
	app.addPatient("Patient3", "3", "S4S-4S6", 10);

	boolean DeleteMultiple1 = app.deletePatient("3");
	boolean DeleteMultiple2 = app.deletePatient("2");
	boolean DeleteMultiple3 = app.deletePatient("1");
	assertEquals(true, DeleteMultiple1);
	assertEquals(true, DeleteMultiple2);
	assertEquals(true, DeleteMultiple3);
	}
	

}