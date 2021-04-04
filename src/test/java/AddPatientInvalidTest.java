// Carter Brezinski
// 200391111
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AddPatientInvalidTestCases {

	App app = new App();

    // No numbers and characters in a name
	@Test
	public void addPatient_invalidName() {
		boolean addPatientSuccessful = app.addPatient("Alice5!", "200390111", "K1E-1A4", 30);
		assertFalse(addPatientSuccessful);
	}

    // Test should fail due to a patient already holding similar ID and Area Code credentials
    @Test
    public void addPatient_invalidAddToPatientList() {
        app.addPatient("Alice", "200390111", "K1E-1A4", 30);
        boolean addPatientSuccessful = app.addPatient("Jeremy", "200390111", "K1E-1A4", 56);
        assertFalse(addPatientSuccessful);
    }

	// ID must be a 9 digit string with a non-zero digit
	@Test
	public void addPatient_invalidId() {
		boolean addPatientSuccessful = app.addPatient("Alice", "657213", "K1E-1A4", 30);
		assertFalse(addPatientSuccessful);
	}

    // Age cant be less than 0
	@Test
	public void addPatient_invalidAge() {
		boolean addPatientSuccessful = app.addPatient("Alice", "200390111", "K1E-1A4", -30);
		assertFalse(addPatientSuccessful);
	}
	
    // Invalid postal code due to lacking a " - "
	@Test
	public void addPatient_invalidPostalCode() {
		boolean addPatientSuccessful = app.addPatient("Alice", "200390111", "K1E1A4", 30);
		assertFalse(addPatientSuccessful);
	}
}
