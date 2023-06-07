import Agenda.*;
import Utilizatori.*;

import javax.print.Doc;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Agenda agendaMea = new Agenda();
       // System.out.println(agendaMea);
        Doctor John = new Doctor("Johnul","Johnul",  "new Date(2001,12,4)",  "numar", "username", "parola","numar");
        Pacient Ion = new Pacient("Ion","Ionul", "Date(2001,12,4)", "adresa", "username","parola", "teelfon");


        Doctor Mary = new Doctor("Johnul","Johnul",  " Date(2001,12,4)",  "numar", "username", "parola","numar","adresa Spital");
        Pacient Maria = new Pacient("Ion","Ionul", "Date(2001,12,4)", "adresa", "username","parola", "teelfon","disgnostic");
        Pacient Mariuca = new Pacient("Ion","Ionul"," Date(2001,12,4)", "adresa", "username","parola", "teelfon","disgnostic", true);

        System.out.println(John.toString());
        System.out.println(Ion.toString());
        System.out.println(Mary.toString());
        System.out.println(Maria.toString());
        System.out.println(Mariuca.toString());

//        PreferintaPacient hei = new PreferintaPacient(12,John, Mary, John);
//        PreferintaPacient hei2 = new PreferintaPacient(12,John, Mary, John, "nu vreau marti");
//
//        Maria.adaugaPreferinta(hei);
//        Mariuca.adaugaPreferinta(hei2);
//
//        System.out.println(Maria.getPreferintaMea().toString());
//        System.out.println(Mariuca.getPreferintaMea().toString());
    }
}