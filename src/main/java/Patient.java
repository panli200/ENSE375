public class Patient 
{
	private String name;
	private String ID;
	private int age;
	private PostalCode postalCode;
	
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
		if(ID.matches("(?=.*0)^[0-9]{9}$")){
			this.ID = ID;
		} 
		else{
			throw new InvalidIDException(ID);
		}

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
		if(age < 0){
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