import Agenda.*;
import Utilizatori.*;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.print.Doc;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//
//        Doctor John = new Doctor("Johnul","Johnul",  new Date(2001,12,4),  "numar", "username", "parola","numar");
//        Pacient Ion = new Pacient("Ion","Ionul",new Date(2001,12,4), "adresa", "username","parola", "teelfon");
//
//
//        Doctor Mary = new Doctor("Johnul","Johnul",  new Date(2001,12,4),  "numar", "username", "parola","numar","adresa Spital");
//        Pacient Maria = new Pacient("Ion","Ionul",new Date(2001,12,4), "adresa", "username","parola", "teelfon","disgnostic");
//        Pacient Mariuca = new Pacient("Ion","Ionul",new Date(2001,12,4), "adresa", "username","parola", "teelfon","disgnostic", true);
//
//        System.out.println(John.toString());
//        System.out.println(Ion.toString());
//        System.out.println(Mary.toString());
//        System.out.println(Maria.toString());
//        System.out.println(Mariuca.toString());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HospitalPlanner");


    }
}