
public class Pet {
	
	private String petName;
	private String petSpecies;
	private int petHunger;
	private int petTiredness;
	private int petMood;
	private int petAction = 2;
	private boolean petHealthy;
	private boolean petToilet;
	private boolean petAlive;
	private int petWeight;
	private int petPlayfulness;	
	private double hungerModifier;
	private double tiredModifier;
	private int petDamage;
	private String favToy;
	private String favFood;
	private boolean picked = false;
	
	
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
	
	public boolean isPicked(){
		return picked;
	}
	public void setPicked(){
		picked = true;
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
	
	public int getTurns(){
		return petAction;
	}
	public void action(){
		petAction -= 1;
	}
	
	public void getInfo(){
		System.out.println("The pet is a " + petSpecies);
		System.out.println("This pet's favourite toy is a " + favToy);
		System.out.println("This pet's favourite food is/are " + favFood);
		System.out.println("Your pet weighs: " + petWeight);
	}
	
	public void getStatus(){
		
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
