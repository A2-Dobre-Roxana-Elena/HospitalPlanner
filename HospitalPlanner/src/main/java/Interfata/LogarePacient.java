package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogarePacient extends JFrame{

    private JLabel LogareTitlu;
    private JLabel Username;
    private JButton logareButton;
    private JTextField txtUser;
    private JPanel PannelLogare;
    private JTextField txtParola;
    private JButton btnInapoi;

    public LogarePacient() {
        logareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("User ul este " + txtUser.getText() + " iar parola este " + txtParola.getText());
                ///AICI TREBUIE MODIFICAT
//                PaginaPacient paginaPacient= new PaginaPacient();
//                paginaPacient.setContentPane(paginaPacient.getPaginaPacientPanel());
//                paginaPacient.setTitle("Pacient - Pagina Mea");
//                //incercare.setSize(300,400);
//                paginaPacient.setBounds(600,200,600,400);
//                paginaPacient.setVisible(true);
//                paginaPacient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                dispose();
            }
        });
        btnInapoi.addActionListener(new ActionListener() {
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

    public JPanel getPannelLogare() {
        return PannelLogare;
    }

    public static void main(String[] args) {

    }
}


