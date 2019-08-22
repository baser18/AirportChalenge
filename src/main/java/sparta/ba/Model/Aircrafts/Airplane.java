package sparta.ba.Model.Aircrafts;

public class Airplane extends Aircraft {

    private int air_serial_number = 54321;
    private String hasHull = "land plane with tyres";

    public int getAir_serial_number() {
        return air_serial_number;
    }

    public String getHasHull() {
        return hasHull;
    }
}
