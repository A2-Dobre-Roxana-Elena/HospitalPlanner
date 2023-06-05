package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaDoctor extends JFrame {
    private JButton btnDeconect;
    private JButton arataMiAgendaMeaButton;
    private JPanel PaginaDoctorPanel;

    public JPanel getPaginaDoctorPanel() {
        return PaginaDoctorPanel;
    }

    public PaginaDoctor() {
    btnDeconect.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Incercare incercare= new Incercare();
            incercare.setContentPane(incercare.getMyPannel());
            incercare.setTitle("Logare");
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

    public static void main(String[] args) {

    }
}
