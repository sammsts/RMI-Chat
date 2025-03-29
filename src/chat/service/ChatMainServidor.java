package chat.service;

import chat.model.ChatServidor;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ChatMainServidor {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ChatServidor servidor = new ChatServidorImpl();
            Naming.rebind("rmi://localhost/ChatServidor", servidor);
            System.out.println("Servidor RMI iniciado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
