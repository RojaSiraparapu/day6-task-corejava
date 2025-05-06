public class Car
{
  public static String companyName="Honda";
  String carModel="Civic";
public static void main(String [] args)
{
	Car car=new Car();
        System.out.println("Company name:"+Car.companyName);
        System.out.println("Company model 1:"+car.carModel);
        Car car1=new Car();
	car1.carModel="Accord";
        System.out.println("car1 model 2:"+car1.carModel);
 }
}
 
          


	
	