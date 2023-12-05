package Controller;

import View.ClientSemiPrimeGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ClienteGUIController implements ActionListener {
    private final ClientSemiPrimeGUI clientSemiPrimeGUI;
    private final MiInterfazRemota miInterfazRemota;

    public ClienteGUIController(ClientSemiPrimeGUI clientSemiPrimeGUI, MiInterfazRemota miClaseRemota) {
        this.clientSemiPrimeGUI = clientSemiPrimeGUI;
        this.miInterfazRemota = miClaseRemota;
        clientSemiPrimeGUI.btnObtener.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clientSemiPrimeGUI.btnObtener){
            try {
                AtomicInteger contadorAtomico = miInterfazRemota.getContador();
                int contador = contadorAtomico.intValue() + 1;
                Respuesta respuesta = miInterfazRemota.miMetodo1();
                long startTime = System.currentTimeMillis();

                HashMap<Boolean, String> hashMap = respuesta.getFuncion().apply(respuesta.parametros);

                long endTime = System.currentTimeMillis();

                if(hashMap.containsKey(true)){
                    hashMap.put(true,"Numero: " + respuesta.getParametros()[2] + ", Factores primos: " + hashMap.get(true) + " " + (endTime - startTime) + " milisegundos");
                    miInterfazRemota.pintarGUI("Maquina N.: " + contador + ", " + hashMap.get(true));
                    clientSemiPrimeGUI.txtAreaLog.setText(clientSemiPrimeGUI.txtAreaLog.getText() + "\n" + hashMap.get(true));
                }
                else {
                    hashMap.put(false, hashMap.get(false) + " " + (endTime - startTime) + " milisegundos");
                    miInterfazRemota.pintarGUI("Numero: " + respuesta.getParametros()[2] + "Maquina N.: " + contador + ", " + hashMap.get(false));
                    clientSemiPrimeGUI.txtAreaLog.setText(clientSemiPrimeGUI.txtAreaLog.getText() + "\nNumero: " + respuesta.getParametros()[2] + hashMap.get(false));
                }
            } catch (RemoteException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
