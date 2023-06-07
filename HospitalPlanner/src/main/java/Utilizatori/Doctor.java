package Utilizatori;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import AgendaSaptamanala.AgendaSaptamanala;
import AgendaSaptamanala.Zi;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "doctori")
public class Doctor  {

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
    @Column(name = "numarDeTelefon", nullable = false)
    private String numarDeTelefon;
//    @OneToMany(mappedBy = "doctor")
//    private List<Zi> agendaSaptamanala;

    @Column(name = "adresaSpital")
    private  String adresaSpital ;

    public Doctor(String nume, String prenume, String dataDeNastere, String username, String parola, String numarDeTelefon,  String adresaSpital) {
        Nume = nume;
        Prenume = prenume;
        this.dataDeNastere = dataDeNastere;
        Username = username;
        Parola = parola;
        this.numarDeTelefon = numarDeTelefon;
        this.adresaSpital = adresaSpital;
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

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

//    public List<Zi> getAgendaSaptamanala() {
//        return agendaSaptamanala;
//    }



    public String getAdresaSpital() {
        return adresaSpital;
    }

    public void setAdresaSpital(String adresaSpital) {
        this.adresaSpital = adresaSpital;
    }

}
