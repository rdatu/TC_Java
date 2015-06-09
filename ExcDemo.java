class ExcDemo{
	public static void main(String args[]){
		int nums[] = new int[4];
		try {
			nums[7] = 10;
			System.out.println("Before Exception is generated.");
		}catch (ArrayIndexOutOfBoundsException exc){
			System.out.println("Index out-of-bounds!");
		}
		System.out.println("After catch statement.");
	}
}
