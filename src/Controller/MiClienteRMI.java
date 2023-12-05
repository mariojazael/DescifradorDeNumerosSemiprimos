package Controller;

import View.ClientSemiPrimeGUI;
import View.MainJframe;

import java.rmi.Naming;

public class MiClienteRMI {
    public static void main(String[] args) {
        try {
            MiInterfazRemota mir =
                    (MiInterfazRemota)Naming.lookup("//" +
                            args[0] + ":" + args[1] + "/PruebaRMI");


            ClientSemiPrimeGUI clientSemiPrimeGUI = new ClientSemiPrimeGUI();
            ClienteGUIController clienteGUIController = new ClienteGUIController(clientSemiPrimeGUI, mir);
            clientSemiPrimeGUI.setVisible(true);

// Imprimimos miMetodo1() tantas veces como devuelva miMetodo2()

            // mir.miMetodo2(" Mario");

            /* Respuesta respuesta = mir.miMetodo1(Integer.parseInt(args[2]));

            long startTime = System.currentTimeMillis();

            System.out.println(Arrays.toString(respuesta.parametros));

            HashMap<Boolean, String> hashMap = respuesta.getFuncion().apply(respuesta.parametros);

            long endTime = System.currentTimeMillis();
            if(hashMap.containsKey(true)) {
                hashMap.put(true, hashMap.get(true) + " " + (endTime - startTime) + " milisegundos");
                mir.pintarGUI(hashMap.get(true));
            }
            else {
                hashMap.put(false, hashMap.get(false) + " " + (endTime - startTime) + " milisegundos");
                mir.pintarGUI(hashMap.get(false));
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
