package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfataPrincipala extends JFrame {
    private JPanel MyPannel;
    private JLabel MeniuPrincipal;
    private JButton logareDoctorButton;
    private JButton creareContPacientButton;
    private JButton creareContDoctorButton;
    private JButton logarePacientButton;
    private JTextField myField;
    private JButton btnClick;
public InterfataPrincipala()  {
    logareDoctorButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            LogareDoctor logare= new LogareDoctor();
            logare.setContentPane(logare.getLogareDoctorPanel());
                logare.setTitle("Logare Doctor");
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
            creareContPacient.setTitle("Creare Cont Pacient");
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
            creareContDoctor.setTitle("Creare Cont Doctor");
            //incercare.setSize(300,400);
            creareContDoctor.setBounds(600,200,600,400);
            creareContDoctor.setVisible(true);
            creareContDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });
    logarePacientButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            LogarePacient logare= new LogarePacient();
            logare.setContentPane(logare.getPannelLogare());
            logare.setTitle("Logare Pacient");
            //incercare.setSize(300,400);
            logare.setBounds(600,200,600,400);
            logare.setVisible(true);
            logare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });
}

    public JPanel getMyPannel() {
        return MyPannel;
    }

    public static void main(String[] args) {
        InterfataPrincipala interfataMea = new InterfataPrincipala();
            interfataMea.setContentPane(interfataMea.getMyPannel());
            interfataMea.setTitle("Meniu Principal");
            //incercare.setSize(300,400);
            interfataMea.setBounds(600,200,600,400);
            interfataMea.setVisible(true);
            interfataMea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
