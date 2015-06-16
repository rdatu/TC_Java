import java.io.*;

public class Review_Chapter6 {
	public static void main(String args[]) throws IOException{
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		ModifierDemo mDemo = new ModifierDemo();
		new ModifierDemo("s");
		String name;
		System.out.println("What is your name?");
		name = bReader.readLine();
		mDemo.setName(name);
		System.out.println(mDemo.getName());
		mDemo.setName("Rayel", "Datu");
		System.out.println(mDemo.getName());
		System.out.print("\nVarargDemo(): ");
		mDemo.varArgDemo(1,1,1,1,1,1,1,1);
		System.out.print("\nVarargDemo(): ");
		mDemo.varArgDemo("s","s","s");
		
		NestedDemo nDemo = new NestedDemo();
		NestedDemo.InnerClass ic = nDemo.new InnerClass();
		System.out.println("this is the inner class Variable str = " + ic.str);
	}
}
class ModifierDemo{
	private String name;
	ModifierDemo(){
		
	}
	ModifierDemo(String s){
		System.out.println("I am Overloaded :(");
	}
	public String getName(){
		return name + " where are you?";
	}
	public void setName(String s){
		name = s;
	}
	public void setName(String s, String s2){
		name = s + " " + s2;
	}
	public void varArgDemo(int ...s){
		System.out.println("There are " + s.length + " int arguments passed");
	}
	public void varArgDemo(String ...s){
		System.out.println("There are " + s.length + " String arguments passed");
	}
}
class NestedDemo{
	public class InnerClass{
		public String str = "S";
	}
}
