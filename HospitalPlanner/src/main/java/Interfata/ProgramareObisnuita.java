package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramareObisnuita extends JFrame {
    private JPanel ProgramareObisnuita;
    private JSpinner spinner1;
    private JList list1;
    private JComboBox comboBox1;

    public JPanel getProgramareObisnuita() {
        return ProgramareObisnuita;
    }

    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton anuleazaProgramareButton;
    private JButton creazaProgramareButton;

    public ProgramareObisnuita() {
    anuleazaProgramareButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            PaginaPacient paginaPacient= new PaginaPacient();
            paginaPacient.setContentPane(paginaPacient.getPaginaPacientPanel());
            paginaPacient.setTitle("Logare");
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
                PaginaPacient paginaPacient= new PaginaPacient();
                paginaPacient.setContentPane(paginaPacient.getPaginaPacientPanel());
                paginaPacient.setTitle("Logare");
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
