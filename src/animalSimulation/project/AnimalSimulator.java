package animalSimulation.project;
import java.util.ArrayList;
import java.util.Random;

public class AnimalSimulator {
	
	//this function fills the 10x10 world with empty barren land
	public static void initializeWorld (ArrayList<ArrayList<Organism>> world)
	{
		for (int i = 0; i < 10; i ++)
		{
			world.add(new ArrayList<Organism> ());
			
			for (int j = 0; j < 10; j ++)
			{
				world.get(i).add(null);
			}
		}
	}
	
	//used to generate random numbers which serve as coordinates for organism placement
	public static int RNG ()
	{
		Random rand = new Random ();
		int randomNumber = rand.nextInt(10);
		return randomNumber;
	}
	
	//used to place the organisms randomly throughout the 10x10 world
	public static void populateWorld (ArrayList<Organism> OrganismList, ArrayList<ArrayList<Organism>> world)
	{	
		int locationInList = 0;
		
		
		while (locationInList < OrganismList.size())
		{
			int row = RNG ();
			int column = RNG ();
			
			world.get(row).set(column, OrganismList.get(locationInList));
			
			locationInList ++;
			
		}	
	}
	
	//used to travel through the world and notifies the user of any life found while on their travels
	public static void iterateWorld (ArrayList<ArrayList<Organism>> world)
	{
		for (int i = 0; i < world.size(); i ++)
		{
			for (int j = 0; j < 10; j ++)
			{
				if (world.get(i).get(j) != null)
				{
					System.out.println ("At location (" + i + ", " + j + "), the " +
							world.get(i).get(j).getName() + " is here."); 				
				}
				
				else
				{
					System.out.println ("At location (" + i + ", " + j + "), there is no life."); 
				}
				
			}
		}
	}

	public static void main(String[] args) 
	{	
		Organism bluejay, hawk, caterpillar, grasshopper, fox, wolf, deer, grass, tree, mouse, rabbit, squirrel;
		
		bluejay = new Bird ("bluejay");
		hawk= new Bird ("hawk");
		
		caterpillar = new Insect ("caterpillar");
		grasshopper = new Insect ("grasshopper");
		
		fox = new MidsizeMammal ("fox");
		wolf = new MidsizeMammal ("wolf");
		deer = new MidsizeMammal ("deer");
		
		grass = new Plant ("grass");
		tree = new Plant ("tree");
		
		mouse = new Rodent ("mouse");
		rabbit = new Rodent ("rabbit");
		squirrel = new Rodent ("squirrel");
		
		ArrayList<Organism> organismList = new ArrayList<Organism> ();
		organismList.add (bluejay);
		organismList.add (hawk);
		organismList.add (caterpillar);		
		organismList.add (grasshopper);
		organismList.add (fox);		
		organismList.add (wolf);		
		organismList.add (deer);		
		organismList.add (grass);		
		organismList.add (tree);		
		organismList.add (mouse);		
		organismList.add (rabbit);
		organismList.add (squirrel);
		
		ArrayList<ArrayList<Organism>> world = new ArrayList<ArrayList<Organism>> ();
		
		initializeWorld (world);
		
		populateWorld (organismList, world);
		
		iterateWorld (world);
	}
	

}
