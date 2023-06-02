package Agenda;

import java.time.LocalTime;

public class Zi {
    private LocalTime inceputProgram;
    private LocalTime sfarsitProgram;

    public Zi() {
    }

//      public Zi(LocalTime inceputProgram, LocalTime sfarsitProgram) {
//        this.inceputProgram = inceputProgram;
//        this.sfarsitProgram = sfarsitProgram;
//    }

    public LocalTime getInceputProgram() {
        return inceputProgram;
    }

    public LocalTime getSfarsitProgram() {
        return sfarsitProgram;
    }

    public void setInceputProgram(LocalTime inceputProgram) {
        this.inceputProgram = inceputProgram;
    }

    public void setSfarsitProgram(LocalTime sfarsitProgram) {
        this.sfarsitProgram = sfarsitProgram;
    }

    @Override
    public String toString() {

        if (inceputProgram == null || sfarsitProgram == null)
            return "";

        return "Zi{" +
                "inceputProgram=" + inceputProgram +
                ", sfarsitProgram=" + sfarsitProgram +
                '}';
    }
}
