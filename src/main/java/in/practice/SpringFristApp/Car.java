package in.practice.SpringFristApp;

public class Car {
	private Engine eng;
	
	public Car(Engine eng) {
		this.eng = eng;

	/*public void setEng(Engine eng) {
		this.eng = eng;*/
	}
	public void drive() {
		int start = eng.Start();
		if(start >= 1) {
			System.out.println("Car is started ");
		}
		else {
			System.out.println("Car is not started");
		}
		}

}
