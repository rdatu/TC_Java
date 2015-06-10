class WriteDemo{
	public static void main(String args[]){
		int b;
		b = 'X';
		String sentence = String.format("the %s rises from the %s \n", "sun", "east");		

		System.out.write(b);
		System.out.write('\n');
		System.out.printf("the %s chased the %s for %d %s \n", "dog", "cat", 3, "days");
		System.out.format("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
		
		System.err.format("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
		
		System.out.print(sentence);
	}	
}
