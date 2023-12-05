package Controller;

import View.ClientSemiPrimeGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashMap;

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
                Respuesta respuesta = miInterfazRemota.miMetodo1();
                long startTime = System.currentTimeMillis();

                HashMap<Boolean, String> hashMap = respuesta.getFuncion().apply(respuesta.parametros);

                long endTime = System.currentTimeMillis();

                if(hashMap.containsKey(true)){
                    hashMap.put(true, hashMap.get(true) + " " + (endTime - startTime) + " milisegundos");
                    miInterfazRemota.pintarGUI(hashMap.get(true));
                    clientSemiPrimeGUI.txtAreaLog.setText(hashMap.get(true));
                }
                else {
                    hashMap.put(false, hashMap.get(false) + " " + (endTime - startTime) + " milisegundos");
                    miInterfazRemota.pintarGUI(hashMap.get(false));
                    clientSemiPrimeGUI.txtAreaLog.setText(hashMap.get(false));
                }
            } catch (RemoteException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
