package Programari;

import java.util.ArrayList;
import java.util.List;

public class CatalogProgramari {
    List<Programare> programari ;

    public CatalogProgramari() {
        this.programari = new ArrayList<Programare>();
    }

    public void adagaureProgramare( Programare programare)
    {
        programari.add(programare);
        /// adaugam in agenda doctorului
        /// adaugam lista de programari a pacientului
    }

    public void stergereProgramare(Programare programare)
    {
        /// stergem acea din agenda doc
        /// stergem din acea program
        programari.remove(programare);
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    @Override
    public String toString() {
        return "CatalogProgramari{" +
                "programari=" + programari +
                '}';
    }
}
