package sparta.ba.Controler;

import sparta.ba.Model.Aircrafts.Aircraft;
import sparta.ba.Model.Aircrafts.Airplane;
import sparta.ba.Model.Aircrafts.SeaPlane;
import sparta.ba.Model.Flight;

public class Controller {

    Aircraft plane1 = new Airplane(1234, "tyres", 60);
    Aircraft plane2 = new Airplane(4321, "tyres", 60);
    Aircraft plane3 = new SeaPlane(9876, "hull", 20);
    //Aircraft plane4 = new SeaPlane(6543, "hull", 25);

    public void makeFlights() {
        Flight flight1 = new Flight(0, "London", "Tokyo", plane1, Flight.getFlightList());
        Flight flight2 = new Flight(1, "London", "New York", plane2, Flight.getFlightList());
        Flight flight3 = new Flight(2, "London", "Verona", plane3, Flight.getFlightList());
    }


}
