import java.io.*;
public class Review_Chapter3 {
	public static void main(String args[])throws IOException {
		Review_Chapter1.showTitle("Input Character");
		InputCharacter();
		Review_Chapter1.showTitle("Using Break");
		UseBreak();
		Review_Chapter1.showTitle("Nested Loop");
		NestedLoop();
	}
	static void InputCharacter() throws IOException {
		char ch;
		System.out.println("Enter a single character");
		ch = (char) System.in.read();
		System.out.println("You've entered " + ch);
	}
	static void UseBreak(){
		for(int x = 1; x<=5;x++){
			System.out.println(x);
			if(x == 3){
				break;
			}
		}
	}
	static void NestedLoop(){
		for(int x = 1; x <= 5 ; x++){
			for(int y = 1 ; y <= x ; y++){
				System.out.print(y);
			}
			System.out.println();
		}
	}
}
