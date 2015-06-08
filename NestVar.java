class NestVar{
	public static void main(String args[]){
		int count;
		for(count = 0; count < 10; count = count + 1){
			System.out.println("This is count: " + count);
			//int count; // Illegal!!!!
			for(count = 0; count < 2;count++) //Infinite Loop: count > 2 already
				System.out.println("This program is in Error!");
		}
	}
}
