package Interfata;

import Utilizatori.Doctor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CreareContDoctor extends JFrame {
    private JTextField txtNume;
    private JTextField txtPrenume;
    private JTextField txtAdresa;
    private JTextField txtAdresaSpital;
    private JPasswordField txtParola;
    private JTextField txtUsername;
    private JTextField txtNrTelefon;
    private JTextField txtDataNastere;

    public JPanel getCreareContDoctorPanel() {
        return CreareContDoctorPanel;
    }

    private JButton btnInapoi;
    private JButton btnSubmit;
    private JPanel CreareContDoctorPanel;

    public CreareContDoctor() {
    btnSubmit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Numele si prenumele e "+ txtNume.getText() + " "+txtPrenume.getText());
            System.out.println("Adresele sunt : "+ txtAdresa.getText() + " "+ txtAdresaSpital.getText());
            System.out.println("Telefonul si data de nastere sunt :" + txtNrTelefon.getText() + txtDataNastere.getText());
            System.out.println("Username-ul si Parola sunt: " + txtUsername.getText() + " "+ txtParola.getText());

            Doctor doctorUtilizator = new Doctor(txtNume.getText(),txtPrenume.getText(),txtDataNastere.getText(), txtAdresa.getText(),txtUsername.getText(),txtParola.getText(),txtNrTelefon.getText(), txtAdresaSpital.getText() );

            PaginaDoctor paginaDoctor= new PaginaDoctor(doctorUtilizator);
            paginaDoctor.setContentPane(paginaDoctor.getPaginaDoctorPanel());
            paginaDoctor.setTitle("Doctor - Pagina Mea");
            //incercare.setSize(300,400);
            paginaDoctor.setBounds(600,200,600,400);
            paginaDoctor.setVisible(true);
            //paginaDoctor.setLabelNumePrenume(txtNume.getText(),txtPrenume.getText());
            paginaDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
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

    public static void main(String[] args) {

    }
}
