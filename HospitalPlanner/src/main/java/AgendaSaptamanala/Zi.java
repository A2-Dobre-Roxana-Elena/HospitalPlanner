package AgendaSaptamanala;


import Programari.Programare;
import Utilizatori.Doctor;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

//@Entity
//@Table(name = "Zi")
public class Zi {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
    private int id;
    // @Column(name = "inceputProgram", nullable = false)
    private int inceputProgram;
    // @Column(name = "sfarsitProgram", nullable = false)
    private int sfarsitProgram;

    //    @OneToOne
//    @JoinColumn(name = "idDoctor")
    //private int idDoctor;
    private Doctor doctor;
    // @OneToMany(mappedBy = "Zi")
    public List<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }

//    @OneToMany
//    @JoinColumn(name = "idProgramare")
    //private int idProgramare;
    //private List<Integer> idProgramare;

    private List<Programare> programari;
    //    @Column(name = "nume")
    private String numeZi;

    public Zi() {}

    public Zi(int inceputProgram, int sfarsitProgram, Doctor doctor) {
        this.inceputProgram = inceputProgram;
        this.sfarsitProgram = sfarsitProgram;
        this.doctor = doctor;
    }

    public Zi(Doctor doctor) {
        this.doctor = doctor;
    }

    public Zi(Doctor doctor, String numeZi) {
        this.doctor = doctor;
        this.numeZi = numeZi;
    }

    public int getInceputProgram() {
        return inceputProgram;
    }

    public int getSfarsitProgram() {
        return sfarsitProgram;
    }

    public void setInceputProgram(int inceputProgram) {
        this.inceputProgram = inceputProgram;
    }

    public void setSfarsitProgram(int sfarsitProgram) {
        this.sfarsitProgram = sfarsitProgram;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

//    public void setIdProgramare(int idProgramare) {
//        this.idProgramare = idProgramare;
//    }

    public int getId() {
        return id;
    }

    public String getNumeZi() {
        return numeZi;
    }

    public void setNumeZi(String numeZi) {
        this.numeZi = numeZi;
    }

    public Doctor getDoctor() {
        return doctor;
    }

//    public int getIdProgramare() {
//        return idProgramare;
//    }

//    @Override
//    public String toString() {
//        return "Zi{" +
//                "id=" + id +
//                ", inceputProgram=" + inceputProgram +
//                ", sfarsitProgram=" + sfarsitProgram +
//                ", idDoctor=" + idDoctor +
//               // ", idProgramare=" + idProgramare +
//                '}';
//    }


    @Override
    public String toString() {
        return "Zi{" +
                "id=" + id +
                ", inceputProgram=" + inceputProgram +
                ", sfarsitProgram=" + sfarsitProgram +
                ", idDoctor=" + doctor +
                ", programari=" + programari +
                ", numeZi='" + numeZi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zi zi = (Zi) o;
        return id == zi.id && inceputProgram == zi.inceputProgram && sfarsitProgram == zi.sfarsitProgram && doctor == zi.doctor /*&& idProgramare == zi.idProgramare*/;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, inceputProgram, sfarsitProgram, idDoctor, idProgramare);
//    }
}

