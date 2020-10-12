/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenrumahsakit;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import backend.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class AdminMenuTransaction extends javax.swing.JFrame {
    private DefaultTableModel model;
    private DefaultTableModel model1;
    /**
     * Creates new form AdminMenuTransaction
     */
    public AdminMenuTransaction() {
        initComponents();
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        this.tblUnconfirmed.setModel(model);
        this.tblConfirmed.setModel(model1);
        model.addColumn("Transaction Code");
        model.addColumn("Doctor Name");
        model.addColumn("Patient Name");
        model.addColumn("Total Price");
        model.addColumn("Status Konfirmasi");
        model1.addColumn("Transaction Code");
        model1.addColumn("Doctor Name");
        model1.addColumn("Patient Name");
        model1.addColumn("Total Price");
        model1.addColumn("Status Konfirmasi");
        this.setLocationRelativeTo(null);
        dataToTable();
    }
    
    private void dataToTable() {
        model.getDataVector().removeAllElements();
        model1.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model1.fireTableDataChanged();
        
        for (Pembayaran pembayaran : new Pembayaran().getAllWhereUnconfirmed()) {
            Object[] o = new Object[5];
            o[0] = pembayaran.getKdPembayaran();
            o[1] = pembayaran.getPasien().getDokter().getNamaDokter();
            o[2] = pembayaran.getPasien().getNamaPasien();
            o[3] = pembayaran.getJumlahHarga();
            o[4] = pembayaran.getIsConfirmed();
            model.addRow(o);
        }
        
        for (Pembayaran pembayaran : new Pembayaran().getAllWhereConfirmed()) {
            Object[] o = new Object[5];
            o[0] = pembayaran.getKdPembayaran();
            o[1] = pembayaran.getPasien().getDokter().getNamaDokter();
            o[2] = pembayaran.getPasien().getNamaPasien();
            o[3] = pembayaran.getJumlahHarga();
            o[4] = pembayaran.getIsConfirmed();
            model1.addRow(o);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        labelDoctor = new javax.swing.JLabel();
        labelWard = new javax.swing.JLabel();
        labelPatient = new javax.swing.JLabel();
        labelTransaction = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnconfirmed = new javax.swing.JTable();
        labelConfirmation = new javax.swing.JLabel();
        txtFIeldTransaction = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        labelConfirmation1 = new javax.swing.JLabel();
        labelConfirmation2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConfirmed = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setBackground(new java.awt.Color(0, 102, 204));
        header.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        header.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Hospital Management System");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(561, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel12.setText(" Manage Transaction");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        menu.setBackground(new java.awt.Color(0, 102, 204));

        labelDashboard.setForeground(new java.awt.Color(255, 255, 255));
        labelDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDashboard.setText("Dashboard");
        labelDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDashboardMouseClicked(evt);
            }
        });

        labelDoctor.setForeground(new java.awt.Color(255, 255, 255));
        labelDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDoctor.setText("Doctor");
        labelDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDoctorMouseClicked(evt);
            }
        });

        labelWard.setForeground(new java.awt.Color(255, 255, 255));
        labelWard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWard.setText("Ward");
        labelWard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelWard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelWardMouseClicked(evt);
            }
        });

        labelPatient.setForeground(new java.awt.Color(255, 255, 255));
        labelPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPatient.setText("Patient");
        labelPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        labelPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPatientMouseClicked(evt);
            }
        });

        labelTransaction.setForeground(new java.awt.Color(255, 255, 255));
        labelTransaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTransaction.setText("Transaction");
        labelTransaction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
            .addComponent(labelWard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        tblUnconfirmed.setForeground(new java.awt.Color(0, 0, 0));
        tblUnconfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Transaction Code", "Doctor Name", "Patient Name", "Total Price", "Status Konfirmasi"
            }
        ));
        tblUnconfirmed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUnconfirmedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUnconfirmed);

        labelConfirmation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConfirmation.setText("Confirmation");

        txtFIeldTransaction.setText("Transaction Code");
        txtFIeldTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIeldTransactionActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 102, 204));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        labelConfirmation1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelConfirmation1.setText("Unconfirmed Transactions");

        labelConfirmation2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelConfirmation2.setText("Confirmed Transactions");

        tblConfirmed.setForeground(new java.awt.Color(0, 0, 0));
        tblConfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Transaction Code", "Doctor Name", "Patient Name", "Total Price", "Status Konfirmasi"
            }
        ));
        jScrollPane2.setViewportView(tblConfirmed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelConfirmation2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(labelConfirmation1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConfirmation)
                            .addComponent(txtFIeldTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm))
                        .addGap(31, 31, 31))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConfirmation)
                    .addComponent(labelConfirmation1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtFIeldTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelConfirmation2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFIeldTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIeldTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIeldTransactionActionPerformed

    private void labelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDashboardMouseClicked
        new AdminMenuPetugas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelDashboardMouseClicked

    private void labelDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDoctorMouseClicked
        new AdminMenuDokter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelDoctorMouseClicked

    private void labelPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPatientMouseClicked
        new AdminMenuPasien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelPatientMouseClicked

    private void labelWardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelWardMouseClicked
        new AdminMenuWardList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelWardMouseClicked

    private void tblUnconfirmedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnconfirmedMouseClicked
        int selectedRow = tblUnconfirmed.getSelectedRow();
        txtFIeldTransaction.setText(model.getValueAt(selectedRow, 0).toString());
    }//GEN-LAST:event_tblUnconfirmedMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        int transactionId = Integer.parseInt(txtFIeldTransaction.getText());
        Pembayaran pem = new Pembayaran().getById(transactionId);
        pem.setIsConfirmed(1);
        pem.save();
        JOptionPane.showMessageDialog(this, "Data telah terupdate");
        dataToTable();
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenuTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenuTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenuTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenuTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenuTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel form;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelConfirmation;
    private javax.swing.JLabel labelConfirmation1;
    private javax.swing.JLabel labelConfirmation2;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelDoctor;
    private javax.swing.JLabel labelPatient;
    private javax.swing.JLabel labelTransaction;
    private javax.swing.JLabel labelWard;
    private javax.swing.JPanel menu;
    private javax.swing.JTable tblConfirmed;
    private javax.swing.JTable tblUnconfirmed;
    private javax.swing.JTextField txtFIeldTransaction;
    // End of variables declaration//GEN-END:variables
}