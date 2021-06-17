
public class Monkey extends RescueAnimal {
	// Instance variable
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	// Constructor
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength, String species) {
		        setName(name);
		        setGender(gender);
		        setAge(age);
		        setWeight(weight);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry); 
		        
		        	
		this.tailLength = tailLength;
		this.height = height;
		this.bodyLength = bodyLength;
		this.species = species;
	}      		


	//return tailLength
	public String getTailLength() {
		return tailLength;
	}


	//set tailLength
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}


	//return height
	public String getHeight() {
		return height;
	}


	//set height 
	public void setHeight(String height) {
		this.height = height;
	}


	//return body length
	public String getBodyLength() {
		return bodyLength;
	}


	// set body length
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}


	//return species
	public String getSpecies() {
		return species;
	}


	//set species
	public void setSpecies(String species) {
		this.species = species;
	}




}
