import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

/**
 * Unit test for Patient.
 */
public class PatientTest {

    @Test
    public void validPatientConstructorTrue() {
        try {
            Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        } catch (Exception e) {
            fail();
        }
    }

	// Exception thrown due to name including numbers and characters. 
    @Test(expected = InvalidNameException.class)
    public void invalidPatientName() throws Exception {
        Patient patient = new Patient("Alice5!", "200390111", 21, new PostalCode("K1E-1A4"));
    }

	// Exception thrown due to negative age value.
    @Test(expected = InvalidAgeException.class)
    public void invalidPatientAge() throws Exception {
        Patient patient = new Patient("Alice", "200390111", -21, new PostalCode("K1E-1A4"));
    }
	
	// Exception thrown due to no zero being included in the ID.
	@Test(expected = InvalidIDException.class)
    public void invalidPatientID() throws Exception {
        Patient patient = new Patient("Alice", "111111111", 21, new PostalCode("K1E-1A4"));
    }

	// Exception should be thrown due to improper postal code formatting with the space instead of a dash:
	// Well done (K1E-1A4) vs incorrect (K1E 1A4).
    @Test(expected = InvalidPostalCodeException.class)
    public void invalidPatientPostalCode() throws Exception {
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E 1A4"));
    }

    @Test
    public void validGetNameTrue() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        assertTrue(patient.getName().equals("Alice"));
    }

    @Test
    public void validGetAge() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        assertTrue(patient.getAge() == 21);
    }
	
	@Test
    public void validGetIDTrue() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        assertTrue(patient.getID().equals("200390111"));
    }

    @Test
    public void validSetAgeTrue() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        patient.setAge(75);
        assertEquals(patient.getAge(),75);
    }

	// Exception should be thrown to negative age value being set.
    @Test
    public void invalidSetAgeFalse() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        assertFalse(patient.setAge(-10));
    }

    @Test
    public void validSetPostalCodeTrue() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        PostalCode newPostalCode = new PostalCode("K1C-1A4");
        patient.setPostalCode(newPostalCode);
        assertEquals(patient.getPostalCode(),newPostalCode);
    }

	// Exception should be thrown due to the vertical region index being out of bounds. 
    @Test(expected = InvalidPostalCodeException.class)
    public void invalidSetPostalCodeTrue() throws Exception{
        Patient patient = new Patient("Alice", "200390111", 21, new PostalCode("K1E-1A4"));
        patient.setPostalCode(new PostalCode("K1U-1A4"));
    }
}
