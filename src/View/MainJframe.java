package View;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;

/**
 *
 * @author PC WHITE WOLF
 */
public class MainJframe extends JFrame {

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
        buttonGroup.add(radioConcurrente);
        buttonGroup.add(radioParalelo);
        buttonGroup.add(radioSecuencial);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new JPanel();
        jLabel1 = new JLabel();
        lblIngresaNumero = new JLabel();
        txtFldIngresaNumero = new JTextField();
        btnCalcular = new JButton();
        radioSecuencial = new JRadioButton();
        radioConcurrente = new JRadioButton();
        radioParalelo = new JRadioButton();
        jScrollPane1 = new JScrollPane();
        txtAreaResultados = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Calaculador de numeros Semiprimos");

        lblIngresaNumero.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblIngresaNumero.setHorizontalAlignment(SwingConstants.CENTER);
        lblIngresaNumero.setText("Ingresa el numero a calcular...");

        txtFldIngresaNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFldIngresaNumero.setForeground(new java.awt.Color(204, 0, 204));
        txtFldIngresaNumero.setHorizontalAlignment(JTextField.CENTER);

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(204, 0, 204));
        btnCalcular.setText("Calcular");

        radioSecuencial.setText("Secuencial");

        radioConcurrente.setText("Concurrente");

        radioParalelo.setText("Paralelo");

        txtAreaResultados.setColumns(20);
        txtAreaResultados.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultados);

        GroupLayout MainPanelLayout = new GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(MainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(lblIngresaNumero, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFldIngresaNumero, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(radioSecuencial)
                                        .addGap(74, 74, 74)
                                        .addComponent(radioConcurrente)
                                        .addGap(92, 92, 92)
                                        .addComponent(radioParalelo))))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(635, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIngresaNumero, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFldIngresaNumero, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(MainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(radioConcurrente)
                            .addComponent(radioSecuencial)
                            .addComponent(radioParalelo))
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel MainPanel;
    public JButton btnCalcular;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JLabel lblIngresaNumero;
    public JRadioButton radioConcurrente;
    public JRadioButton radioParalelo;
    public JRadioButton radioSecuencial;
    public JTextArea txtAreaResultados;
    public JTextField txtFldIngresaNumero;
    public ButtonGroup buttonGroup = new ButtonGroup();

    // End of variables declaration//GEN-END:variables
}
