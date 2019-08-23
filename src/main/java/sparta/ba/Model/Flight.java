package sparta.ba.Model;

import sparta.ba.Model.Aircrafts.Airplane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private Airplane airplane;
    private static ArrayList<Passengers> flightList;


    public Flight(int flightNumber, String origin, String destination, Airplane airplane, ArrayList<Passengers> flightList) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.airplane = airplane;
        this.flightList = flightList;
    }

    Scanner scanner = new Scanner(System.in);

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        int max = 2000;
        int min = 1000;
        int random = (int) (Math.random() * 50 + 1);
        this.flightNumber = random;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public static ArrayList<Passengers> getFlightList() {
        return flightList;
    }

    public static void setFlightList(ArrayList<Passengers> flightList) {
        Flight.flightList = flightList;
    }

    public void addToFlightList(Passengers passengers) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter Passenger Name: ");
            String name = scanner.next();
            System.out.println("Please enter Passenger Passport Number: ");
            String passportN = scanner.next();
            flightList.add(new Passengers(name, passportN));

            System.out.println("Passenger records: " + name + " " + passportN + " Successfully Uploaded ");
        }
    }

    public void getPassengerFlightList() {
        //for loop prints array values thanks to to String
        System.out.println("---------------- list of Passengers on plane ------------------");
        for (Passengers p : flightList) {
            System.out.println(p);
        }
    }

    public void printFlightInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Number of passengers on board: " + flightList.size());
        if (flightList.size() > 0) {
            System.out.println("passenger list: ");
            getPassengerFlightList();
        }
    }
}

