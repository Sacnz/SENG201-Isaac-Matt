
public class Toy extends Item{
	
	public String toyType;
	public int toyDurability;
	public double toyPrice;
	
	Toy(String type, int durability, double price){
		super(type, price, 0);
		toyDurability = durability;
	}
	

}
