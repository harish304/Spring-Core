package constructerInjection;

public class Main {
	public static void main(String[] args) {
		Car cr = new Car(new PetrolEngine());
		cr.drive();
	}

}
