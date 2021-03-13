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
        postalCode="K1S-0A2";
        assertTrue(postcalCode.isValidPostalCode());
    }

    @Test
    public void is_Not_ValidPostalCode_S4S_0A2(){
        PostalCode postalCode = new PostalCode();
        postalCode="S4S-0A2";
        assertFalse(postcalCode.isValidPostalCode());
    }

    public void getRegionVerticalIndex_Is_83(){
        PostalCode postalCode = new PostalCode();
        postalCode="K1S-0A2";
        int regionVerticalIndex = postalCode.getRegionVerticalIndex();
        assertEquals(83,regionVerticalIndex);

    }

    public void getRegionVerticalIndex_Is_Not_115(){
        PostalCode postalCode = new PostalCode();
        postalCode="K1S-0A2";
        int regionVerticalIndex = postalCode.getRegionVerticalIndex();
        assertNotEquals(115,regionVerticalIndex);
    }
    public void  getRegionHorizontalIndex_Is_0(){
        PostalCode postalCode = new PostalCode();
        postalCode="K1S-0A2";
        int regionHorizontalIndex = postalCode.getRegionHorizontalIndex();
        assertEquals(0,regionVerticalIndex);

    }

    public void  getRegionHorizontalIndex_Is_Not_(){
        PostalCode postalCode = new PostalCode();
        postalCode="K1S-0A2";
        int regionHorizontalIndex = postalCode.getRegionHorizontalIndex();
        assertNotEquals(9,regionVerticalIndex);
    }
}
