
public class Moneky extends RescueAnimal {
	private String tailLength;
	private String height;
	private String bodyLength;
	private String Species;

	public Moneky(String tail,String tall,String body,String type) {
		tailLength = tail;
		height = tall;
		bodyLength = body;
		Species = type;

	public void settailLength(String tail) {
		tailLength = tail;
	}

	public String gettailLength() {
		return tailLength;

	}

	public void setheight(String tall) {
		height = tall;
	}

	public String getheight() {
		return height;
	}

	public void setbodyLength(String body) {
		bodyLength = body;
	}

	public String getbodyLength
	{
		return bodyLength;
	}

	public void setSpecies(String type) {
		Species = type;
	}

	public String getSpecies() {
		return Species;
	}

}

// TODO Auto-generated constructor stub
}

}
