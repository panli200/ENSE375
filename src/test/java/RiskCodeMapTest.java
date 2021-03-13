import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class RiskCodeMapTest {

	
	@Test
    public void TestG() {
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

		neighboursCaseCount.add(0);
		neighboursCaseCount.add(0);
		neighboursCaseCount.add(0);
		riskCodeMap.updateRiskInARegion(1, 1, 0, neighboursCaseCount);
        assertEquals('G',riskCodeMap.getRiskInARegion(1, 1)); //expected, actual
    }
	
	
	@Test
    public void TestB() {
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

		neighboursCaseCount.add(2);
		neighboursCaseCount.add(2);
		neighboursCaseCount.add(2);
		riskCodeMap.updateRiskInARegion(1, 1, 2, neighboursCaseCount);
        assertEquals('B',riskCodeMap.getRiskInARegion(1, 1)); //expected, actual
    }
	
	@Test
    public void TestY() {
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

		neighboursCaseCount.add(5);
		neighboursCaseCount.add(5);
		neighboursCaseCount.add(5);
		riskCodeMap.updateRiskInARegion(1, 1, 5, neighboursCaseCount);
        assertEquals('Y',riskCodeMap.getRiskInARegion(1, 1)); //expected, actual
    }
	
	
	@Test
    public void TestO() {
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

		neighboursCaseCount.add(9);
		neighboursCaseCount.add(9);
		neighboursCaseCount.add(9);
		riskCodeMap.updateRiskInARegion(1, 1, 9, neighboursCaseCount);
        assertEquals('O',riskCodeMap.getRiskInARegion(1, 1)); //expected, actual
    }
	
	@Test
    public void TestR() {
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

		neighboursCaseCount.add(15);
		neighboursCaseCount.add(15);
		neighboursCaseCount.add(15);
		riskCodeMap.updateRiskInARegion(1, 1, 15, neighboursCaseCount);
        assertEquals('R',riskCodeMap.getRiskInARegion(1, 1)); //expected, actual
    }
	
	

}
