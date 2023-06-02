package Utilizatori;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PreferintaPacient {
    private int intervalZile;
    private List<Doctor> doctoriPreferati = new ArrayList<Doctor>();
    private String observatii;

    public PreferintaPacient(int intervalZile, Doctor primul, Doctor alDoilea, Doctor alTreilea) {
        this.intervalZile = intervalZile;
        doctoriPreferati.add(primul);
        doctoriPreferati.add(alDoilea);
        doctoriPreferati.add(alTreilea);
    }

    public PreferintaPacient(int intervalZile, Doctor primul, Doctor alDoilea, Doctor alTreilea, String observatii) {
        this.intervalZile = intervalZile;
        doctoriPreferati.add(primul);
        doctoriPreferati.add(alDoilea);
        doctoriPreferati.add(alTreilea);
        this.observatii=observatii;
    }


    public int getIntervalZile() {
        return intervalZile;
    }

    public List<Doctor> getDoctoriPreferati() {
        return doctoriPreferati;
    }

    public String getObservatii() {
        return observatii;
    }

    public void setIntervalZile(int intervalZile) {
        this.intervalZile = intervalZile;
    }

    public void setDoctoriPreferati(List<Doctor> doctoriPreferati) {
        this.doctoriPreferati = doctoriPreferati;
    }

    public void setObservatii(String observatii) {
        this.observatii = observatii;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreferintaPacient that = (PreferintaPacient) o;
        return intervalZile == that.intervalZile && Objects.equals(doctoriPreferati, that.doctoriPreferati) && Objects.equals(observatii, that.observatii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervalZile, doctoriPreferati, observatii);
    }

    @Override
    public String toString() {
        return "PreferintaPacient{" +
                "intervalZile=" + intervalZile +
                ", doctoriPreferati=" + doctoriPreferati +
                ", observatii='" + observatii + '\'' +
                '}';
    }
}
