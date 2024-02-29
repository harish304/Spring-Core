package looselyCopuling;

import setterInjection.Car;
public class Main {
		public static void main(String[] args) {
			
			//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "setterInjection.Engine.start()" because "this.eng" is null
			//at SpringCore/setterInjection.Car.drive(Car.java:13)
			//at SpringCore/looselyCopuling.Main.main(Main.java:10)
			
			//We got nullpointer exception becasue of no value is injected to engine variable;
			Car cr = new Car();
			cr.setEng(null );
			cr.drive();
		}

	}

