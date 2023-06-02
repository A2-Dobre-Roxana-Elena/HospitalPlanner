package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Luna {

    List<Zi>  zileDinLuna = new ArrayList<Zi>() ;


    public Luna(int numarZile) {
        for( int i = 0;i<numarZile;i++)
            this.zileDinLuna.add(new Zi());
    }

    public List<Zi> getZileDinLuna() {
        return zileDinLuna;
    }

//    public void setZileDinLuna(List<Zi> zileDinLuna) {
//        this.zileDinLuna = zileDinLuna;
//    }

    public Integer getNumarZileDinLuna() {
        return zileDinLuna.size();
    }

    @Override
    public String toString() {

        String deReturnat = "Luna are " + getNumarZileDinLuna() + " zile \n";
        for(int i=0; i<12;i++)
        {
            deReturnat = deReturnat+ (zileDinLuna.get(i).toString());
        }
        return deReturnat;
    }
}
