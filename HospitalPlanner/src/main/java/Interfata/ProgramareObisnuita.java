package Interfata;

import Utilizatori.Pacient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramareObisnuita extends JFrame {

    private Pacient pacientUtilizator;
    private JPanel ProgramareObisnuita;
    private JSpinner spinner1;
    private JComboBox comboBox1;

    public JPanel getProgramareObisnuita() {
        return ProgramareObisnuita;
    }

    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton anuleazaProgramareButton;
    private JButton creazaProgramareButton;
    private JLabel txtDoctori;

    public ProgramareObisnuita(Pacient creat) {

        /// AICI VOR FI DOCTORII DIN BAZA DE DATE
        this.txtDoctori.setText("AICI VOR FI DOCTORII DIN BAZA DE DATE");

        this.pacientUtilizator = creat;



    anuleazaProgramareButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Pacient pacient = ProgramareObisnuita.this.pacientUtilizator;
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
        creazaProgramareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ///SE FACE ALGORITMUL
                String preferinta1 = comboBox1.getSelectedItem().toString();
                String preferinta2 = comboBox2.getSelectedItem().toString();
                String preferinta3 = comboBox3.getSelectedItem().toString();
                System.out.println(preferinta1 + preferinta2 + preferinta3);

                Pacient pacient = ProgramareObisnuita.this.pacientUtilizator;
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

    }

    public static void main(String[] args) {

    }
}
