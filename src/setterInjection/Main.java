package setterInjection;

public class Main {
	public static void main(String[] args) {
		Car cr = new Car();
		cr.setEng(new PetrolEngine());
		cr.drive();
	}

}
