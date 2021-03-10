import java.util.ArrayList;

public class PatientList
{
    private ArrayList<Patient> patientList; // list of Patients

    public PatientList()
    {
	patientList = new ArrayList<Patient>();
    }

    /**
     *
     * @return boolean: true if the patient can be added to the list
     */
    public boolean addPatient(Patient patient)
    {
        patientList.add(patient);
	return true;
    }
	
    /**
     *
     * @return boolean: true if the patient is deleted from the list
     */
    public boolean deletePatient(int index)
    {
	patientList.delete(index);
	return true;
    }

    /**
     *
     * @return Patient: non-null if the patient with the particular ID is in the list
     */
    public Patient getPatient(String id)
    {
	for (Patient thisPatient : patientList)
	    {
		if (thisPatient.getID().equals(id))
		    return thisPatient;
	    }
	
	return null;
    }

    /**
     *
     * @return int: returns the current size of the list
     */	
    public int getNumberofPatients()
    {
	return patients.size();
}
