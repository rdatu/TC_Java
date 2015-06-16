
public class Review_Chapter2 {
	
	
	public static void main(String args[]){
		Review_Chapter1.showTitle("DATA TYPES");
		Review_Chapter1.dataTypes();
		Review_Chapter1.showTitle("MORE DATA TYPES");
		moreDataTypes();
	}
	static void moreDataTypes(){
		boolean bExample = true;
		byte byte_Example = 1;
		char ch_Example = 'x';
		long l_Example = 111;
		System.out.println("Data Type\tValue\tRange");
		System.out.println("---------------------------------------");
		System.out.println("boolean\t\t" + bExample + "\ttrue or false");
		System.out.println("byte\t\t" + byte_Example + "\t-128 to 127");
		System.out.println("char\t\t: " + ch_Example + "\t0 to 65,536");
		System.out.println("long\t\t: " + l_Example + "\t-9,223,372,036,854,775,808 to 9,223,372,036,854,775,808");
	}
}
