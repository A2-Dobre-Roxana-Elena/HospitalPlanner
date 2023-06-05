package Interfata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaPacient extends JFrame {
    private JButton dorescOProgramareUrgentaButton;
    private JButton dorescOProgramareObisnuitaButton;
    private JButton deconecteazaMaButton;
    private JPanel PaginaPacientPanel;

    public JPanel getPaginaPacientPanel() {
        return PaginaPacientPanel;
    }

    public PaginaPacient() {
    dorescOProgramareUrgentaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ////AICI VINE DIRECTIA CATRE ALGORITM
            ////SI REFRESH LA PAGINA
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
    dorescOProgramareObisnuitaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ProgramareObisnuita programareObisnuita = new ProgramareObisnuita();
            programareObisnuita.setContentPane(programareObisnuita.getProgramareObisnuita());
            programareObisnuita.setTitle("Logare");
            //incercare.setSize(300,400);
            programareObisnuita.setBounds(600,200,600,400);
            programareObisnuita.setVisible(true);
            programareObisnuita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    });

    deconecteazaMaButton.addActionListener(new ActionListener() {
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

    public static void main(String[] args) {

    }
}
