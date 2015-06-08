class Guess{
	public static void main(String args[]) throws java.io.IOException{
		System.out.println("[1] - Guess1\n[2] - Guess2\n[3] - Guess3\nChoose: ");
		char c = (char)System.in.read();	
		switch (c){
			case '1':
				Guess1(Ask(),'K');
				break;
			case '2':
				Guess2(Ask(),'K');
				break;
			case '3':
				Guess3(Ask(),'K');
				break;
			default:
				break;
		}
	}
	static char Ask() throws java.io.IOException{
		char ch;
		System.out.println("I'm thinking of a letter between A and Z. ");
		System.out.print("Can you guess it: ");
		ch = (char)System.in.read();
		ch = (char)System.in.read();
		return ch;
	}
	static void Guess1(char ch, char answer) throws java.io.IOException{
		if(ch == answer) System.out.println("** RIGHT **");
	}
	static void Guess2(char ch, char answer) throws java.io.IOException{
		if(ch == answer) System.out.println("** RIGHT **");
		else System.out.println("...Sorry, you're wrong.");
	}
	static void Guess3(char ch, char answer) throws java.io.IOException{
		if(ch == answer) System.out.println("** RIGHT **");
		else {
			System.out.print("...Sorry, you're ");
			if(ch< answer) System.out.println("too low");
			else System.out.println("too high");
		}
	}
}
