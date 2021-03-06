package sparta.ba.Model.Aircrafts;

public class Airplane implements Aircraft {

    private int air_serial_number;
    private String hasTyres;
    private int seatNumber;


    public Airplane(int air_serial_number, String hasTyres, int seatNumber) {
        this.air_serial_number = air_serial_number;
        this.hasTyres = hasTyres;
        this.seatNumber = seatNumber;
    }

    public int getAir_serial_number() {
        return air_serial_number;
    }

    public String getHasHull() {
        return hasTyres;
    }

    @Override
    public void canLiftOff() {
        System.out.println("The plane took off the runway");
    }

    @Override
    public void CanLand() {
        System.out.println("Plane as landed");
    }
}
