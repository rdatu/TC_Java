class DynInit{
	public static void main(String args[]){
		double radius = 4, height = 5;
		double volume = 3.1416 * radius * radius *  height; //volume is dynamically initialized at run time.
		System.out.println("Volume is " + volume);
	}
}
