package sparta.ba.Model;

import java.time.LocalDate;

public class Passengers {

    private String first_name;
    private String last_name;
    private String gender;
    private String e_Mail;
    private String passport_Numb;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getE_Mail() {
        return e_Mail;
    }

    public void setE_Mail(String e_Mail) {
        this.e_Mail = e_Mail;
    }

    public String getPassport_Numb() {
        return passport_Numb;
    }

    public void setPassport_Numb(String passport_Numb) {
        this.passport_Numb = passport_Numb;
    }

    public Passengers (String first_name, String last_name, String gender, String e_Mail, String passport_Numb){
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.e_Mail = e_Mail;
        this.passport_Numb = passport_Numb;

    }






}
