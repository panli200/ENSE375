import java.util.ArrayList;

public class RiskCodeMap 
{
	private char[][] riskCode = new char[20][10];
    	public RiskCodeMap() 
    	{
    		for(int V=0 ; V < 20 ; V++){
                for(int H=0 ; H < 10 ; H++ ){
                    this.riskCode[V][H] = 'G';
                }
            }
    	}
    	/**
	*
	* @return boolean: true if the function could update the risk code in that region 
	*/
    	public boolean updateRiskInARegion(int VIndex,int HIndex,int caseCount,ArrayList<Integer> neighboursCaseCount)
    	{
    		int risk=0;
    		int max = caseCount;
    		int middle = (neighboursCaseCount.get(neighboursCaseCount.size()/2) + neighboursCaseCount.get(neighboursCaseCount.size()/2 - 1))/2;
    		
    		if(max >= middle) {
    			risk = max;
    		}else {
    			risk = middle;
    		}
    		
    		if(risk == 0) {
    			this.riskCode[VIndex][HIndex] = 'G';
    			return true;
    		}else if((risk >0) && (risk <= 3)) {
    			this.riskCode[VIndex][HIndex] = 'B';
    			return true;
    		}else if((risk >3) && (risk <= 7)) {
    			this.riskCode[VIndex][HIndex] = 'Y';
    			return true;
    		}else if((risk >7) && (risk <= 10)) {
    			this.riskCode[VIndex][HIndex] = 'O';
    			return true;
    		}else if(risk > 10) {
    			this.riskCode[VIndex][HIndex] = 'R';
    			return true;
    		}
    		
    		return false;
    	}
    	public char getRiskInARegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{
    	    	
    		return this.riskCode[VIndex][HIndex];
    	}
}
