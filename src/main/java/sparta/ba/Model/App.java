package sparta.ba.Model;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {
        PassengerReader passengerReader = new PassengerReader();
        passengerReader.readFile();
        // passengerReader.getMapRecords();
        passengerReader.addPassenger();
    }
}
