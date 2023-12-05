package Controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.concurrent.atomic.AtomicInteger;

public interface MiInterfazRemota extends Remote {
    Respuesta miMetodo1() throws RemoteException;
    AtomicInteger getContador() throws RemoteException;
    void miMetodo2(String a) throws RemoteException;
    void pintarGUI(String elemento) throws RemoteException;
}
