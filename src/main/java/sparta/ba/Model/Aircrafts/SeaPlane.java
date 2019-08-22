package sparta.ba.Model.Aircrafts;

public class SeaPlane extends Aircraft {

    private int sea_serial_number = 12345;
    private String hasTyres = "sea plane with no tyres";

    /**
     * liftOff here changed behaviour instead of taking off the runway now is taking off the water that's why
     * the method was overriden
     **/
    @Override
    public void canLiftOff() {
        System.out.println("The plane took off the Lake");
    }

    public int getSea_Serial_number() {
        return sea_serial_number;
    }

    public String getHasTyres() {
        return hasTyres;
    }
}
