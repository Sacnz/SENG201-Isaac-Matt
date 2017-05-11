import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	
	public String playerName;
	public float playerMoney = 100;
	private ArrayList<Pet> petArray = new ArrayList<Pet>();
	private ArrayList<Toy> toyArray = new ArrayList<Toy>();
	private ArrayList<Food> foodArray = new ArrayList<Food>();
	
	Player(String name){
		playerName = name;
	}
	
	public String getName(){
		return playerName;
	}
	
	public void addFood(Pet b){
		petArray.add(b);
	}
	
	public void addPet(Pet b){
		petArray.add(b);
	}
	
	public Pet getPet(int i){
		return petArray.get(i);
	}
	
	public int getPetSize(){
		return petArray.size();
	}
	
	public void printPets(){
		for (int i=0; i < petArray.size(); i++){
			System.out.println(petArray.get(i).getName());
		}
		
	}

	public String getInventory(){
		String inventory;
		if (foodArray.isEmpty() & toyArray.isEmpty()){
			return "Empty Inventory";
		}
		inventory = foodArray.toString() + toyArray.toString();
		return inventory;
		}
	/*public static void main(String[] args) {
		Player a = new Player("andy");
		Pet b = new Pet("billy");
		Pet c = new Pet("willy");
		Pet d = new Pet("silly");
		
	
		a.addPet(b);
		a.addPet(c);
		a.addPet(d);
		
		
		System.out.println(b.getName());
		System.out.println(c.getName());
		System.out.println(d.getName());
		System.out.println(a.getName());
		
		a.printPets();
	}*/
}

