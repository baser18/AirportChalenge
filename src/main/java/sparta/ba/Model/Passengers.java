package sparta.ba.Model;

public final class Passengers {

    private String first_name;
    private String passport_Numb;

    public Passengers(String first_name, String passport_Numb) {

        this.first_name = first_name;
        this.passport_Numb = passport_Numb;
    }

    @Override
    public String toString() {
        return "Passport Number: " + this.getPassport_Numb() + " - Passenger Name: " + this.getFirst_name();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPassport_Numb() {
        return passport_Numb;
    }

    public void setPassport_Numb(String passport_Numb) {
        this.passport_Numb = passport_Numb;
    }

}
