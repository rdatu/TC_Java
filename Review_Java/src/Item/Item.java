package Item;

public abstract class Item implements Storehouse{
	protected String manufacturer;
	public String objectName;
	protected String category;
	protected int storedQuantity;
	protected int quantityToStore;
	Item(String name){
		objectName = name;
	}
}
