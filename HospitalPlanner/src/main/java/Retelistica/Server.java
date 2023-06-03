package Retelistica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int PORT = 9090;

    private static ArrayList<MeniuClient> clienti = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(4);


    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(PORT);

        while( true )
        {
            System.out.println("[SERVER] Astept conexiunea cu un client.");
            Socket client =  listener.accept();
            System.out.println("[SERVER] M-am conectat cu un client.");
            MeniuClient threadClient = new MeniuClient(client);
            clienti.add(threadClient);

            pool.execute(threadClient);

        }


//        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

//        listener.close();
//        client.close();

    }
}
