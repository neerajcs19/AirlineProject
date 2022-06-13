package TestClasses;
import Classes.Airline;

public class AirlineTest {
    public static void main(String[] args) {
        Airline airline1 = new Airline();

        airline1.setAirlineID("U1");
        airline1.setAirlineName("Sri Lankan Airlines");

        System.out.println(airline1);

        Airline airline2 = new Airline("M4","Malasiya Airlines");
        System.out.println("\n"+airline2);

        System.out.println(airline2.getAirlineID());
        System.out.println(airline2.getAirlineName());
    }
}
