package looselyCopuling;

public class PetrolEngine implements Engine {

	@Override
	public int start() {
		System.out.println("i am petrol engine");
		return 1;
	}
}
