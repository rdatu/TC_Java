class NestTrys{
	public static void main(String args[]){
		int numer[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};
		
		try{
			for(int i = 0; i<numer.length;i++){
				try{
					System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
				}
				catch (ArithmeticException exc){
					System.out.println("Can't Divide by Zero!");
				}			
			}
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("No matching element found.");
			System.out.println("Fatal error - Program Terminated.");
		}
	}
}
