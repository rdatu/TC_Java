class ExcTest{
	static void genException(){
		int nums[] = new int[4];
		System.out.println("Before Exception is Generated.");
		
		nums[7] = 10;
		System.out.println("This won't be displayed");
	}
}
class ThrowableMethods{
	public static void main(String args[]){
		try{
			ExcTest.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Standard message is: ");
			System.out.println(exc);
			System.out.println("\nStack Trace: ");
			exc.printStackTrace();
		}
		System.out.prinln("After catch Statement.");
	}
}
