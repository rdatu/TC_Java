
public class Review_Chapter1 {
	public static void main(String args[]){
		showTitle("DATA TYPES");
		dataTypes();
		showTitle("IF EXAMPLE");
		System.out.println(ifExample());
		showTitle("IDENTIFIERS");
		identifiersExample();
	}
	static void showTitle(String s){
		System.out.println("******" + s + "******");	
	}
	static void dataTypes(){
		int int_num = 10;
		float float_num = 10.1f;
		double double_num = 10.1111111111;
		System.out.println(int_num + " is an integer type\n" + float_num + " is a float type \n" + double_num + "is a double type");
	}
	static boolean ifExample(){
		int x = 1;
		int y = 1;
		if (x == y){
			return true;
		}
		else{
			return false;
		}
	}
	static void identifiersExample(){
		int _x = 1;
		int $y = 1;
		int x = 1;
		int x1 = 1;
		System.out.println("Valid Identifiers: ");
		System.out.println("_x = " + _x);
		System.out.println("$y = " + $y);
		System.out.println("x = " + x);
		System.out.println("x1 = " + x1);		
	}
}
