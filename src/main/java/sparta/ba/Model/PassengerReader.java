package sparta.ba.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PassengerReader {

    Scanner scanner = new Scanner(System.in);
    //Array lists for user input into hashmap
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> passportNum = new ArrayList<String>();

    private static ArrayList<Passengers> mapRecords = new ArrayList<>();

    public ArrayList<Passengers> readFile() throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader("resources/PassengerRecords.csv"));
        String line;
        fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String[] values = line.split(",");
            Passengers passengers = new Passengers(values[0], values[1]);
            mapRecords.add(new Passengers(values[0], values[1]));
        }
        return mapRecords;
    }

    public void addPassenger() {

        for (int i = 0; i < 1; i++) {
            System.out.println("Please enter Passenger Passport Number: ");
            String a = scanner.next();
            System.out.println("Please enter Passenger Name: ");
            String b = scanner.next();
            mapRecords.add(new Passengers(a, b));
            System.out.println("Passenger records: " + a + " " + b + " Successfully Uploaded ");
            //if (scanner.nextLine() == null) System.exit(0);
            System.out.println();
        }

//        public static void getMapRecords () {
//
//            System.out.println(mapRecords.toString());
//
//        }
    }
}