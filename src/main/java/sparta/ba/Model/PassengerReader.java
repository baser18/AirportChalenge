package sparta.ba.Model;

import java.io.*;
import java.util.*;

public class PassengerReader {

    Scanner scanner = new Scanner(System.in);

    private static ArrayList<Passengers> mapRecords = new ArrayList<>();

    public ArrayList<Passengers> readFile() throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader("PassengerRecords.csv"));
        String line;
        //fileReader.readLine();
        while ((line = fileReader.readLine()) != null) {
            String[] values = line.split(",");
            Passengers passengers = new Passengers(values[0], values[1]);
            mapRecords.add(new Passengers(values[0], values[1]));
        }
        return mapRecords;
    }

    public void addPassenger() throws IOException {

        FileWriter writer = new FileWriter("target/PassengerRecords.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("PassengerRecords.csv", true));
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        for (int i = 0; i < 1; i++) {
            System.out.println("Please enter Passenger Name: ");
            String name = scanner.next();
            System.out.println("Please enter Passenger Passport Number: ");
            String passportN = scanner.next();
            mapRecords.add(new Passengers(name, passportN));

            printWriter.println(name + "," + passportN);
            printWriter.flush();
            printWriter.close();

            System.out.println("Passenger records: (" + name + " , " + passportN + ") Successfully Uploaded ");

            returnList();

        }

    }

    public void returnList() {
        //for loop prints array values thanks to to String
        System.out.println("---------------- list of saved Passengers ------------------");
        for (Passengers p : mapRecords) {
            System.out.println(p);
        }
    }

}

