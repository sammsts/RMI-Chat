package chat.service;

import chat.model.ChatServidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatServidorImpl extends UnicastRemoteObject implements ChatServidor {
    protected ChatServidorImpl() throws RemoteException {
        super();
    }

    @Override
    public void enviarMensagem(String msg) throws RemoteException {
        System.out.println("Mensagem recebida: " + msg);
    }
}
