package setterInjection;

public class Car {


private Engine eng ;
	
	public void setEng(Engine eng) {
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

