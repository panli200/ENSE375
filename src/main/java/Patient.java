public class Patient 
{
	private String name;
	private String ID;
	private int age;
	private PostalCode postalCode;
	
	public Patient()
	{
		name = "Name";
		ID = "000000000";
		age = 25;
		try {
		postalCode = new PostalCode("K1A-0A0");
		} catch (InvalidPostalCodeException e)
		  {
			System.out.println("Invalid postal code.");	
		  }
	}
	
	public Patient(String name, String ID, int age, PostalCode postalCode) throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException 
	{
		// Name needs to include only a-z, A-Z, and spaces and dots from beginning of line to end of line 
		if(name.matches("^[a-zA-Z .]*$")){
			this.name = name;
		} 
		else{
			throw new InvalidNameException(name);
		}

		// Patient ID needs to be a 9-digit string with a non-zero digit, length needs to be 9 and can only include 0-9
		/*if (ID.matches("(?=.*0)^[0-9]{9}$")){
			this.ID = ID;
		} 
		
		else throw new InvalidIDException(ID);*/
		
		int zerothElement = (int) ID.charAt(0);
		
		if (zerothElement < 49 || zerothElement > 57)
		 	throw new InvalidIDException(ID);
		
		else if (ID.length() != 9)
			throw new InvalidIDException(ID);
		
		for (int i = 1; i < ID.length(); i++)
		{
			int nthElement = (int) ID.charAt(i);
			if (nthElement < 48 || nthElement > 57)
				throw new InvalidIDException(ID);
		}
		
		this.ID = ID;

		if(age >= 0){
			this.age = age;
		} 
		else{
			throw new InvalidAgeException(age);
		}

		if(PostalCode.isValidPostalCode(postalCode.getPostalCode())){
			this.postalCode = postalCode;
		} 
		else{
			throw new InvalidPostalCodeException();
		}

	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public int getAge()
	{
		return age;
	}
	public PostalCode getPostalCode()
	{	
		return postalCode;
	}
	/**
	*
	* @return boolean: true if the age is corrected set 
	*/
	public boolean setAge(int age)
	{	
		if(age > 0){
			this.age = age;
			return true;
		} 
		else{
			return false;
		}
	}
	/**
	*
	* @return boolean: true if the postal code is corrected set 
	*/
	public boolean setPostalCode(PostalCode postalCode)
	{
		if(PostalCode.isValidPostalCode(postalCode.getPostalCode())){
			this.postalCode = postalCode;
			return true;
		} 
		else{
			return false;
		}
	}
}
