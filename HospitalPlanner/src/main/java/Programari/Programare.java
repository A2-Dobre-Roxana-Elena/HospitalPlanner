package Programari;
import AgendaSaptamanala.Zi;
import Utilizatori.*;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "programari")
public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private String ID;
    @ManyToOne
    @JoinColumn(name = "idDoctor")
    private Doctor Doctorul;
    @ManyToOne
    @JoinColumn(name = "idPacient")
    private Pacient Pacientul;

    @ManyToOne
    @JoinColumn(name = "idZi")
    private Zi zi;
    @Column(name = "tipulProgramare")
    private String tipulProgramarii;

    public Programare(Doctor doctorul, Pacient pacientul, Zi zi, String tipulProgramarii) {
        Doctorul = doctorul;
        Pacientul = pacientul;
        this.zi = zi;
        this.tipulProgramarii = tipulProgramarii;
    }

    public String getID() {
        return ID;
    }


    public Doctor getDoctorul() {
        return Doctorul;
    }

    public void setDoctorul(Doctor doctorul) {
        Doctorul = doctorul;
    }

    public Pacient getPacientul() {
        return Pacientul;
    }

    public void setPacientul(Pacient pacientul) {
        Pacientul = pacientul;
    }

    public Zi getZi() {
        return zi;
    }

    public void setZi(Zi zi) {
        this.zi = zi;
    }

    public String getTipulProgramarii() {
        return tipulProgramarii;
    }

    public void setTipulProgramarii(String tipulProgramarii) {
        this.tipulProgramarii = tipulProgramarii;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programare that)) return false;
        return Objects.equals(ID, that.ID) && Objects.equals(Doctorul, that.Doctorul) && Objects.equals(Pacientul, that.Pacientul) && Objects.equals(zi, that.zi) && Objects.equals(tipulProgramarii, that.tipulProgramarii);
    }

    @Override
    public String toString() {
        return "Programare{" +
                "ID='" + ID + '\'' +
                ", Doctorul=" + Doctorul +
                ", Pacientul=" + Pacientul +
                ", zi=" + zi +
                ", tipulProgramarii='" + tipulProgramarii + '\'' +
                '}';
    }
}
