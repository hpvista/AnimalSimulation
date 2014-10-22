package animalSimulation.project;

public class MidsizeMammal extends Organism {

	public MidsizeMammal(String newName) //constructor inherits properties from Organism constructor
	{
		super(newName);
	}

	protected String movementType = "Runs";
	
	public String getMovementType ()
	{
		return movementType;
	}
	
}
	

	

	


