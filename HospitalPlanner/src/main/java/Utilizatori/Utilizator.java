package Utilizatori;

import java.util.Date;

public abstract class Utilizator {
    private String ID;
    private String Nume ;
    private String Prenume;
    private Date dataDeNastere;
    private String Username;
    private String Parola;

    private String numarDeTelefon;

    public Utilizator(String ID, String nume, String prenume, Date dataDeNastere, String username, String parola, String numarDeTelefon) {
        this.ID = ID;
        Nume = nume;
        Prenume = prenume;
        this.dataDeNastere = dataDeNastere;
        Username = username;
        Parola = parola;
        this.numarDeTelefon = numarDeTelefon;
    }

    public String getID() {
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

    public void setID(String ID) {
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
