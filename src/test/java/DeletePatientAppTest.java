import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class DeletePatientAppTest
{
    @Test
    public void DeleteOnlyExistingPatient_True()
    {
	App app = new App();
	app.addPatient("Patient", "200347604", "K1A-2A2", 21);
	boolean validDeleteRequest = app.deletePatient("200347604");
	assertEquals(true, validDeleteRequest);
    }

    @Test
    public void DeleteFirstPatientInList_True()
    {
	App app = new App();
	app.addPatient("Patient", "200347604", "K1A-2A2", 21);
	app.addPatient("Patient Two", "200241910", "K1C-4L7", 27);
	app.addPatient("Patient Three", "200439623", "K1K-8G1", 23);
	boolean validDeleteRequest = app.deletePatient("200347604");
	assertEquals(true, validDeleteRequest);
    }

    @Test
    public void DeleteMiddlePatientInList_True()
    {
	App app = new App();
	app.addPatient("Patient", "200347604", "K1A-2A2", 21);
	app.addPatient("Patient Two", "200241910", "K1C-4L7", 27);
	app.addPatient("Patient Three", "200439623", "K1K-8G1", 23);
	boolean validDeleteRequest = app.deletePatient("200241910");
	assertEquals(true, validDeleteRequest);
    }

    @Test
    public void DeleteLastPatientInList_True()
    {
	App app = new App();
	app.addPatient("Patient", "200347604", "K1A-2A2", 21);
	app.addPatient("Patient Two", "200241910", "K1C-4L7", 27);
	app.addPatient("Patient Three", "200439623", "K1K-8G1", 23);
	boolean validDeleteRequest = app.deletePatient("200439623");
	assertEquals(true, validDeleteRequest);
    }
    
    @Test
    public void DeleteNonexistentPatient_False()
    {
	App app = new App();
	boolean invalidDeleteRequest = app.deletePatient("200347604");
	assertEquals(false, invalidDeleteRequest);
    } 
}
