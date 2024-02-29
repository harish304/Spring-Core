package feildInjection;

public class PetrolEngine implements Engine {
	public int start() {
		System.out.println("I am a petrol Engine");
		return 1;
	}

}
