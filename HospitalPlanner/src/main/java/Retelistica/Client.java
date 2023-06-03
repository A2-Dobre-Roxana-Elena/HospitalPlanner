package Retelistica;

import Utilizatori.Doctor;
import Utilizatori.Pacient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class Client {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 9090;

    public static void afisareMeniuDoctor()
    {
        System.out.println("Meniul pentru Doctor este:");
        System.out.println("1. Afiseaza mi agenda");
        System.out.println("2. Afiseaza-mi lista de pacienti");
        System.out.println("3. Afiseaza mi numarul de pacienti");
        System.out.println("4. Schimba  adresa spitalului la care lucrez");
        System.out.println("5. Schimba Specializarea spitalului");
        System.out.println("6. Deconecteaza-ma din cont");
    }

    public static void afisareMeniuPacient()
    {
        System.out.println("Meniul pentru Pacient este:");
        System.out.println("1. Afiseaza mi programarile");
        System.out.println("2. Fa o programare obisnuita ");
        System.out.println("3. Fa o programare urgenta");
        System.out.println("4. Deconecteaza-ma din cont");
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP,SERVER_PORT);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard =  new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        boolean suntDoctor = false;

//        System.out.println("Ce tip de utilizator sunteti? Apasati 1 pentru Doctor si 2 pentru Pacient");
//        String cineSunt = keyboard.readLine();
//
//        if (cineSunt.equals("1"))
//        {
//            suntDoctor = true;
//        }
//        else
//        {
//            suntDoctor = false;
//        }

        System.out.println("Meniu Initial");
        System.out.println("1. Logare");
        System.out.println("2. Creare Cont");


        boolean suntConectat = false;

        String comanda = keyboard.readLine();
        if (comanda.equals("1")) {
            while(!suntConectat)
            {

            System.out.println("Introduceti username: ");
            String username = keyboard.readLine();
            System.out.println("Introduceti parola: ");
            String parola = keyboard.readLine();
                /// cautare in lista utilizator
            suntConectat = true;
            suntDoctor = true; ///asta va trebui verificat
            }
        }
        else {
            System.out.println("Ce tip de utilizator sunteti? Apasati 1 pentru Doctor si 2 pentru Pacient");
            comanda = keyboard.readLine();
            if (comanda.equals("1")) {
                while(!suntConectat)
                {
                    suntDoctor = true;
                    System.out.println("Introduceti nume: ");
                    String nume = keyboard.readLine();
                    System.out.println("Introduceti prenume: ");
                    String prenume = keyboard.readLine();
                    //System.out.println("Introduceti data de nastere: ");
                    Date dataNastere = new Date(2001,12,12);
                    System.out.println("Introduceti adresa domiciliului: ");
                    String adresaDomiciuliu = keyboard.readLine();
                    System.out.println("Introduceti username: ");
                    String username = keyboard.readLine();
                    System.out.println("Introduceti parola: ");
                    String parola = keyboard.readLine();
                    System.out.println("Introduceti numar de telefon: ");
                    String numarTelefon = keyboard.readLine();
                    System.out.println("Introduceti adresa de la spitalul in care lucrati: ");
                    String adresaSpital = keyboard.readLine();

                    /// cautare in lista utilizator sa vedem daca e unic
                    suntConectat = true;

                    //Doctor utilizator = new Doctor("1",nume, prenume,dataNastere,adresaDomiciuliu,username,parola, numarTelefon, adresaSpital);
                }

            } else if (comanda.equals("2")) {
                while(!suntConectat)
                {
                    suntDoctor = false;
                    System.out.println("Introduceti nume: ");
                    String nume = keyboard.readLine();
                    System.out.println("Introduceti prenume: ");
                    String prenume = keyboard.readLine();
                    //System.out.println("Introduceti data de nastere: ");
                    Date dataNastere = new Date(2001,22,12);
                    System.out.println("Introduceti adresa domiciliului: ");
                    String adresaDomiciuliu = keyboard.readLine();
                    System.out.println("Introduceti username: ");
                    String username = keyboard.readLine();
                    System.out.println("Introduceti parola: ");
                    String parola = keyboard.readLine();
                    System.out.println("Introduceti numar de telefon: ");
                    String numarTelefon = keyboard.readLine();
                    System.out.println("Introduceti diagnosticul ");
                    String diagnostic = keyboard.readLine();
                    System.out.println("Necesitati sa fiti insotit? ");
                    String raspuns = keyboard.readLine();
                    boolean amNevoie;
                    if(raspuns.equals("da"))
                        amNevoie = true;
                    else
                        amNevoie = false;

                    /// cautare in lista utilizator sa vedem daca nu mai are altcineva datele astea
                    suntConectat = true;

                    //Pacient utilizator = new Pacient("1", nume,prenume,dataNastere, adresaDomiciuliu, username, parola, numarTelefon, diagnostic, amNevoie);
                }

            }
        }



        while (true)
        {
            if(suntDoctor)
            {
                afisareMeniuDoctor();
                comanda = keyboard.readLine();
                if( comanda.equals("deconectare"))
                    break;

                out.println("1"+comanda);

            } else {
                afisareMeniuPacient();
                comanda = keyboard.readLine();
                if( comanda.equals("deconectare"))
                    break;
                out.println("2"+comanda);
            }

            String serverResponse = input.readLine();
            System.out.println("[CLIENT] Serverul spune: "+ serverResponse);
        }

        socket.close();
        System.exit(0);
    }


}

