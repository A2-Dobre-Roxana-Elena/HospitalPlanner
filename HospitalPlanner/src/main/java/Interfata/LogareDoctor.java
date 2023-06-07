package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogareDoctor extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton btnInapoi;
    private JButton logareButton;
    private JPanel LogareDoctorPanel;

    public LogareDoctor() {
    logareButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            /// aici se face autentificarea
            /// se initializeaza Doctorul


//            PaginaDoctor paginaDoctor= new PaginaDoctor();
//            paginaDoctor.setContentPane(paginaDoctor.getPaginaDoctorPanel());
//            paginaDoctor.setTitle("Doctor - Pagina Mea");
//            //incercare.setSize(300,400);
//            paginaDoctor.setBounds(600,200,600,400);
//            paginaDoctor.setVisible(true);
//            paginaDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            dispose();
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

    public JPanel getLogareDoctorPanel() {
        return LogareDoctorPanel;
    }

    public static void main(String[] args) {

    }
}
