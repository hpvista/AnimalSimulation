package animalSimulation.project;

public class Insect extends Organism { 
	
	public Insect(String newName) //constructor inherits properties from Organism constructor
	{
		super(newName);
	}

	protected String movementType = "Crawls";
	
	public String getMovementType ()
	{
		return movementType;
	}
	
}


	


