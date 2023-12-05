package Controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MiInterfazRemota extends Remote {
    Respuesta miMetodo1() throws RemoteException;
    void miMetodo2(String a) throws RemoteException;
    void pintarGUI(String elemento) throws RemoteException;
}
