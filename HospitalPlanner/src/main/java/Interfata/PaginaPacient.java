package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Utilizatori.Pacient;

public class PaginaPacient extends JFrame {

    private Pacient pacientUtilizator;
    private JButton dorescOProgramareUrgentaButton;
    private JButton dorescOProgramareObisnuitaButton;
    private JButton deconecteazaMaButton;
    private JPanel PaginaPacientPanel;
    private JLabel labelNume;
    private JLabel labelProgramari;

    public JPanel getPaginaPacientPanel() {
        return PaginaPacientPanel;
    }

    public PaginaPacient(Pacient creat) {

        this.pacientUtilizator = creat;
        System.out.println("Pacientul e "+ this.pacientUtilizator);

        this.labelNume.setText("Numele si Prenumele: "+this.pacientUtilizator.getNume() + " " + this.pacientUtilizator.getPrenume());
        ////aici trebuie cautat in baza de date
        this.labelProgramari.setText("Programarile mele sunt: " );

    dorescOProgramareUrgentaButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            ////AICI VINE DIRECTIA CATRE ALGORITM

            Pacient pacient = PaginaPacient.this.pacientUtilizator;

            PaginaPacient paginaPacient= new PaginaPacient(pacient);
            paginaPacient.setContentPane(paginaPacient.getPaginaPacientPanel());
            paginaPacient.setTitle("Pacient - Pagina Mea");
            //incercare.setSize(300,400);
            paginaPacient.setBounds(600,200,600,400);
            paginaPacient.setVisible(true);
            paginaPacient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            dispose();
        }
    });
    dorescOProgramareObisnuitaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Pacient pacient = PaginaPacient.this.pacientUtilizator;
            ProgramareObisnuita programareObisnuita = new ProgramareObisnuita(pacient);
            programareObisnuita.setContentPane(programareObisnuita.getProgramareObisnuita());
            programareObisnuita.setTitle("Programare Obisnuita");
            //incercare.setSize(300,400);
            programareObisnuita.setBounds(600,200,600,400);
            programareObisnuita.setVisible(true);
            programareObisnuita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });

    deconecteazaMaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            InterfataPrincipala incercare= new InterfataPrincipala();
            incercare.setContentPane(incercare.getMyPannel());
            incercare.setTitle("Meniu Principal");
            //incercare.setSize(300,400);
            incercare.setBounds(600,200,600,400);
            incercare.setVisible(true);
            incercare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });

    }

    public Pacient getPacientUtilizator() {
        return pacientUtilizator;
    }

    ////ASTA TREBUIE STEARSA
//    public PaginaPacient() {
//        dorescOProgramareUrgentaButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ////AICI VINE DIRECTIA CATRE ALGORITM
//                ////SI REFRESH LA PAGINA
//
//
//
//                PaginaPacient paginaPacient= new PaginaPacient();
//                paginaPacient.setContentPane(paginaPacient.getPaginaPacientPanel());
//                paginaPacient.setTitle("Pacient - Pagina Mea");
//                //incercare.setSize(300,400);
//                paginaPacient.setBounds(600,200,600,400);
//                paginaPacient.setVisible(true);
//                paginaPacient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                dispose();
//            }
//        });
//        dorescOProgramareObisnuitaButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ProgramareObisnuita programareObisnuita = new ProgramareObisnuita();
//                programareObisnuita.setContentPane(programareObisnuita.getProgramareObisnuita());
//                programareObisnuita.setTitle("Programare Obisnuita");
//                //incercare.setSize(300,400);
//                programareObisnuita.setBounds(600,200,600,400);
//                programareObisnuita.setVisible(true);
//                programareObisnuita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                dispose();
//            }
//        });
//
//        deconecteazaMaButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                InterfataPrincipala incercare= new InterfataPrincipala();
//                incercare.setContentPane(incercare.getMyPannel());
//                incercare.setTitle("Meniu Principal");
//                //incercare.setSize(300,400);
//                incercare.setBounds(600,200,600,400);
//                incercare.setVisible(true);
//                incercare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                dispose();
//            }
//        });
//
//
//    }

    public static void main(String[] args) {

    }
}
