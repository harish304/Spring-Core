package constructerInjection;

public class Car { // targetd object


private Engine eng ; // dependented object
	
	public Car(Engine eng) {
		this.eng = eng;
	}

	public void drive() {
		int start = eng.start();

			if (start >= 1) {
				System.out.println("Journey Started...");
			} else {
				System.out.println("Engine in trouble...");
			}
		}
	}

