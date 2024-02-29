package feildInjection;

import java.lang.reflect.Field;

//Feild injection is done by reflection api

public class Main {
	public static void main(String[] args) throws Exception {
	 Class<?> clz = Class.forName("feildInjection.Car");    // Loading the car class 
	Field engFeild = clz.getDeclaredField("eng");           // declearing eng variable
	engFeild.setAccessible(true);                           // accseing private variable)
	Object object = clz.newInstance();                      // Creating object by Instanec object creation method
	Car carObj = (Car) object;                              // car objected is type casted by using newley careated object
	engFeild.set(carObj, new DisealEngine());               // setting the value for eng variable
	carObj.drive();                                         // calling drive method by using  car object reference variable
	}
}