package chat.model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatCliente extends Remote {
    void receberMensagem(String msg) throws RemoteException;
}
