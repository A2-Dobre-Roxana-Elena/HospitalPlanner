package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Luna> luniAleAgendei = new ArrayList<Luna>();

    public Agenda() {
        for(int i = 0; i < 12; i++)
        {
            if( i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)
                luniAleAgendei.add(new Luna(31));
            else if (i == 1) {
                luniAleAgendei.add(new Luna(28));
            }
            else {
                luniAleAgendei.add(new Luna(30));
            }
        }
    }

    public Integer getNumarLuni()
    {
        return luniAleAgendei.size();
    }

    @Override
    public String toString() {
        String deReturnat = "Agenda are " + getNumarLuni() + " luni \n";
        for(int i=0; i<12;i++)
        {
           deReturnat = deReturnat+ ( (i+1) + luniAleAgendei.get(i).toString());
        }
        return deReturnat;
    }
}
