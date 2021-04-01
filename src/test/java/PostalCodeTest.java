import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
/**
 * Unit test for simple PostalCode.
 */
public class PostalCodeTest 
{
    @Test
    public void isValidPostalCode_K1S_0A2(){
        try{
            PostalCode postalCode = new PostalCode("K1S-0A2");
            assertTrue(postalCode.isValidPostalCode("K1S-0A2"));
        }
        catch(InvalidPostalCodeException e){         
        }
        
    }

    @Test
    public void is_Not_ValidPostalCode_S4S_0A2(){
        
        try{
            PostalCode postalCode = new PostalCode("S4S-0A2");
            assertFalse(postalCode.isValidPostalCode("S4S-0A2"));
        }
        catch(InvalidPostalCodeException e){          
        }
       
    }

    @Test
    //The character 'S' has a numeric value represented as: 28
    public void getRegionVerticalIndex_Is_28(){
        try{
            PostalCode postalCode = new PostalCode("K1S-0A2");
            int regionVerticalIndex = postalCode.getRegionVerticalIndex();
            assertEquals(28,regionVerticalIndex);
        }
        catch(InvalidPostalCodeException e){         
        }
        
    }

    @Test
    public void getRegionVerticalIndex_Is_Not_115(){
        try{
            PostalCode postalCode = new PostalCode("K1S-0A2");
            int regionVerticalIndex = postalCode.getRegionVerticalIndex();
            assertNotEquals(115,regionVerticalIndex);
        }
        catch(InvalidPostalCodeException e){         
        }
        
    }

    @Test
    public void  getRegionHorizontalIndex_Is_0(){
        try{
            PostalCode postalCode = new PostalCode("K1S-0A2");
             int regionHorizontalIndex = postalCode.getRegionHorizontalIndex();
            assertEquals(0,regionHorizontalIndex);
        }
        catch(InvalidPostalCodeException e){         
        }   

    }

    @Test
    public void  getRegionHorizontalIndex_Is_Not_(){
        try{
            PostalCode postalCode = new PostalCode("K1S-0A2");
            int regionHorizontalIndex = postalCode.getRegionHorizontalIndex();
            assertNotEquals(9,regionHorizontalIndex);
        }
        catch(InvalidPostalCodeException e){         
        }
        
    } 
}
