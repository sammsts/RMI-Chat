package chat.service;

import chat.model.ChatServidor;
import java.rmi.Naming;
import java.util.Scanner;

public class ChatMainCliente {
    public static void main(String[] args) {
        try {
            ChatServidor servidor = (ChatServidor) Naming.lookup("rmi://localhost/ChatServidor");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite mensagens para enviar ao servidor:");

            while (true) {
                String mensagem = scanner.nextLine();
                servidor.enviarMensagem(mensagem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
