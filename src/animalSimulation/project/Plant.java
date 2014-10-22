package animalSimulation.project;

public class Plant extends Organism { 

	public Plant (String newName) //constructor inherits properties from Organism constructor
	{
		super(newName);
		
	}

	protected String movementType = "Rustles in the wind";
	
	public String getMovementType ()
	{
		return movementType;
	}
	
}
	

	

	
