import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

/**
 * Unit test for PatientList.
 */
public class PatientListTest 
{
    @Test
    public void AddPatient_True()
    {
        Patient patient = new Patient();
        try {
            patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
        
        PatientList patientList = new PatientList();
        boolean patientAdded = patientList.addPatient(patient);
        assertEquals(patientAdded, true);
    }
    
    @Test
    public void DeletePatientInList_True()
    {
        Patient patient = new Patient();
        try {
            patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
            
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        boolean patientDeleted = patientList.deletePatient(0);
        assertEquals(patientDeleted, true); 
    }
    
    @Test
    public void RetrievePatientInList_True()
    {
        Patient patient = new Patient();
        try {
            patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
            
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        Patient retrievedPatient = patientList.getPatient("200347604");
        assertEquals(patient, retrievedPatient);
    }
    
    @Test
    public void RetrievePatientNotInList_False()
    {
        Patient patient = new Patient();
        try {
            patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
            
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        Patient retrievedPatient = patientList.getPatient("200000000");
        assertNotEquals(patient, retrievedPatient);
    }
    
    @Test
    public void GetNumberofPatients_CorrectSize()
    {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        
        try {
            patient1 = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
        
        try {
            patient2 = new Patient("John", "200347605", 21, new PostalCode("K1E-1H2"));
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
        
        try {
            patient3 = new Patient("Jane", "200347606", 21, new PostalCode("K1E-1L6"));
        } catch (InvalidNameException | InvalidPostalCodeException | InvalidAgeException | InvalidIDException e)
          {
              System.out.println("Invalid patient information.");   
          }
        
        PatientList patientList = new PatientList();
        patientList.addPatient(patient1);
        patientList.addPatient(patient2);
        patientList.addPatient(patient3);
        assertEquals(patientList.getNumberofPatients(), 3);
    }
}
