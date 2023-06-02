package Programari;
import Utilizatori.*;

import java.util.Date;
import java.util.Objects;

public class Programare {
    private Doctor Doctorul;
    private Pacient Pacientul;
    private Date dataSiOra ;
    private String tipulProgramarii;

    public Programare(Doctor doctorul, Pacient pacientul, Date dataSiOra, String tipulProgramarii) {
        Doctorul = doctorul;
        Pacientul = pacientul;
        this.dataSiOra = dataSiOra;
        this.tipulProgramarii = tipulProgramarii;
    }

    public Doctor getDoctorul() {
        return Doctorul;
    }

    public Pacient getPacientul() {
        return Pacientul;
    }

    public Date getDataSiOra() {
        return dataSiOra;
    }

    public String getTipulProgramarii() {
        return tipulProgramarii;
    }

//    public void setDoctorul(Doctor doctorul) {
//        Doctorul = doctorul;
//    }
//
//    public void setPacientul(Pacient pacientul) {
//        Pacientul = pacientul;
//    }
//
//    public void setDataSiOra(Date dataSiOra) {
//        this.dataSiOra = dataSiOra;
//    }
//
//    public void setTipulProgramarii(String tipulProgramarii) {
//        this.tipulProgramarii = tipulProgramarii;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programare that = (Programare) o;
        return Objects.equals(Doctorul, that.Doctorul) && Objects.equals(Pacientul, that.Pacientul) && Objects.equals(dataSiOra, that.dataSiOra) && Objects.equals(tipulProgramarii, that.tipulProgramarii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Doctorul, Pacientul, dataSiOra, tipulProgramarii);
    }

    @Override
    public String toString() {
        return "Programare{" +
                "Doctorul=" + Doctorul +
                ", Pacientul=" + Pacientul +
                ", dataSiOra=" + dataSiOra +
                ", tipulProgramarii='" + tipulProgramarii + '\'' +
                '}';
    }
}
