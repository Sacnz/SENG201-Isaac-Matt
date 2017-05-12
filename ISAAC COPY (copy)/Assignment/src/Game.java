import java.util.ArrayList;
import java.util.Scanner;

public class Game{
	private static String gameHelp = "You Lost boi??";
	
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

	private static Item item1 = food1;
	private static Item item2 = food2;
	private static Item item3 = food3;
	private static Item item4 = food4;
	private static Item item5 = food5;
	private static Item item6 = food6;
	private static Item item7 = toy1;
	private static Item item8 = toy2;
	private static Item item9 = toy3;
	private static Item item10 = toy4;
	private static Item item11 = toy5;
	private static Item item12 = toy6;
	
	
	private static ArrayList<Player> Players = new ArrayList<Player>();

	public static void Store(int player, Scanner in){
		int option = 20;
		while (option != 0){
		System.out.println(food1.getName());
		System.out.println(food2.getName());
		System.out.println(food3.getName());
		System.out.println(food4.getName());
		System.out.println(food5.getName());
		System.out.println(food6.getName());
		option = in.nextInt();
		
		switch(option){
		case 1:
			buy(item1, player, in);
			break;
		case 2:
			buy(item2, player, in);
			break;
		case 3:
			buy(item3, player, in);
			break;
		case 4:
			buy(item4, player, in);
			break;
		case 5:
			buy(item5, player, in);
			break;
		case 6:
			buy(item6, player, in);
			break;
		}

		
	}return;}
	
	public static void buy(Item choice, int player, Scanner in){

		System.out.println();
		System.out.print("How many do you want? ");
		int amount = in.nextInt();
		if (Players.get(player).getBalance() < (double) (amount * choice.getPrice())){
			System.out.println("$" + (double) (choice.getPrice() * amount));
			System.out.println("Sorry, you cannot make this purchase you have: $" + Players.get(player).getBalance());
		}
		else{
			Players.get(player).addItem(choice);
			Players.get(player).pay((double)(choice.getPrice()*amount));
			
		}
			

		return;
	}
	public static void play(Scanner in, int player){
		
		System.out.println(Players.get(player).getInventory(0));
		
		return;
	}
	
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
			System.out.println("Bye");
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
			
			Pet pet1 = new Pet("Chicken", 60, 55, 75, 90, 60, 1.5, 1.0, 5, "Rubber Chicken", "Tendies");
			Pet pet2 = new Pet("Budgie", 65, 40, 85, 60, 80, 1.1, 2.0, 5, "Rope", "Seeds");
			Pet pet3 = new Pet("Lizard", 55, 80, 50, 85, 70, 1.2, 3.0, 15, "Sock", "Insects");
			Pet pet4 = new Pet("Hamster", 50, 60, 40, 80, 95, 1.6, 1.9, 8, "Ball", "Fruit");
			Pet pet5 = new Pet("Snake", 40, 50, 80, 70, 65, 1.9, 1.5, 7, "Bone", "T-Bone Steak");
			Pet pet6 = new Pet("Cow", 40, 90, 90, 100, 50, 2.0, 1.8, 10, "Stuffed Animal", "Carrots");
			
			
			System.out.println("What is you name Player" + (i + 1) + "?");
			String name = in.next();											/* Needs Error Catching*/
			Player player = new Player(name);
			
			
			System.out.println("How many pets do you want? (1 to 3)");
			int temp = in.nextInt();
			int j = 0;
			
			
			while (j < temp){
				Pet currentChoice = null;
				boolean acceptPet = false;
				System.out.println("Please select a pet to view info.");
				System.out.println("1. Chicken");
				System.out.println("2. Budgie");
				System.out.println("3. Lizard");
				System.out.println("4. Hamster");
				System.out.println("5. Snake");
				System.out.println("6. Cow");
				
				switch(in.nextInt()){
				case 1:
					pet1.getInfo();
					currentChoice = pet1;
					break;
				case 2:
					pet2.getInfo();
					currentChoice = pet2;
					break;
				case 3:
					pet3.getInfo();
					currentChoice = pet3;
					break;
				case 4:
					pet4.getInfo();
					currentChoice = pet4;
					break;
				case 5:
					pet5.getInfo();
					currentChoice = pet5;
					break;
				case 6:
					pet6.getInfo();
					currentChoice = pet6;
					break;	
							
				}
				if (currentChoice.isPicked() == true){
					System.out.println();
					System.out.println("You already have this pet, please choose another.");
				}
				else{
				System.out.println("1. Choose Pet");
				System.out.println("2. Back to Pet Select");
				switch(in.nextInt()){

				case 1:
					currentChoice.setPicked();
					player.addPet(currentChoice);
					acceptPet = true;
					break;
				case 2:
					acceptPet = false;
					break;
				}
				if (acceptPet == true){
				System.out.println("What would you like to name the " + player.getPet(j).getSpecies() + "?");
				player.getPet(j).setName(in.next());
				j += 1;
				}
			}
			}
			Players.add(player);
			
		}
		
		for (int day = 0; day <= gameDays; day++){

			System.out.println();
			System.out.println("Start of Day " + day);
			for (int player = 0; player < playerCount; player++ ){
				System.out.println();
				System.out.println(Players.get(player).getName() + " it is your go.");
				System.out.println();
				for (int pet = 0; pet < Players.get(player).getPetSize(); pet++){
					while (Players.get(player).getPet(pet).getTurns() >= 1){

						System.out.println();
						System.out.println("1. View Status of Pet.");
						System.out.println("2. View Balance");
						System.out.println("3. Visit Store.");
						System.out.println("4. Feed Pet.");
						System.out.println("5. Play with Pet.");
						System.out.println("6. Put pet to sleep.");
						System.out.println("7. Let the pet go Toilet.");
						System.out.println("8. Move to next day.");
						
						int option = in.nextInt();
						
						switch(option){
						case 1:
							Players.get(player).getPet(pet).getStatus();
							break;
						case 2:
							System.out.println(Players.get(player).getBalance());
							
							break;
						case 3:
							Store(player, in);
							
							break;
						case 4:
							Players.get(player).getPet(pet).action();
							
							break;
						case 5:
							play(in, player);
							Players.get(player).getPet(pet).action();
							
							break;
						case 6:
							Players.get(player).getPet(pet).action();
							
							break;
						case 7:
							Players.get(player).getPet(pet).action();
							
							break;
						case 8:
							break;
						case 9:
							break;
						
				}
	
				}
				}
			}
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