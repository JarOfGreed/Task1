package adding;
import java.util.List;

import products.Product;
import products.Shield;


public class AddShield implements Adding {

	@Override
	public void execute(List <Product> equipment, String name, String form, int cost, int weight, int width, int height, int wigth) {
		equipment.add(new Shield(name, form, cost, weight, width, height, wigth));
	}
		// TODO Auto-generated method stub
}
