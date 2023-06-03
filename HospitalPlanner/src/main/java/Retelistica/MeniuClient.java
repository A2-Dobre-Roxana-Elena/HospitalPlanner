package Retelistica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MeniuClient implements Runnable {

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    public MeniuClient(Socket cleintSocket) throws IOException {
        this.client = cleintSocket;
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream(), true);

    }

    @Override
    public void run() {
        try {
            while(true)
            {
                String request = in.readLine();
                if( request.startsWith("1"))
                {
                    out.println("esti doctor si ai trimis comanda asta "+ request);
                    System.out.println("Asta i doctor");
                }
                if (request.startsWith("2"))
                {
                    out.println("esti pacient si ai trimis comanda asta "+request);
                    System.out.println("Asta i pacient");
                }
                System.out.println("Am primit comanda asta"+request);
                out.println();
            }
        }
        catch (IOException e)
        {
            System.out.println("Eroare in Meniu Client" + e.getStackTrace());
        } finally {

            System.out.println("[SERVER] Se inchide conexiunea pentru un anumit client.");
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
