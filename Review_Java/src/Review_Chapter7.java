class Vehicle {
	// velocity in km/hour
	private double velocity;

	// total travel time in hours
	private double travelTime;

	// total distance travelled in km
	private double distanceTravelled;

	// Brand of the Vehicle
	private String brand = "";

	// Type of Vehicle
	private String type = "";

	// Sample String
	String msg = "";

	// compute for the velocity and return it.
	double computeVelocity() {
		try {
			return distanceTravelled / travelTime;
		} catch (Exception exc) {
			return 0;
		}
	}

	// compute the distance travelled and return it
	double computeDistanceTravelled() {
		return velocity * travelTime;
	}

	// compute the total travel time and return it.
	double computeTravelTime() {
		try {
			return velocity / distanceTravelled;
		} catch (Exception exc) {
			return 0;
		}
	}

	// show all the details of the vehicle
	void showDetails() {
		System.out.println("Type: " + type + "\nBrand: " + brand
				+ "\nVelocity: " + velocity + " kph\nTravel Time: "
				+ travelTime + " hours\nDistance Travelled: "
				+ distanceTravelled + " km\n");
	}

	// Constructor of the Class Vehicle
	Vehicle(String b /* set the brand of the vehicle */, String t /* set the type of the vehicle*/) {
		brand = b;
		type = t;
	}

	Vehicle() {
		msg += "This line is called at Vehicle\n";
	}

	// getter methods
	double getVelocity() {
		return velocity;
	}

	double getDistanceTravelled() {
		return distanceTravelled;
	}

	double getTravelTime() {
		return travelTime;
	}

	String getBrand() {
		return brand;
	}

	String getType() {
		return type;
	}

	// setter methods
	void setVelocity(double v) {
		velocity = v;
	}

	void setDistanceTravelled(double d) {
		distanceTravelled = d;
	}

	void setTravelTime(double t) {
		travelTime = t;
	}
}

class Car extends Vehicle {
	Car(String b, String t) {
		super(b, t); // call the constructor of the superclass
	}

	Car() {
		msg += "This line is called at Car\n";
	}
}

class TwoSeater extends Car {

	TwoSeater(String b, String t) {
		super(b, t);
	}

	TwoSeater() {
		msg += "This line is called at TwoSeater\n";
		System.out.println("**********");
		System.out.println(msg);
	}

	@Override
	void showDetails() {
		System.out.println("Overriden Method!");
	}
}

public class Review_Chapter7 {
	public static void main(String args[]) {

		Car c = new Car("Generic", "Car");

		c.setVelocity(70);
		c.setTravelTime(8);

		c.setDistanceTravelled(c.computeDistanceTravelled());
		c.showDetails();

		TwoSeater TS = new TwoSeater("Generic", "TwoSeater");
		// Call the Lowest Level constructor the highest down to the lowest
		// level
		new TwoSeater();
		//Call the overriden method
		TS.showDetails();
	}
}
