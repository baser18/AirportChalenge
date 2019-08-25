package sparta.ba.Model.Aircrafts;

public class SeaPlane implements Aircraft {

    private int sea_serial_number = 12345;
    private String hasHull = "sea plane with no tyres";
    private int seatNumber = 10;

    /**
     * liftOff here changed behaviour instead of taking off the runway now is taking off the water that's why
     * the method was overriden
     **/
    @Override
    public void canLiftOff() {
        System.out.println("The plane took off the Lake");
    }

    @Override
    public void CanLand() {
        System.out.println("Plane as landed on water");
    }

    public int getSea_Serial_number() {
        return sea_serial_number;
    }

    public String getHasHull() {
        return hasHull;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
