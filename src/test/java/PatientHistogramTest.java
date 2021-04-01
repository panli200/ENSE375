import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for PatientHistogram.
 */
public class PatientHistogramTest
{
	@Test
    public void Add_Histo() {
		PatientHistogram patientHistogram = new PatientHistogram();
		patientHistogram.addAPatientToRegion(1, 4);
        assertEquals(1, patientHistogram.getPatientsCountInRegion(1, 4)); //expected, actual
    }
	
	
	@Test
    public void Delete_Histo() {
		PatientHistogram patientHistogram = new PatientHistogram();
	    	patientHistogram.addAPatientToRegion(1, 4);
		patientHistogram.deleteAPatientFromRegion(1, 4);
        assertEquals(0, patientHistogram.getPatientsCountInRegion(1, 4)); //expected, actual
    }
}
