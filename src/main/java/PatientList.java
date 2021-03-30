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
	int initialSize = this.getNumberofPatients();
        patientList.add(patient);
	
	if (this.getNumberofPatients() > initialSize) // indicating that an element has been added
	    return true;
	    
	else return false; // the sizes are the same, indicating that no element was added
    }

    public boolean deletePatient(int index)
    {
	int initialSize = this.getNumberofPatients();
	patientList.remove(index);
	
	if (this.getNumberofPatients() < initialSize) // indicating that an element has been removed
	    return true;
	    
	else return false; // the sizes are the same, indicating that no element was removed
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
	
    public int getPatientIndex(String id) // added to accommodate the needs of 'deletePatient' in App.java
    {
	    for (Patient thisPatient : patientList)
	    {
		if (thisPatient.getID().equals(id))
		    return patientList.indexOf(thisPatient);
	    }
	    
	    return -1;
    }
}
