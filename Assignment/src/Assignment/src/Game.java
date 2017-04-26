import java.util.ArrayList;
import java.util.Scanner;

public class Game{
	private static String gameHelp = "You Retarded boi??";
	
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
	private static Food food2 = new Food("Fruits", 10.00, 30, 25);
	private static Food food3 = new Food("Tendies", 8.00, 10, 65);
	private static Food food4 = new Food("Carrots", 13.00, 35, 10);
	private static Food food5 = new Food("Insects", 2.00, 40, 10);
	private static Food food6 = new Food("T-bone Steaks", 20.00, 50, 60);

	
	private static ArrayList<Player> Players = new ArrayList<Player>();

	
	
	public static void main(String[] args){
		int playerCount = 0;
		int gameDays = 0;
		int playerChoice = 3;
		Scanner in = new Scanner(System.in);
		
		while (playerChoice < 0 || playerChoice > 2){
		System.out.println("1. Start Game");
		System.out.println("2. Help");
		System.out.println("0. Exit");
		playerChoice = in.nextInt();
		
		if (playerChoice < 0 || playerChoice > 2){
			System.out.println("-----------------------------------------------------");
			System.out.println("Invalid Input: Please Select a Valid Number (1 to 3)");
			System.out.println("-----------------------------------------------------");
			
		}
		
		switch(playerChoice){
		case 0:
			System.out.println("Bye Faggot");
			Runtime.getRuntime().exit(0);
			break;
		case 1:
			break;
		case 2:
			System.out.println(gameHelp);
			playerChoice = 4;
			break;
		}
		
		}
		
		
		
		
		while (playerCount < 1 || playerCount > 3){
		System.out.println("-----------------------------------------------------");
		System.out.println("How many players would like to play? (1 to 3)");			/* NEEDS ERROR CATCHING   */
		playerCount = in.nextInt();
		
		if (playerCount < 1 || playerCount > 3){
			System.out.println("-----------------------------------------------------");
			System.out.println("Invalid Input: Please Select a Valid Number (1 to 3)");
			System.out.println();
			
		}
		}
		
		while (gameDays < 1 || gameDays > Integer.MAX_VALUE){
		System.out.println("-----------------------------------------------------");
		System.out.println("How many days would you like to play for?");						/* NEEDS ERROR CATCHING   */
		gameDays = in.nextInt();
		
		if (gameDays < 1 || gameDays > Integer.MAX_VALUE){
			
			System.out.println("Invalid Input: Please Select a Valid Number (1 to 3)");
			System.out.println();
		}
		}
		
		
		for (int i = 0; i < playerCount; i++){
			System.out.println("What is you name Player" + (i + 1) + "?");
			String name = in.next();											/* Needs Error Catching*/
			Player player = new Player(name);
			
			System.out.println("How many pets do you want? (1 to 3)");
			int temp = in.nextInt();
			for (int j = 0; j < temp;j++){
				System.out.println("1. Chicken");
				System.out.println("2. Budgie");
				System.out.println("3. Lizard");
				System.out.println("4. Hamster");
				System.out.println("5. Snake");
				System.out.println("6. Cow");
			
				switch(in.nextInt()){
				case 1:
					player.addPet(pet1);
					break;
				case 2:
					player.addPet(pet2);
					break;
				case 3:
					player.addPet(pet3);
					break;
				case 4:
					player.addPet(pet4);
					break;
				case 5:
					player.addPet(pet5);
					break;
				case 6:
					player.addPet(pet6);
					break;
								
				}
				System.out.println("What would you like to name the " + player.getPet(j).getSpecies() + "?");
				player.getPet(j).setName(in.next());
				
				player.getPet(j).getInfo();
			}
			
			Players.add(player);
			
			System.out.println(Players);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		in.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Player player1 = new Player("Isaac");
		Player player2 = new Player("Matt");
		
		player1.addPet(pet1);
		player2.addPet(pet6);
		
		player1.getPet(0).setName("Aids");
		player2.getPet(0).setName("Aidz");
		
		player1.printPets();
		player2.printPets();
		
		player1.getPet(0).feed(food3);
		player2.getPet(0).feed(food6);
		
		player1.getPet(0).getInfo();
		player2.getPet(0).getInfo();
		
		
		pet1.setName("Isaac");
		System.out.println();
		pet1.getInfo();
		System.out.println();
		
		
		pet1.updateHunger();
		System.out.println();
		pet1.getInfo();
		System.out.println();
		pet1.feed(food3);
		pet1.feed(food3);
		System.out.println();
		pet1.getInfo();
		pet1.toilet();
		System.out.println();
		pet1.getInfo();
		pet1.feed(food6);
		pet1.feed(food3);
		pet1.feed(food3);
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