package sparta.ba.Model.Aircrafts;

public class SeaPlane implements Aircraft {

    private int sea_serial_number;
    private String hasHull;
    private int seatNumber;

    public SeaPlane(int sea_serial_number, String hasHull, int seatNumber) {
        this.sea_serial_number = sea_serial_number;
        this.hasHull = hasHull;
        this.seatNumber = seatNumber;
    }

    public void setSea_serial_number(int sea_serial_number) {
        this.sea_serial_number = sea_serial_number;
    }

    public void setHasHull(String hasHull) {
        this.hasHull = hasHull;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
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

}
