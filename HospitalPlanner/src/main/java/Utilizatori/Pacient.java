package Utilizatori;

import Programari.Programare;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "pacienti")
public class Pacient extends Utilizator{
    @Column(name = "diagnostic")
    private String Diagnostic;
    @Column(name = "necisitaInsotit")
    private Boolean necesitInsotit;
    @JsonIgnore
    @OneToMany(mappedBy = "Pacientul")
    private List<Programare> listaDeProgramari;


    public Pacient( String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon) {
        super( nume, prenume, dataDeNastere, username, parola, numarDeTelefon);
    }

    public Pacient( String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String diagnostic) {
        super( nume, prenume, dataDeNastere, username, parola, numarDeTelefon);
        Diagnostic = diagnostic;
    }

    public Pacient( String nume, String prenume, Date dataDeNastere, String adresa, String username, String parola, String numarDeTelefon, String diagnostic, Boolean necesitInsotit) {
        super( nume, prenume, dataDeNastere, username, parola, numarDeTelefon);
        Diagnostic = diagnostic;
        this.necesitInsotit = necesitInsotit;
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
        return Objects.equals(Diagnostic, pacient.Diagnostic) && Objects.equals(necesitInsotit, pacient.necesitInsotit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Diagnostic, necesitInsotit);
    }

    @Override
    public String toString() {
        return "Pacient{" + super.toString()+
                "Diagnostic='" + Diagnostic + '\'' +
                ", necesitInsotit=" + necesitInsotit +
                '}';
    }
}
