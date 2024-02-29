package TightlyCopuled;

public class Car extends Engine {

	public void DriveCar() {
		System.out.println("My car has started");
		int start = super.start();
		if(start >= 1) {
			System.out.println("Journey Has started");
		}
		
	}
}
