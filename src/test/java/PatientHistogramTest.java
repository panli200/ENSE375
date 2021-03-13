import static org.junit.Assert.AsserEquals;
import org.junit.Test;

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
		patientHistogram.deleteAPatientFromRegion(1, 4);
        assertEquals(0, patientHistogram.getPatientsCountInRegion(1, 4)); //expected, actual
    }
}
