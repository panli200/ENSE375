import java.util.regex.*;

public class PostalCode 
{
    private String postalCode;
    public static boolean isValidPostalCode(String postalCode) 
    {	
	if (postalCode.getChar(0) == 'K')
	{
	    if (postalCode.getChar(1) == '1')
	    {
		int ascii = postalCode.getChar(2);
		    
		if (ascii >= 65 && ascii < 85)
		{
		    if (postalCode.getChar(3) == '-')
		    {
			int ascii_2 = postalCode.getChar(4);
			    
			if (ascii_2 >= 48 && ascii_2 <= 57)
			{
			    int ascii_3 = postalCode.getChar(5);
				
			    if (ascii_3 >= 65 && ascii_3 < 90)
			    {
				int ascii_4 = postalCode.getChar(6);
				    
				if (ascii_4 >= 48 && ascii_4 <= 57)
				    return true;
				    
				else return false;
			    }
			    
			    else return false;
			}
			    
			else return false;
		    }
			
		    else return false;
		}
		    
		else return false;
	    }
		
	    else return false;
	}
	    
	else return false;
    }
	
    public PostalCode(String postalCode) throws InvalidPostalCodeException 
    {
	// Throws an exception if the postal code is of an invalid format
        if (!isValidPostalCode(postalCode))
        {
            throw new InvalidPostalCodeException();
	}
	    else this.postalCode = postalCode;
    }

    public int getRegionVerticalIndex() 
    {		
	return Character.getNumericValue(postalCode.charAt(2));
    }

    public int getRegionHorizontalIndex() 
    {
        return Character.getNumericValue(postalCode.charAt(4));
    }

    public String getPostalCode() 
    {
	return postalCode;
    }
}
