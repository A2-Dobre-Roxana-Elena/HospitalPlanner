package AgendaSaptamanala;


import java.time.LocalTime;
import java.util.Objects;

public class Zi {

    private int id;
    private int inceputProgram;
    private int sfarsitProgram;

    private int idDoctor;

    private int idProgramare;

    private String numeZi;

    public Zi() {}

    public Zi(int inceputProgram, int sfarsitProgram, int idDoctor) {
        this.inceputProgram = inceputProgram;
        this.sfarsitProgram = sfarsitProgram;
        this.idDoctor = idDoctor;
    }

    public Zi(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Zi(int idDoctor, String numeZi) {
        this.idDoctor = idDoctor;
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

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setIdProgramare(int idProgramare) {
        this.idProgramare = idProgramare;
    }

    public int getId() {
        return id;
    }

    public String getNumeZi() {
        return numeZi;
    }

    public void setNumeZi(String numeZi) {
        this.numeZi = numeZi;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public int getIdProgramare() {
        return idProgramare;
    }

    @Override
    public String toString() {
        return "Zi{" +
                "id=" + id +
                ", inceputProgram=" + inceputProgram +
                ", sfarsitProgram=" + sfarsitProgram +
                ", idDoctor=" + idDoctor +
                ", idProgramare=" + idProgramare +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zi zi = (Zi) o;
        return id == zi.id && inceputProgram == zi.inceputProgram && sfarsitProgram == zi.sfarsitProgram && idDoctor == zi.idDoctor && idProgramare == zi.idProgramare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inceputProgram, sfarsitProgram, idDoctor, idProgramare);
    }
}

