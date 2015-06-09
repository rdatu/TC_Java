class SBlock{
	String surname = "Datu";
	static String name = "Rayel";
	static {
		System.out.println("I am inside a Static Block!");
	}
}
class StaticBlock{
	public static void main(String args[]){
		SBlock sb1 = new SBlock();
		SBlock sb2 = new SBlock();
		
		sb1.surname = "Datu pa more";
		sb2.surname = "Still Datu";
		System.out.println(sb1.surname + " " + sb2.surname + " " + SBlock.name);
	}
}
