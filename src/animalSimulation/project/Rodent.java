package animalSimulation.project;

public class Rodent extends Organism { 

	Rodent(String newName) //constructor inherits properties from Organism constructor
	{
		super(newName);
	}

	protected String movementType = "skitters among the trees";
	
	public String getMovementType ()
	{
		return movementType;
	}
	
}
	
	

	

	

