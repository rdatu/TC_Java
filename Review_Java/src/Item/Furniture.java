package Item;

public class Furniture extends Item{

	public Furniture(String name) {
		super(name);
	}

	@Override
	public void store() {
		storedQuantity += quantityToStore;
		quantityToStore = 0;
	}

	@Override
	public void remove(int r) {
		storedQuantity -= r;		
	}

}