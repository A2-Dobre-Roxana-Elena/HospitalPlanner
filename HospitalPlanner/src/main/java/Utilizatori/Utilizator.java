package Utilizatori;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Utilizator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer ID;
    @Column(name = "nume", nullable = false)
    private String Nume ;
    @Column(name = "premune", nullable = false)
    private String Prenume;
    @Column(name = "dataDeNastere", nullable = false)
    private Date dataDeNastere;
    @Column(name = "username", nullable = false, unique = true)
    private String Username;
    @Column(name = "parola", nullable = false)
    private String Parola;
    @Column(name = "numarDeTelefon", nullable = false)
    private String numarDeTelefon;

    public Utilizator( String nume, String prenume, Date dataDeNastere, String username, String parola, String numarDeTelefon) {
        Nume = nume;
        Prenume = prenume;
        this.dataDeNastere = dataDeNastere;
        Username = username;
        Parola = parola;
        this.numarDeTelefon = numarDeTelefon;
    }

    public Integer getID() {
        return ID;
    }

    public String getNume() {
        return Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public Date getDataDeNastere() {
        return dataDeNastere;
    }

    public String getUsername() {
        return Username;
    }

    public String getParola() {
        return Parola;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public void setDataDeNastere(Date dataDeNastere) {
        this.dataDeNastere = dataDeNastere;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setParola(String parola) {
        Parola = parola;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "ID='" + ID + '\'' +
                ", Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", dataDeNastere=" + dataDeNastere +
                ", Username='" + Username + '\'' +
                ", Parola='" + Parola + '\'' +
                ", numarDeTelefon='" + numarDeTelefon + '\'' +
                '}';
    }
}
