package Interfata;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Utilizatori.Doctor;

public class PaginaDoctor extends JFrame {
    private JButton btnDeconect;
    private JButton arataMiAgendaMeaButton;
    private JPanel PaginaDoctorPanel;
    private JLabel labelNumePrenume ;
    private JLabel labelAdresaSpital;
    private JLabel labelNrPacienti;
    private JLabel labelPacienti;
    private JTextField txtNume;

    private Doctor doctorUtilizator;

    public JPanel getPaginaDoctorPanel() {
        return PaginaDoctorPanel;
    }

    public PaginaDoctor(Doctor creat) {

        this.doctorUtilizator = creat;

        this.labelNumePrenume.setText("Numele si Prenume: "+this.doctorUtilizator.getNume() + " " +this.doctorUtilizator.getPrenume() );
        this.labelAdresaSpital.setText("Adresa Spital: "+this.doctorUtilizator.getAdresaSpital());
        this.labelNrPacienti.setText("Numar Pacienti: "+this.doctorUtilizator.NumarPacienti());
        this.labelPacienti.setText("Pacienti: "+this.doctorUtilizator.getListaMeaDePacienti().toString());

        System.out.println(this.doctorUtilizator.toString());
    btnDeconect.addActionListener(new ActionListener() {
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
        arataMiAgendaMeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aici ar arata agenda");
            }
        });
    }



    //////ASTA E DE STERS DUPA
//    public PaginaDoctor() {
//        btnDeconect.addActionListener(new ActionListener() {
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
//        arataMiAgendaMeaButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("aici ar arata agenda");
//            }
//        });
//    }
    public static void main(String[] args) {

    }
//
//    public JLabel getLabelNumePrenume() {
//        return labelNumePrenume;
//    }
//
//    public JLabel getLabelAdresaSpital() {
//        return labelAdresaSpital;
//    }
//
//    public JLabel getLabelNrPacienti() {
//        return labelNrPacienti;
//    }
//
//    public JLabel getLabelPacienti() {
//        return labelPacienti;
//    }

//    public void setLabelNumePrenume(String nume, String prenume) {
//        this.labelNumePrenume = new JLabel("Nume si Prenume: " + nume + " "+prenume);
//        System.out.println("am ajuns aici");
//    }

//    public void setLabelAdresaSpital(JLabel labelAdresaSpital) {
//        this.labelAdresaSpital = labelAdresaSpital;
//    }
//
//    public void setLabelNrPacienti(JLabel labelNrPacienti) {
//        this.labelNrPacienti = labelNrPacienti;
//    }
//
//    public void setLabelPacienti(JLabel labelPacienti) {
//        this.labelPacienti = labelPacienti;
//    }
}
