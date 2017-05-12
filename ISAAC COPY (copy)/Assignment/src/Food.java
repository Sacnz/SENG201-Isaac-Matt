
public class Food extends Item{

	public int foodNutrition;
	public int foodTastiness;
	
	public Food(String type, double price, int nutrition, int tastiness){
		super(type, price, 1);
		foodNutrition = nutrition;
		foodTastiness = tastiness;
		
	}

}
