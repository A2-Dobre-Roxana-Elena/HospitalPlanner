package Utilizatori;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import AgendaSaptamanala.Zi;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "doctori")
public class Doctor extends Utilizator {
    //@JsonIgnore
//    @OneToMany(mappedBy = "doctor")
//    private List<Pacient> listaMeaDePacienti;
    //private Agenda agendaMea;
    //@JsonIgnore
    @OneToMany(mappedBy = "doctor")
    private List<Zi> agendaSaptamanala;

    @Column(name = "adresaSpital")
    private  String adresaSpital ;

    public Doctor( String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon) {
        super( nume, prenume, dataDeNastere, username, parola, numarDeTelefon);
       // listaMeaDePacienti = new ArrayList<Pacient>();
    }

    public Doctor( String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String adresaSpital) {
        super( nume, prenume, dataDeNastere, username, parola, numarDeTelefon);
        this.adresaSpital = adresaSpital;
        //listaMeaDePacienti = new ArrayList<Pacient>();
    }

//    public void adaugaPacient(Pacient deAdaugat)
//    {
//        this.listaMeaDePacienti.add(deAdaugat);
//    }

//    public void stergePacient(Pacient deSters)
//    {
//        this.listaMeaDePacienti.remove(deSters);
//    }

//    public int NumarPacienti()
//    {
//
//        return this.listaMeaDePacienti.size();
//    }

//    public List<Pacient> getListaMeaDePacienti() {
//
//        return listaMeaDePacienti;
//    }
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
                //"listaMeaDePacienti=" + listaMeaDePacienti +
                ", adresaSpital='" + adresaSpital + '\'' +
                '}';
    }
}
