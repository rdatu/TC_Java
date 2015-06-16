import java.io.*;
public class Review_Chapter5{
	public static void main(String args[])  throws IOException{
		ArraySample aSample = new ArraySample();
		ArraySample aSample2 = new ArraySample(2,2);
		aSample.IrregularArrays();
		System.out.println("\n");
		
		StringMethods sSample = new StringMethods("Hello");
		StringMethods sSample2 = new StringMethods();
	}
}

class ArraySample{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	ArraySample(){
		int[] arrayExample = new int[] {1,2,3,4,5};
		
		for(int i = 0; i < arrayExample.length; i++){
			System.out.println("arrayExample[" + i + "] = " + arrayExample[i] + " ");
		}
	}
	ArraySample(int dim1, int dim2) throws IOException{
		
		int[][] arrayExample = new int[dim1][dim2]; //multi-dimensional array (2)
		for(int i_dim1 = 0; i_dim1 < dim1; i_dim1++){
			for(int i_dim2 = 0; i_dim2 < dim2; i_dim2++){
				System.out.print("Enter a value for arrayExample [" + i_dim1 + "] [" + i_dim2 + "] :");
				arrayExample[i_dim1][i_dim2] = Integer.parseInt(reader.readLine());
			}
		}
		for(int i_dim1 = 0; i_dim1 < dim1; i_dim1++){
			for(int i_dim2 = 0; i_dim2 < dim2; i_dim2++){
				System.out.println("The Value of arrayExample[" + i_dim1 + "] [" + i_dim2 + "] is " + arrayExample[i_dim1][i_dim2]);
			}
		}
	}
	public void IrregularArrays(){
		int[][] a = new int[][] {
				{1,2,3},
				{4,5},
				{6}
		};
		for(int[] s : a){
			for(int t : s){
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}
}

class StringMethods{
	
	StringMethods(String s){
		System.out.println("s.equals(\"Hello\") is " + s.equals("Hello"));
		System.out.println("s.charAt(2) is " + s.charAt(2));
		System.out.println("s.compareTo(\"ello\") is " + s.compareTo("ello"));
		System.out.println("s.indexOf(\"l\") is " + s.indexOf("l"));
		System.out.println("s.lastIndexOf(\"l\") is " + s.lastIndexOf("l") );
		System.out.println("s.length() is " + s.length());
		System.out.println("s.substring(0,2) is " + s.substring(0, 2));	
	}
	StringMethods()throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String choice;
		
		System.out.print("Guess the Word (_pple) : ");
		choice = reader.readLine();
		switch(choice){
			case "apple":
				System.out.println("A fruit, Correct");
				break;
			default:
				System.out.println("WRONG");
		}
	}
}

