import Item.*;
import java.io.*;
import java.util.ArrayList;
public class Review_Chapter8 {

	public static void main(String args[]) throws IOException {
		ArrayList<Furniture> arrList = new ArrayList<Furniture>();
		

	}

}

class Furniture extends Consumables{
	protected Furniture(int q) {
		super(q);
		// TODO Auto-generated constructor stub
	}	
	protected Furniture(int q, String n){
		super(q,n);
	}
	
	@Override
	protected int getQuantity() {
		return quantity;
	}
}