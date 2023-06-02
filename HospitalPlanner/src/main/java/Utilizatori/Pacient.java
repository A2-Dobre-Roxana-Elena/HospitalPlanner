package Utilizatori;

import java.util.Date;
import java.util.Objects;

public class Pacient extends Utilizator{
    private String Diagnostic;
    private Boolean necesitInsotit;

    private PreferintaPacient preferintaMea;

    public Pacient(String ID, String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon) {
        super(ID, nume, prenume, dataDeNastere, adresa, username, parola, numarDeTelefon);
    }

    public Pacient(String ID, String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String diagnostic) {
        super(ID, nume, prenume, dataDeNastere, adresa, username, parola, numarDeTelefon);
        Diagnostic = diagnostic;
    }

    public Pacient(String ID, String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String diagnostic, Boolean necesitInsotit) {
        super(ID, nume, prenume, dataDeNastere, adresa, username, parola, numarDeTelefon);
        Diagnostic = diagnostic;
        this.necesitInsotit = necesitInsotit;
    }

    public void adaugaPreferinta(PreferintaPacient preferinta)
    {
        preferintaMea = preferinta;
        // aici o sa apelam algoritmul obisnuit
    }

    public void stergePreferinta(PreferintaPacient preferinta)
    {
        preferintaMea = null;
    }

    public PreferintaPacient getPreferintaMea()
    {
        return preferintaMea;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public Boolean getNecesitInsotit() {
        return necesitInsotit;
    }

    ///atat diagnosticul cat si necesitatea de a fi insotit se poate schimba
    public void setDiagnostic(String diagnostic) {
        Diagnostic = diagnostic;
    }

    public void setNecesitInsotit(Boolean necesitInsotit) {
        this.necesitInsotit = necesitInsotit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacient pacient = (Pacient) o;
        return Objects.equals(Diagnostic, pacient.Diagnostic) && Objects.equals(necesitInsotit, pacient.necesitInsotit) && Objects.equals(preferintaMea, pacient.preferintaMea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Diagnostic, necesitInsotit, preferintaMea);
    }

    @Override
    public String toString() {
        return "Pacient{" + super.toString()+
                "Diagnostic='" + Diagnostic + '\'' +
                ", necesitInsotit=" + necesitInsotit +
                '}';
    }
}
