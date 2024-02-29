package looselyCopuling;

public class Car {
private Engine eng;
public Car(Engine eng) {
	this.eng = eng;
}
public void Drive() {
	int start = eng.start();
if(start >= 1) {
	System.out.println("journey Started");
}
else {
	System.out.println("Journey Not Started");
}
}
}
