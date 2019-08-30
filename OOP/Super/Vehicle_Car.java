package Super;

public class Vehicle_Car extends Vehicle{
int gear;

Vehicle_Car(String color, double weight,int gear) {
	
		super(color, weight);
		this.gear=gear;
			
}
@Override
void Attribute() {
	super.Attribute();
	System.out.println("Gear: "+gear);
}




}
