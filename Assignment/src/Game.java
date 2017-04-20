
public class Game {
	
	private static Pet pet1 = new Pet("Chicken", 60, 55, 75, 90, 60, 1.5, 1.0, 5, "Rubber Chicken", "Tendies");
	private static Pet pet2 = new Pet("Budgie", 65, 40, 85, 60, 80, 1.1, 2.0, 5, "Rope", "Seeds");
	private static Pet pet3 = new Pet("Lizard", 55, 80, 50, 85, 70, 1.2, 3.0, 15, "Sock", "Insects");
	private static Pet pet4 = new Pet("Hamster", 50, 60, 40, 80, 95, 1.6, 1.9, 8, "Ball", "Fruit");
	private static Pet pet5 = new Pet("Snake", 40, 50, 80, 70, 65, 1.9, 1.5, 7, "Bone", "T-Bone Steak");
	private static Pet pet6 = new Pet("Cow", 40, 90, 90, 100, 50, 2.0, 1.8, 10, "Stuffed Animal", "Carrots");
	
	private static Toy toy1 = new Toy("Bone", 50, 15.00);
	private static Toy toy2 = new Toy("Ball", 30, 25.00);
	private static Toy toy3 = new Toy("Rope", 40, 10.00);
	private static Toy toy4 = new Toy("Stuffed Animal", 80, 35.00);
	private static Toy toy5 = new Toy("Rubber Chicken", 75, 30.00);
	private static Toy toy6 = new Toy("Sock", 20, 5.00);
	
	private static Food food1 = new Food("Seeds", 5.00, 20, 10);
	private static Food food2 = new Food("Fruit", 10.00, 30, 25);
	private static Food food3 = new Food("Tendies", 8.00, 10, 65);
	private static Food food4 = new Food("Carrots", 13.00, 35, 10);
	private static Food food5 = new Food("Insects", 2.00, 40, 10);
	private static Food food6 = new Food("T-bone Steak", 20.00, 50, 60);
	
	
	
	public static void main(String[] args){
		pet1.setName("Isaac");
		System.out.println();
		pet1.getInfo();
		System.out.println();
		
		
		pet1.updateHunger();
		System.out.println();
		pet1.getInfo();
		
		/*pet2.getInfo();
		System.out.println();
		pet3.getInfo();
		System.out.println();
		pet4.getInfo();
		System.out.println();
		pet5.getInfo();
		System.out.println();
		pet6.getInfo();*/
	}

}