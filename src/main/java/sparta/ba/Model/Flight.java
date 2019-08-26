package sparta.ba.Model;

import sparta.ba.Model.Aircrafts.Aircraft;
import sparta.ba.Model.Aircrafts.Airplane;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    public Aircraft airCraft;
    private static ArrayList<Passengers> flightList = new ArrayList<>();


    public Flight(int flightNumber, String origin, String destination, Aircraft aircraft, ArrayList<Passengers> flightList) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.flightList = flightList;
    }

    Scanner scanner = new Scanner(System.in);

//
//    public int getFlightNumber() {
//        return flightNumber;
//    }
//
//    public void setFlightNumber(int flightNumber) {
//        int max = 2000;
//        int min = 1000;
//        int random = (int) (Math.random() * 50 + 1);
//        this.flightNumber = random;
//    }
//
//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public Aircraft getAirCraft() {
//        return airCraft;
//    }
//
//    public void setAirplane(Airplane airplane) {
//        this.airCraft = airplane;
//    }

    public static ArrayList<Passengers> getFlightList() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("PassengerRecords.csv"));
        String line;
        //fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String[] values = line.split(",");
            Passengers passengers = new Passengers(values[0], values[1]);
            flightList.add(new Passengers(values[0], values[1]));
        }
        return flightList;
    }


    public void addToFlightList() throws IOException {

        FileWriter writer = new FileWriter("target/PassengerList1.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("PassengerList1.csv", true));
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        for (int i = 0; i < 1; i++) {
            System.out.println("Please enter Passenger Name: ");
            String name = scanner.next();
            System.out.println("Please enter Passenger Passport Number: ");
            String passportN = scanner.next();
            flightList.add(new Passengers(name, passportN));

            System.out.println("Passenger records: " + name + " " + passportN + " Successfully Uploaded ");

            getPassengerFlightList();

            System.out.println("-----------------------------------------------------------");
        }
    }

    public void getPassengerFlightList() {
        //for loop prints array values thanks overridden to String
        System.out.println("---------------- Latest plane Passenger List ------------------");
        for (Passengers p : flightList) {
            System.out.println(p);
        }
    }

    public void printFlightInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Aircraft:" + airCraft);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Number of passengers on board: " + flightList.size());
        if (flightList.size() > 0) {
            System.out.println("passenger list: ");
            getPassengerFlightList();
        }
    }

}

