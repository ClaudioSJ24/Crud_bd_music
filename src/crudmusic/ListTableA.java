/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmusic;

import DatAccess.Albums;
import DatAccess.Controllers;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Claudio Sánchez Juárez
 */
public class ListTableA extends javax.swing.JPanel {

    /**
     * Creates new form ListTable
     */
    public ListTableA() {
        initComponents();
        jTableA.getTableHeader().setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableA = new javax.swing.JTable();
        jButtonSA = new javax.swing.JButton();
        jButtonDA = new javax.swing.JButton();
        jButtonIA = new javax.swing.JButton();
        jButtonUA = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 204));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));

        jTableA.setBackground(java.awt.Color.lightGray);
        jTableA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableA.setEnabled(false);
        jScrollPane2.setViewportView(jTableA);

        jButtonSA.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonSA.setText("Show");
        jButtonSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSAActionPerformed(evt);
            }
        });

        jButtonDA.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonDA.setText("Delete");
        jButtonDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDAActionPerformed(evt);
            }
        });

        jButtonIA.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonIA.setText("Insert");
        jButtonIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIAActionPerformed(evt);
            }
        });

        jButtonUA.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonUA.setText("Update");
        jButtonUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButtonSA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonDA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonUA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonIA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAActionPerformed
        jTableA.getTableHeader().setVisible(true);
        DefaultTableModel model = new DefaultTableModel();
        jTableA.setModel(model);
        model.addColumn("id");
        model.addColumn("name");
        model.addColumn("author");
        model.addColumn("genre_id");
        Controllers controller = new Controllers();
        List data = controller.selectAllA();
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Albums a = (Albums) it.next();
            Object[] row = new Object[4];
            row[0] = a.getId();
            row[1] = a.getName();
            row[2] = a.getAuthor();
            row[3] = a.getGenres().getId();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButtonSAActionPerformed

    private void jButtonDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDAActionPerformed
        JFDA JpanelD = new JFDA();
        JpanelD.setVisible(true);

    }//GEN-LAST:event_jButtonDAActionPerformed

    private void jButtonIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIAActionPerformed
        JFIA JpanelI = new JFIA();
        JpanelI.setVisible(true);
    }//GEN-LAST:event_jButtonIAActionPerformed

    private void jButtonUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUAActionPerformed
        JFUA JpanelU = new JFUA();
        JpanelU.setVisible(true);
    }//GEN-LAST:event_jButtonUAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDA;
    private javax.swing.JButton jButtonIA;
    private javax.swing.JButton jButtonSA;
    private javax.swing.JButton jButtonUA;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableA;
    // End of variables declaration//GEN-END:variables

}
