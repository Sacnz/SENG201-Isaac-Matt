
public class Pet {
	
	public String petName;
	public String petSpecies;
	public int petHunger;
	public int petTiredness;
	public int petMood;
	public int petAction = 2;
	public boolean petHealthy;
	public boolean petToilet;
	public boolean petAlive;
	public int petWeight;
	public int petPlayfulness;	
	public double hungerModifier;
	public double tiredModifier;
	public int petDamage;
	public String favToy;
	public String favFood;
	
	
	Pet(String species, int hungry, int tired, int moody, int weight, int playful, double hungerMod, double tiredMod, int damage, String toy, String food){
		petSpecies = species;
		petHunger = hungry;
		petTiredness = tired;
		petMood = moody;
		petHealthy = true;
		petToilet = false;
		petAlive = true;
		petWeight = weight;
		petPlayfulness = playful;
		hungerModifier = hungerMod;
		tiredModifier = tiredMod;
		petDamage = damage;
		favToy = toy;
		favFood = food;
		
	}
	
	public void setName(String name){
		petName = name;
	}
	
	
	
	public String getName(){
		return petName;
	}
	
	
	
	public String getSpecies(){
		return petSpecies;
	}
	
	
	
	public void updateHunger(){
		petHunger -= (int) (15.0 * hungerModifier);
	}
	
	
	
	public void feed(Food choice){
		petAction -= 1;
		petHunger += (int) (choice.foodNutrition);
		petMood += (int) (choice.foodTastiness);
		if (petMood > 100){
			petMood = 100;
		}
		if (petHunger > 100){
			petHunger = 100;
		}
	}
		
	
	public void toilet(){
		petAction -= 1;
		petHunger -= (int) (petHunger / 4);
		petToilet = false;
	}
	
	public void getInfo(){
		
		System.out.println("The pets name is " + petName);
		System.out.println("The pet is a " + petSpecies);
		System.out.println("It's hunger level is " + petHunger);
		System.out.println("It's tiredness level is " + petTiredness);
		if (petMood < 25){
			
		
			
		}
		System.out.println("It's mood is " + petMood);
		
		System.out.println("Your pet is healthy: " + petHealthy);
		System.out.println("Your pet needs the toilet: " + petToilet);
		System.out.println("Your pet is alive: " + petAlive);
		System.out.println("Your pet weighs: " + petWeight);
		System.out.println("Your pet's playfulness is: " + petPlayfulness);
		System.out.println("Your pet's favourite toy is a " + favToy);
		System.out.println("Your pet's favourite food are " + favFood);
	}
}
