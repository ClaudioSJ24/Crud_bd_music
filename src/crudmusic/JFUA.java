/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmusic;

import DatAccess.Albums;
import DatAccess.Controllers;
import DatAccess.Genres;
import Resource.Operations;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudio Sánchez Juárez
 */
public class JFUA extends javax.swing.JFrame {

    /**
     * Creates new form JFUG
     */
    public JFUA() {
        initComponents();
        setLocationRelativeTo(null);
        Operations.fillComboBoxA(jComboBoxUa);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxUa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIG = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" UPDATE ALBUM");
        setMinimumSize(new java.awt.Dimension(250, 250));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 280));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 75));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Id_Album");
        jPanel1.add(jLabel4);

        jComboBoxUa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxUa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxUa);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Album");
        jPanel1.add(jLabel1);
        jPanel1.add(jTextFieldAl);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Autor");
        jPanel1.add(jLabel2);
        jPanel1.add(jTextFieldAu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Id_Genre");
        jPanel1.add(jLabel3);
        jPanel1.add(jTextFieldIG);

        jButtonOk.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonOk);

        jButtonC.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonC.setText("Cancel");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonC);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxUaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUaActionPerformed
        Operations.comboBoxA(jComboBoxUa, jTextFieldAl, jTextFieldAu, jTextFieldIG);
    }//GEN-LAST:event_jComboBoxUaActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        int item = Integer.parseInt(jComboBoxUa.getSelectedItem().toString());
        String name;
        String author;
        int id;
        if (!jTextFieldAl.getText().isEmpty() && !jTextFieldAu.getText().isEmpty() && !jTextFieldIG.getText().isEmpty()) {
            name = jTextFieldAl.getText();
            author = jTextFieldAu.getText();
            id = Integer.parseInt(jTextFieldIG.getText());
            Controllers controller = new Controllers();
            Albums a = null;
            Genres g = null;
            g = controller.SearchGenres(item);
            a = controller.SearchAlbums(item);
            a.setName(name);
            a.setAuthor(author);
            a.setGenres(g);
            controller.updateAlbums(a);
            JOptionPane.showMessageDialog(this, "Album " + name + " actualizado con exito", "OK", JOptionPane.INFORMATION_MESSAGE);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Llenar campos", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCActionPerformed

    Controllers controller = new Controllers();

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
            java.util.logging.Logger.getLogger(JFUA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JComboBox<String> jComboBoxUa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAl;
    private javax.swing.JTextField jTextFieldAu;
    private javax.swing.JTextField jTextFieldIG;
    // End of variables declaration//GEN-END:variables
}