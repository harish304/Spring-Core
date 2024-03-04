package in.practice.SpringFristApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	// starting iOC container
    			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    			Car car = context.getBean(Car.class);
    			car.drive();
    }
}
