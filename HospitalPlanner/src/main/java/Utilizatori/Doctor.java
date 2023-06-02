package Utilizatori;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Agenda.Agenda;

public class Doctor extends Utilizator {
    private List<Pacient> listaMeaDePacienti;
    private Agenda agendaMea;
    private  String adresaSpital ;

    public Doctor(String ID, String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon) {
        super(ID, nume, prenume, dataDeNastere, adresa, username, parola, numarDeTelefon);
        this.agendaMea = new Agenda();
        listaMeaDePacienti = new ArrayList<Pacient>();
    }

    public Doctor(String ID, String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String adresaSpital) {
        super(ID, nume, prenume, dataDeNastere, adresa, username, parola, numarDeTelefon);
        this.adresaSpital = adresaSpital;
        this.agendaMea = new Agenda();
        listaMeaDePacienti = new ArrayList<Pacient>();
    }

    public void adaugaPacient(Pacient deAdaugat)
    {
        this.listaMeaDePacienti.add(deAdaugat);
    }

    public void stergePacient(Pacient deSters)
    {
        this.listaMeaDePacienti.remove(deSters);
    }

    public int NumarPacienti()
    {
        return this.listaMeaDePacienti.size();
    }

    public List<Pacient> getListaMeaDePacienti() {
        return listaMeaDePacienti;
    }

    public Agenda getAgendaMea() {
        return agendaMea;
    }

    public String getAdresaSpital() {
        return adresaSpital;
    }

    ///se poate modifica locul unde lucreaza
    public void setAdresaSpital(String adresaSpital) {
        this.adresaSpital = adresaSpital;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString()+
                "listaMeaDePacienti=" + listaMeaDePacienti +
                ", agendaMea=" + agendaMea +
                ", adresaSpital='" + adresaSpital + '\'' +
                '}';
    }
}
