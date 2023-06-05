package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreareContPacient extends JFrame {
    private JPanel CreareContPacient;
    private JTextField txtNume;
    private JTextField txtPernume;
    private JTextField txtAdresa;
    private JTextField txtNrTelefon;
    private JTextField txtDataNastere;
    private JCheckBox checkNecesit;
    private JTextField txtDiagnostic;
    private JTextField txtUsername;
    private JPasswordField txtParola;
    private JButton btnInapoi;
    private JButton creareContPacientButton;

    public JPanel getCreareContPacient() {
        return CreareContPacient;
    }

    public CreareContPacient()  {
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
        creareContPacientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Numele si prenumele e "+ txtNume.getText() + " "+txtPernume.getText());
                System.out.println("Adresele este : "+ txtAdresa.getText() );
                System.out.println("Telefonul si data de nastere sunt :" + txtNrTelefon.getText() + txtDataNastere.getText());
                System.out.println("Username-ul si Parola sunt: " + txtUsername.getText() + " "+ txtParola.getText());
                System.out.println("Diagnosticul este " + txtDiagnostic.getText());
                System.out.println(checkNecesit.getText());
                //// NECESITA REVAZUT DACA MERGE SAU NU
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
}
