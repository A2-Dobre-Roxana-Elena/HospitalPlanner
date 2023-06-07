package Retelistica;

import Interfata.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 9090;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP,SERVER_PORT);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        BufferedReader keyboard =  new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


        InterfataPrincipala interfataMea = new InterfataPrincipala();

        while (true)
        {
            interfataMea.setContentPane(interfataMea.getMyPannel());
            interfataMea.setTitle("Meniu Principal");
            //incercare.setSize(300,400);
            interfataMea.setBounds(600,200,600,400);
            interfataMea.setVisible(true);
            interfataMea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            String serverResponse = input.readLine();
            System.out.println("[CLIENT] Serverul spune: "+ serverResponse);
        }

//        socket.close();
//        System.exit(0);
    }


}

