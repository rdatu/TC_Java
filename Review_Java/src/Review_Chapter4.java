public class Review_Chapter4 {
	public static void main(String args[]){
		SampleClass sample = new SampleClass();
		
		sample.SampleMethod();
		System.out.println("The return value of ReturnSample() is " + sample.ReturnSample());
		
		SampleClass sample2 = new SampleClass("My constructor was overloaded");
		sample2.SampleMethod(); //Display the msg in sample2.
	}
}

class SampleClass{ //Won't execute unless you call this in the main method
	private String msg = "... In a sample method inside a sample class :)";
	public static String pubVariable= "I am a class Variable";
	
	public void SampleMethod(){
		System.out.println(msg);
	}
	public int ReturnSample(){
		return 0;
	}
	SampleClass(){ //Constructor
		System.out.println("I am a Constructor");
	}
	SampleClass(String s){ //Parameterized Constructor (OVERLOADED CONSTRUCTOR)
		this.msg = s; //using this
	}
}
