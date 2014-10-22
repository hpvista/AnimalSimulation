package animalSimulation.project;

public class Bird extends Organism { 

	public Bird (String newName) //constructor inherits properties from Organism constructor
	{
		super(newName);
	}

	protected String movementType = "Flies";
	
	public String getMovementType ()
	{
		return movementType;
	}
	

	
}

	

