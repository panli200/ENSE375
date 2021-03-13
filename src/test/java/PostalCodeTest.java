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
        PostalCode postalCode = new PostalCode();
        assertTrue(postalCode.isValidPostalCode("K1S-0A2"));
    }

    @Test
    public void is_Not_ValidPostalCode_S4S_0A2(){
        PostalCode postalCode = new PostalCode();
        assertFalse(postalCode.isValidPostalCode("S4S-0A2"));
    }

    @Test
    public void getRegionVerticalIndex_Is_83(){
        PostalCode postalCode = new PostalCode();
        int regionVerticalIndex = postalCode.getRegionVerticalIndex();
        assertEquals(83,regionVerticalIndex);

    }

    @Test
    public void getRegionVerticalIndex_Is_Not_115(){
        PostalCode postalCode = new PostalCode();
        int regionVerticalIndex = postalCode.getRegionVerticalIndex();
        assertNotEquals(115,regionVerticalIndex);
    }
    
    @Test
    public void  getRegionHorizontalIndex_Is_0(){
        PostalCode postalCode = new PostalCode();
        int regionHorizontalIndex = postalCode.getRegionHorizontalIndex();
        assertEquals(0,regionHorizontalIndex);

    }

    @Test
    public void  getRegionHorizontalIndex_Is_Not_9(){
        PostalCode postalCode = new PostalCode();
        int regionHorizontalIndex = postalCode.getRegionHorizontalIndex();
        assertNotEquals(9,regionHorizontalIndex);
    }
}
