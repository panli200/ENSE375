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
        try {
            Patient patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException e)
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
        try {
            Patient patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException e)
          {
              System.out.println("Invalid patient information.");   
          }
            
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        boolean patientDeleted = patientList.deletePatient(0);
        assertEquals(patientDeleted, true);  
    }
    
    @Test
    public void DeletePatientNotInList_False()
    {
        try {
            Patient patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException e)
          {
              System.out.println("Invalid patient information.");   
          }
            
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        boolean patientDeleted = patientList.deletePatient(1);
        assertEquals(patientDeleted, false);
    }
    
    @Test
    public void RetrievePatientInList_True()
    {
        try {
            Patient patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException e)
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
        try {
        Patient patient = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));  
        } catch (InvalidNameException | InvalidPostalCodeException e)
          {
              System.out.println("Invalid patient information.");   
          }
            
        PatientList patientList = new PatientList();
        patientList.addPatient(patient);
        Patient retrievedPatient = patientList.getPatient("200000000");
        assertEquals(retrievedPatient, null);
    }
    
    @Test
    public void GetNumberofPatients_CorrectSize()
    {
        try {
            Patient patient1 = new Patient("Jacob", "200347604", 21, new PostalCode("K1E-1A4"));
        } catch (InvalidNameException | InvalidPostalCodeException e)
          {
              System.out.println("Invalid patient information.");   
          }
        
        try {
            Patient patient2 = new Patient("John", "200347605", 21, new PostalCode("K1E-1H2"));
        } catch (InvalidNameException | InvalidPostalCodeException e)
          {
              System.out.println("Invalid patient information.");   
          }
        
        try {
            Patient patient3 = new Patient("Jane", "200347606", 21, new PostalCode("K1E-1L6"));
        } catch (InvalidNameException | InvalidPostalCodeException e)
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
