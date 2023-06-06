package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Incercare extends JFrame {
    private JPanel MyPannel;
    private JLabel MeniuPrincipal;
    private JButton logareButton;
    private JButton creareContPacientButton;
    private JButton creareContDoctorButton;
    private JTextField myField;
    private JButton btnClick;
public Incercare()  {
    logareButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Logare logare= new Logare();
            logare.setContentPane(logare.getPannelLogare());
            logare.setTitle("Meniu Principal");
            //incercare.setSize(300,400);
            logare.setBounds(600,200,600,400);
            logare.setVisible(true);
            logare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });
    creareContPacientButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CreareContPacient creareContPacient = new CreareContPacient();
            creareContPacient.setContentPane(creareContPacient.getCreareContPacient());
            creareContPacient.setTitle("Logare");
            //incercare.setSize(300,400);
            creareContPacient.setBounds(600,200,600,400);
            creareContPacient.setVisible(true);
            creareContPacient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });
    creareContDoctorButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CreareContDoctor creareContDoctor = new CreareContDoctor();
            creareContDoctor.setContentPane(creareContDoctor.getCreareContDoctorPanel());
            creareContDoctor.setTitle("Logare");
            //incercare.setSize(300,400);
            creareContDoctor.setBounds(600,200,600,400);
            creareContDoctor.setVisible(true);
            creareContDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });
}

    public JPanel getMyPannel() {
        return MyPannel;
    }

    public static void main(String[] args) {

    }

}
