import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	
	private String playerName;
	private double playerMoney = 100;
	private ArrayList<Pet> petArray = new ArrayList<Pet>();
	private ArrayList<Toy> toyArray = new ArrayList<Toy>();
	private ArrayList<Food> foodArray = new ArrayList<Food>();
	private ArrayList<Item> itemArray = new ArrayList<Item>();
	
	Player(String name){
		playerName = name;
	}
	
	public String getName(){
		return playerName;
	}
	
	public double getBalance(){
		return playerMoney;
	}
	
	public void pay(double money){
		playerMoney -= money;
	}
	public String getItems(){
		return itemArray.get(0).getName();
	}
	
	public void addItem(Item b){
		itemArray.add(b);
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

	public String getInventory(int type){
		String inventory;
		if (itemArray.isEmpty()){
			return "Empty Inventory";
		}
		for (int i = 0;i<itemArray.size();i++){
		inventory = itemArray.toString();
		}
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

