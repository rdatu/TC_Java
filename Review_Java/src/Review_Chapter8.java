import Item.*;
import java.io.*;
import java.util.ArrayList;
public class Review_Chapter8{

	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Furniture> furnitureList = new ArrayList<Furniture>();
		boolean bContinue;
		String input;
		
		do{
			bContinue = true;
			System.out.println("Add an item(y/n): ");
			if(reader.readLine().equalsIgnoreCase("y")){
				System.out.println("Name of Item: ");
				input = reader.readLine();
				
				if(!checkifExisting(input,furnitureList ))
					furnitureList.add(new Furniture(input));
			}				
			else
				bContinue = false;				
		}while(bContinue);
		
		do{
			bContinue = true;
			System.out.println("[STR]Store Item\n[REM]Remove Item\nEnter Command:");
			switch(reader.readLine()){
				case "STR":
					break;
				case "REM":
					break;
				default:
			}
		}while(bContinue);
		
	}
	
	static boolean checkifExisting(String item, ArrayList<Furniture> f){
		boolean bExists = false;
		for(Furniture o : f){
			if(item.equalsIgnoreCase(o.objectName)){
				System.out.println(o.objectName + " exists");
				return true;
			}				
			else{
				bExists = false;
			}
		}
		return bExists;
	}
	
}

