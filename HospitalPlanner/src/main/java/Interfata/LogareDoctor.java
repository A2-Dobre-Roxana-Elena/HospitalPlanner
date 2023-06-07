package Interfata;

import Utilizatori.Doctor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogareDoctor extends JFrame {
    private JTextField txtUser;
    private JPasswordField txtParola;
    private JButton btnInapoi;
    private JButton logareButton;
    private JPanel LogareDoctorPanel;

    public LogareDoctor() {
    logareButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            /// aici se face autentificarea
            /// se initializeaza Doctorul

            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HospitalPlanner");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            String username = txtUser.getText();
            String password = txtParola.getText();


            TypedQuery<Doctor> query = entityManager.createNamedQuery("Doctor.findByUsernameAndPassword", Doctor.class);
            query.setParameter("username", username);
            query.setParameter("password", password);

            Doctor doctorLogare = query.getSingleResult();
            if(doctorLogare != null){
                if (doctorLogare instanceof Doctor){
                    System.out.println(doctorLogare);
                    PaginaDoctor paginaDoctor= new PaginaDoctor(doctorLogare);
                    paginaDoctor.setContentPane(paginaDoctor.getPaginaDoctorPanel());
                    paginaDoctor.setTitle("Doctor - Pagina Mea");
                    //incercare.setSize(300,400);
                    paginaDoctor.setBounds(600,200,600,400);
                    paginaDoctor.setVisible(true);
                    //paginaDoctor.setLabelNumePrenume(txtNume.getText(),txtPrenume.getText());
                    paginaDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }

            }




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
