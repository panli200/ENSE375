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

    public boolean deletePatient(int index)
    {
	patientList.remove(index);
	return true;
    }

    public Patient getPatient(String id)
    {
	for (Patient thisPatient : patientList)
	    {
		if (thisPatient.getID().equals(id))
		    return thisPatient;
	    }
	
	return null;
    }

    public int getNumberofPatients()
    {
	return patientList.size();
    }
}
