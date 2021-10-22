/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmusic;

import DatAccess.Controllers;
import DatAccess.Genres;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Claudio Sánchez Juárez
 */
public class ListTableG extends javax.swing.JPanel {

    /**
     * Creates new form ListTable
     */
    public ListTableG() {
        initComponents();
        jTableG.getTableHeader().setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableG = new javax.swing.JTable();
        jButtonSG = new javax.swing.JButton();
        jButtonDG = new javax.swing.JButton();
        jButtonSeG = new javax.swing.JButton();
        jButtonUG = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));

        jTableG.setBackground(java.awt.Color.lightGray);
        jTableG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableG.setEnabled(false);
        jScrollPane2.setViewportView(jTableG);

        jButtonSG.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSG.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonSG.setText("Show");
        jButtonSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSGActionPerformed(evt);
            }
        });

        jButtonDG.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDG.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonDG.setText("Delete");
        jButtonDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDGActionPerformed(evt);
            }
        });

        jButtonSeG.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSeG.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonSeG.setText("Insert");
        jButtonSeG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeGActionPerformed(evt);
            }
        });

        jButtonUG.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUG.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonUG.setText("Update");
        jButtonUG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSeG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
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
                .addComponent(jButtonSG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonDG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonUG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonSeG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSGActionPerformed
        jTableG.getTableHeader().setVisible(true);
        DefaultTableModel model = new DefaultTableModel();
        jTableG.setModel(model);
        model.addColumn("id");
        model.addColumn("name");
        Controllers controller = new Controllers();
        List data = controller.selectAll();
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Genres g = (Genres) it.next();
            Object[] row = new Object[2];
            row[0] = g.getId();
            row[1] = g.getName();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButtonSGActionPerformed

    private void jButtonDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDGActionPerformed
        JFDG JpanelD = new JFDG();
        JpanelD.setVisible(true);

    }//GEN-LAST:event_jButtonDGActionPerformed

    private void jButtonSeGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeGActionPerformed
        JFIG JpanelI = new JFIG();
        JpanelI.setVisible(true);
    }//GEN-LAST:event_jButtonSeGActionPerformed

    private void jButtonUGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUGActionPerformed
        JFUG JpanelU = new JFUG();
        JpanelU.setVisible(true);
    }//GEN-LAST:event_jButtonUGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDG;
    private javax.swing.JButton jButtonSG;
    private javax.swing.JButton jButtonSeG;
    private javax.swing.JButton jButtonUG;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableG;
    // End of variables declaration//GEN-END:variables

}
