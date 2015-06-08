class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
}
class TwoVehicles{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int range, range2;

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
	
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		range2 = sportscar.fuelcap * sportscar.mpg;
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);

	}
}
