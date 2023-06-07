package Retelistica;

import Utilizatori.Doctor;
import Utilizatori.Pacient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

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

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HospitalPlanner");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();


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

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public synchronized void adaugaDoctor(Doctor doctor) {
        entityManager.getTransaction().begin();
        entityManager.persist(doctor);
        entityManager.getTransaction().commit();
    }

    public synchronized void adaugaPacient(Pacient pacient) {
        entityManager.getTransaction().begin();
        entityManager.persist(pacient);
        entityManager.getTransaction().commit();
    }

    public synchronized void stergeUtilizator(Pacient pacient) {
        entityManager.getTransaction().begin();
        entityManager.persist(pacient);
        entityManager.getTransaction().commit();
    }
}
