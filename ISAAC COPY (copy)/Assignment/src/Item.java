
public class Item {
	
	private String itemName;
	private double itemPrice;
	private int itemType;
	
	Item(String name, double price, int type){
		itemName = name;
		itemPrice = price;
		itemType = type;
	}
	public String getName(){
		return itemName;
	}
	public double getPrice(){
		return itemPrice;
	}
	public int getType(){
		return itemType;
	}
}