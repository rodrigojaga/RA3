/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import POO.clientesPOO;
import MODELO.ah4DAORelacional;
import img.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class upcli extends javax.swing.JFrame {

    /**
     * Creates new form upcli
     */
    public upcli() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt tfU = new TextPrompt("Nombre:",nomcli);
        TextPrompt tfc = new TextPrompt("NIT: ",nitcli);
        TextPrompt tfa = new TextPrompt("Correo: ",corcli);
        sexo.add(mas);
        sexo.add(fem);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codcli = new javax.swing.JTextField();
        corcli = new javax.swing.JTextField();
        nitcli = new javax.swing.JTextField();
        mas = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        nomcli = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(204, 255, 204));
        jInternalFrame1.setVisible(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        jLabel1.setText("Actualizar CLiente");

        codcli.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        codcli.setEnabled(false);

        corcli.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        corcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                corcliKeyTyped(evt);
            }
        });

        nitcli.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nitcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitcliKeyTyped(evt);
            }
        });

        mas.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        mas.setText("Masculino");
        mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masMouseClicked(evt);
            }
        });

        fem.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        fem.setText("Femenino");

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nomcli.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nomcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomcliKeyTyped(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarSesion.png"))); // NOI18N
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarSesion.png"))); // NOI18N
        jButton26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarSesion.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jButton26))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(corcli, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nitcli, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomcli, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(mas)
                                .addGap(18, 18, 18)
                                .addComponent(fem))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomcli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nitcli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(corcli, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fem)
                    .addComponent(mas))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton26)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(nomcli.getText().isEmpty()||nitcli.getText().isEmpty()||corcli.getText().isEmpty()
            ||(mas.isSelected()==false &&fem.isSelected()==false)){

            JOptionPane.showMessageDialog(null, "DEBE LLENAR Y/O SELECCIONAR TODOS LOS CAMPOS");
            Color ca = new Color(255,160,160);
            if(nomcli.getText().equals("")){
                nomcli.setBackground(ca);
            }
            if(nitcli.getText().equals("")){
                nitcli.setBackground(ca);
            }
            if(corcli.getText().equals("")){
                corcli.setBackground(ca);
            }
            if(mas.isSelected()==false && fem.isSelected() == false){
                mas.setForeground(Color.red);
                fem.setForeground(Color.red);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cliente modificado");
            enviar();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        principal pr = new principal();
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void nomcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomcliKeyTyped
        nomcli.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_nomcliKeyTyped

    private void nitcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitcliKeyTyped
        nitcli.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_nitcliKeyTyped

    private void corcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_corcliKeyTyped
        corcli.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_corcliKeyTyped

    private void masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_masMouseClicked

    
    public void mostrar(int id) {
        ah4DAORelacional ev = new ah4DAORelacional();
        clientesPOO eve = ev.obtener(id);
        if(eve.getGenero().equals("M")||eve.getGenero().equals("m")){
            codcli.setText(eve.getId() + "");
            nomcli.setText(eve.getNombre() + "");
            nitcli.setText(eve.getNit() + "");
            corcli.setText(eve.getCorreo() + "");
            mas.setSelected(true);
            fem.setSelected(false);
            
        }else if(eve.getGenero().equals("F")||eve.getGenero().equals("f")){
            codcli.setText(eve.getId() + "");
            nomcli.setText(eve.getNombre() + "");
            nitcli.setText(eve.getNit() + "");
            corcli.setText(eve.getCorreo() + "");
            mas.setSelected(false);
            fem.setSelected(true);
            
        }
        
    }
    
    public void enviar(){
        if(mas.isSelected() == true){
            principal pr = new principal();
            clientesPOO ah = new clientesPOO(Integer.parseInt(codcli.getText()),nomcli.getText(),Integer.parseInt(nitcli.getText()),
            corcli.getText(),"M");
            ah4DAORelacional ahd = new ah4DAORelacional();
            ahd.modificarCliente(ah);
            pr.setVisible(true);
            dispose();
        }else if (fem.isSelected() == true){
            //JOptionPane.showMessageDialog(null, "Entro a femenisnp");
            ah4DAORelacional ahd = new ah4DAORelacional();
            principal pr = new principal();
            clientesPOO ah = new clientesPOO(Integer.parseInt(codcli.getText()),nomcli.getText(),Integer.parseInt(nitcli.getText()),
            corcli.getText(),"F");
            ahd.modificarCliente(ah);
            pr.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Error detectado");
        }
    }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(upcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upcli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codcli;
    private javax.swing.JTextField corcli;
    private javax.swing.JRadioButton fem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton26;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton mas;
    private javax.swing.JTextField nitcli;
    private javax.swing.JTextField nomcli;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
