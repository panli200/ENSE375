public class PostalCode 
{
    private String postalCode;
    public static boolean isValidPostalCode(String postalCode) 
    {	
	//Postal Code regex 
	String legalFormat = "^(?!.*[DFIOQU])[A-VXY][0-9][A-T] ?[0-9][A-Z][0-9]$";
	Pattern pattern = Pattern.compile(legalFormat);
	Matcher matcher = pattern.matcher(postalCode);
	    
	if (matcher.matches())
	    return true;	    
	else 
	    return false;
    }
	
    public PostalCode(String postalCode) throws InvalidPostalCodeException 
    {
	// Throws an exception if the postal code is of an invalid format
        if (!isValidPostalCode(postalCode))
        {
            throw new InvalidPostalCodeException("Invalid PostalCode");
	}
	    else this.postalCode = postalCode;
    }

    public int getRegionVerticalIndex() 
    {		
	return Integer.parseInt(postalCode.charAt(2));
    }

    public int getRegionHorizontalIndex() 
    {
        return Integer.parseInt(postalCode.charAt(4));
    }

    public String getPostalCode() 
    {
	return postalCode;
    }
}
