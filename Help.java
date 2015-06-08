class Help{
	public static void main(String args[]) throws java.io.IOException{
		char choice;
		System.out.print("Help on:\n\t1. if\n\t2. switch\nChoose one: ");
		choice = (char) System.in.read();
		System.out.println();
		switch(choice){
			case '1':
				System.out.println("The if:\nif(condition) statement; else statement;");
				break;
			case '2':
				System.out.println("The switch:\nswitch(expression){\n\tcase constant: \n\t\tstatement sequence\n\t\tbreak;\n\t\t// ...\n}");
				break;
			default:
				System.out.print("Selection not found.");
		}

	} 
}
