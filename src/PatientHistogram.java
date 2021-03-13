import java.util.ArrayList;

public class PatientHistogram 
{
	private int[][] patientCount = new int[20][10];
    	public PatientHistogram() 
    	{
    		for(int V=0 ; V < 20 ; V++){
                for(int H=0 ; H < 10 ; H++ ){
                    this.patientCount[V][H] = 0;
                }
            }
    	}
    	/**
	*
	* @return boolean: true if the a patient can be added from that region 
	*/
    	public boolean addAPatientToRegion(int VIndex,int HIndex)
    	{
    		int oldCount = this.patientCount[VIndex][HIndex];
    		this.patientCount[VIndex][HIndex] += 1;
    		if(this.patientCount[VIndex][HIndex] == oldCount + 1){
                return true;
            }
    		return false;
    		
    	}
	/**
	*
	* @return boolean: true if the a patient can be removed from that region 
	*/
    	public boolean deleteAPatientFromRegion(int VIndex,int HIndex)
    	{
    		int oldCount = this.patientCount[VIndex][HIndex];
    		this.patientCount[VIndex][HIndex] -= 1;
    		if(this.patientCount[VIndex][HIndex] == oldCount - 1){
                return true;
            }
    		return false;
    	}
    	public int getPatientsCountInRegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{
    		
    		return this.patientCount[VIndex][HIndex];
    	}
}
