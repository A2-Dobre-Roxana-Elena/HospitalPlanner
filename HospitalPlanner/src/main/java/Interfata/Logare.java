package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logare extends JFrame{

    private JLabel LogareTitlu;
    private JLabel Username;
    private JButton logareButton;
    private JTextField txtUser;
    private JPanel PannelLogare;
    private JTextField txtParola;
    private JButton btnInapoi;

    public Logare() {
        logareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("User ul este " + txtUser.getText() + " iar parola este " + txtParola.getText());
            }
        });
        btnInapoi.addActionListener(new ActionListener() {
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
    }

    public JPanel getPannelLogare() {
        return PannelLogare;
    }

    public static void main(String[] args) {

    }
}


