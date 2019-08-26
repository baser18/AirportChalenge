package sparta.ba.Model;

import sparta.ba.Model.Aircrafts.Aircraft;
import sparta.ba.Model.Aircrafts.Airplane;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {
//        PassengerReader passengerReader = new PassengerReader();
//        passengerReader.readFile();
//        passengerReader.addPassenger();

        Aircraft plane1 = new Airplane(1234, "tyres", 60);
        Flight flight1 = new Flight(0, "London", "Tokyo", plane1, Flight.getFlightList());

        flight1.getFlightList();
        flight1.addToFlightList();
        flight1.printFlightInfo();
        // passengerReader.getMapRecords();
        //Flight.addPassenger();
    }
}
