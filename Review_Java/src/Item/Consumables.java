package Item;

public abstract class Consumables {
	protected int quantity;
	public String name;
	
	protected Consumables(int q) {
		quantity = q;
	}
	protected Consumables(int q,String n){
		quantity = q;
		name = n;
	}
	protected abstract int getQuantity();
}

