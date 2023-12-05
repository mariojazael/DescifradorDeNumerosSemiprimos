package Controller;

import View.MainJframe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashMap;

public class MainViewController implements ActionListener {
    private final MainJframe mainJframe;
    private final MiClaseRemota miClaseRemota;
    public MainViewController(MainJframe mainJframe, MiClaseRemota miClaseRemota){
        this.mainJframe = mainJframe;
        mainJframe.btnCalcular.addActionListener(this);
        mainJframe.radioConcurrente.addActionListener(this);
        mainJframe.radioParalelo.addActionListener(this);
        mainJframe.radioSecuencial.addActionListener(this);
        this.miClaseRemota = miClaseRemota;
        miClaseRemota.setMainJframe(this.mainJframe);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mainJframe.btnCalcular) {
            int numero = Integer.parseInt(mainJframe.txtFldIngresaNumero.getText());
            if (mainJframe.radioConcurrente.isSelected()) {
                try {
                    System.out.println(numero);
                    Biprime.concurrente(numero, mainJframe);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            } else if(mainJframe.radioSecuencial.isSelected()){
                int numero2 = Integer.parseInt(mainJframe.txtFldIngresaNumero.getText());
                Biprime.secuencial(numero2, mainJframe);
            }
            else if(mainJframe.radioParalelo.isSelected()){
                int numero3 = Integer.parseInt(mainJframe.txtFldIngresaNumero.getText());
                miClaseRemota.setTarget(numero3);
                System.out.println(miClaseRemota.getContador().get());
                try {
                    Respuesta respuesta = miClaseRemota.miMetodo1();
                    System.out.println(Arrays.toString(respuesta.parametros));
                    long startTime = System.currentTimeMillis();
                    HashMap<Boolean, String> hashMap = respuesta.getFuncion().apply(respuesta.parametros);

                    long endTime = System.currentTimeMillis();

                    if (hashMap.containsKey(true)) {
                        hashMap.put(true, hashMap.get(true) + " " + (endTime - startTime) + " milisegundos");
                        SwingUtilities.invokeLater(() -> mainJframe.txtAreaResultados.setText(mainJframe.txtAreaResultados.getText() + "\n" + hashMap.get(true)));
                    } else {
                        hashMap.put(false, hashMap.get(false) + " " + (endTime - startTime) + " milisegundos");
                        SwingUtilities.invokeLater(() -> mainJframe.txtAreaResultados.setText(mainJframe.txtAreaResultados.getText() + "\n" + hashMap.get(false)));
                    }
                } catch (RemoteException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }


}
