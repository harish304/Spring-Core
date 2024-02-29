package feildInjection;

public class Car { // targeted object


private Engine eng ; // dependent object
	public void drive() {
		int start = eng.start();

			if (start >= 1) {
				System.out.println("Journey Started...");
			} else {
				System.out.println("Engine in trouble...");
			}
		}
	}

