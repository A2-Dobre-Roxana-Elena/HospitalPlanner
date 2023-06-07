import Agenda.*;
import Utilizatori.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.print.Doc;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Doctor John = new Doctor("Johnul","Johnul",  "2001,12,4",  "numar", "username", "parola","Spiridon");
        Pacient Ion = new Pacient("Ion","Ionul","2001,12,4", "adresa", "username","parola", "teelfon");
        ///Doctor Mary = new Doctor("Johnul","Johnul",  new Date(2001,12,4),  "numar", "username", "parola","numar","adresa Spital");
        Pacient Maria = new Pacient("Ion","Ionul","2003.04.08", "adresa", "username","parola", "teelfon","disgnostic");





    }
}