package Controller;

import View.MainJframe;

import java.rmi.RemoteException;

public class main {
    public static void main(String[] args) throws RemoteException {
        MiClaseRemota miClaseRemota = new MiClaseRemota();
        MainJframe mainJframe = new MainJframe();
        MainViewController mainViewController = new MainViewController(mainJframe, miClaseRemota.up("1234"));
        mainJframe.setVisible(true);
    }
}
