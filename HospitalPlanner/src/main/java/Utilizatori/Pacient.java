package Utilizatori;

import Programari.Programare;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "pacienti")
public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer ID;
    @Column(name = "nume", nullable = false)
    private String Nume ;
    @Column(name = "premune", nullable = false)
    private String Prenume;
    @Column(name = "dataDeNastere", nullable = false)
    private String dataDeNastere;
    @Column(name = "username", nullable = false, unique = true)
    private String Username;
    @Column(name = "parola", nullable = false)
    private String Parola;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "numarDeTelefon")
    private String numarDeTelefon;
    @Column(name = "diagnostic")
    private String Diagnostic;
    @Column(name = "necisitaInsotit")
    private Boolean necesitInsotit;
//    @JsonIgnore
//    @OneToMany(mappedBy = "Pacientul")
//    private List<Programare> listaDeProgramari;


    public Pacient( String nume, String prenume, String dataDeNastere, String adresa, String username, String parola, String numarDeTelefon) {
        this.Nume=nume;
        this.Prenume = prenume;
        this.dataDeNastere = dataDeNastere;
        this.adresa= adresa;
        this.Username = username;
        this.Parola = parola;
        this.numarDeTelefon = numarDeTelefon;


    }

    public Pacient( String nume, String prenume, String dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String diagnostic) {
        this.Nume=nume;
        this.Prenume = prenume;
        this.dataDeNastere = dataDeNastere;
        this.adresa= adresa;
        this.Username = username;
        this.Parola = parola;
        this.numarDeTelefon = numarDeTelefon;
        Diagnostic = diagnostic;
    }

    public Pacient( String nume, String prenume, String dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String diagnostic, Boolean necesitInsotit) {
        this.Nume=nume;
        this.Prenume = prenume;
        this.dataDeNastere = dataDeNastere;
        this.adresa= adresa;
        this.Username = username;
        this.Parola = parola;
        this.numarDeTelefon = numarDeTelefon;
        Diagnostic = diagnostic;
        this.necesitInsotit = necesitInsotit;
    }

    public Integer getID() {
        return ID;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getDataDeNastere() {
        return dataDeNastere;
    }

    public void setDataDeNastere(String dataDeNastere) {
        this.dataDeNastere = dataDeNastere;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String parola) {
        Parola = parola;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        Diagnostic = diagnostic;
    }

    public Boolean getNecesitInsotit() {
        return necesitInsotit;
    }

    public void setNecesitInsotit(Boolean necesitInsotit) {
        this.necesitInsotit = necesitInsotit;
    }

//    public List<Programare> getListaDeProgramari() {
//        return listaDeProgramari;
//    }
//
//    public void setListaDeProgramari(List<Programare> listaDeProgramari) {
//        this.listaDeProgramari = listaDeProgramari;
//    }

    @Override
    public String toString() {
        return "Pacient{" +
                "ID=" + ID +
                ", Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", dataDeNastere='" + dataDeNastere + '\'' +
                ", Username='" + Username + '\'' +
                ", Parola='" + Parola + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numarDeTelefon='" + numarDeTelefon + '\'' +
                ", Diagnostic='" + Diagnostic + '\'' +
                ", necesitInsotit=" + necesitInsotit +
                // ", listaDeProgramari=" + listaDeProgramari +
                '}';
    }
}
