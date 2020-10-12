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
public class AdminMenuWardOccupied extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private DefaultTableModel model1;
    /**
     * Creates new form MenuWard
     */
    public AdminMenuWardOccupied() {
        initComponents();
        inCBWardName.setModel(new DefaultComboBoxModel(
                new Kamar().getAll().toArray()
        ));
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        this.tblInpatient.setModel(model);
        this.tblPatient.setModel(model1);
        model.addColumn("Inpatient Code");
        model.addColumn("Ward Code");
        model.addColumn("Warn Name");
        model.addColumn("Patient Code");
        model.addColumn("Patient Name");
        model1.addColumn("Patient Code");
        model1.addColumn("Patient Name");
        this.setLocationRelativeTo(null);
        dataToTable();
    }
    
    private void dataToTable() {
        model.getDataVector().removeAllElements();
        model1.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model1.fireTableDataChanged();
        
        for (RawatInap rawatInap : new RawatInap().getAll()) {
            Object[] o = new Object[5];
            o[0] = rawatInap.getKdRawatinap();
            o[1] = rawatInap.getKdKamar();
            o[2] = rawatInap.getKamar().getNamaKamar();
            o[3] = rawatInap.getKdPasien();
            o[4] = rawatInap.getPasien().getNamaPasien();
            model.addRow(o);
        }
        
        for (Pasien pasien : new Pasien().getAll()) {
            Object[] o = new Object[2];
            o[0] = pasien.getKdPasien();
            o[1] = pasien.getNamaPasien();
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
        menuward = new javax.swing.JPanel();
        Dashboard = new javax.swing.JLabel();
        Doctor = new javax.swing.JLabel();
        ward = new javax.swing.JLabel();
        patient = new javax.swing.JLabel();
        transaction = new javax.swing.JLabel();
        formward = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInpatient = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inPatientCode = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        updatebutton1 = new javax.swing.JButton();
        inpatientCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        inCBWardName = new javax.swing.JComboBox<>();
        btnWardList = new javax.swing.JButton();
        buttonwardocccupied = new javax.swing.JButton();

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
                .addContainerGap(511, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel12.setText(" Manage Ward");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        menuward.setBackground(new java.awt.Color(0, 102, 204));

        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard.setText("Dashboard");
        Dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });

        Doctor.setForeground(new java.awt.Color(255, 255, 255));
        Doctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doctor.setText("Doctor");
        Doctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorMouseClicked(evt);
            }
        });

        ward.setForeground(new java.awt.Color(255, 255, 255));
        ward.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ward.setText("Ward");
        ward.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        patient.setForeground(new java.awt.Color(255, 255, 255));
        patient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patient.setText("Patient");
        patient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientMouseClicked(evt);
            }
        });

        transaction.setForeground(new java.awt.Color(255, 255, 255));
        transaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transaction.setText("Transaction");
        transaction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuwardLayout = new javax.swing.GroupLayout(menuward);
        menuward.setLayout(menuwardLayout);
        menuwardLayout.setHorizontalGroup(
            menuwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
            .addComponent(ward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuwardLayout.setVerticalGroup(
            menuwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuwardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ward, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formward.setBackground(new java.awt.Color(255, 255, 255));

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        tblInpatient.setForeground(new java.awt.Color(0, 0, 0));
        tblInpatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Inpatient Code", "Ward Code", "Warn Name", "Patient Code", "Patient Name"
            }
        ));
        tblInpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInpatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInpatient);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Add Ward");

        jLabel10.setText("Ward Name");

        jLabel11.setText("Patient Code");

        addbutton.setBackground(new java.awt.Color(0, 102, 204));
        addbutton.setForeground(new java.awt.Color(255, 255, 255));
        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        updatebutton1.setBackground(new java.awt.Color(0, 102, 204));
        updatebutton1.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton1.setText("Delete");
        updatebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton1ActionPerformed(evt);
            }
        });

        inpatientCode.setText("Inpatient Code");
        inpatientCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpatientCodeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Delete");

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient Code", "Patient Name"
            }
        ));
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPatient);

        inCBWardName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(38, 38, 38)
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inPatientCode)
                                    .addComponent(inCBWardName, 0, 137, Short.MAX_VALUE)))
                            .addComponent(addbutton)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inpatientCode)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(inpatientCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(updatebutton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inCBWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(inPatientCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addbutton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnWardList.setText("Ward List");
        btnWardList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWardListActionPerformed(evt);
            }
        });

        buttonwardocccupied.setText("Ward  Occupied");

        javax.swing.GroupLayout formwardLayout = new javax.swing.GroupLayout(formward);
        formward.setLayout(formwardLayout);
        formwardLayout.setHorizontalGroup(
            formwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formwardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWardList)
                .addGap(18, 18, 18)
                .addComponent(buttonwardocccupied)
                .addContainerGap(497, Short.MAX_VALUE))
            .addGroup(formwardLayout.createSequentialGroup()
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formwardLayout.setVerticalGroup(
            formwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formwardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(formwardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWardList)
                    .addComponent(buttonwardocccupied))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(formward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addComponent(menuward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWardListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWardListActionPerformed
        new AdminMenuWardList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnWardListActionPerformed

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new AdminMenuPetugas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void DoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorMouseClicked
        new AdminMenuDokter().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoctorMouseClicked

    private void patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseClicked
        new AdminMenuPasien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientMouseClicked

    private void transactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseClicked
        new AdminMenuTransaction().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transactionMouseClicked

    private void inpatientCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpatientCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpatientCodeActionPerformed

    private void tblInpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInpatientMouseClicked
        int selectedRow = tblInpatient.getSelectedRow();
        inpatientCode.setText(model.getValueAt(selectedRow, 0).toString());
    }//GEN-LAST:event_tblInpatientMouseClicked

    private void updatebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton1ActionPerformed
        RawatInap rwt = new RawatInap().getById(Integer.parseInt(inpatientCode.getText()));
        rwt.delete();
        JOptionPane.showMessageDialog(this, "Data telah terhapus");
        dataToTable();
    }//GEN-LAST:event_updatebutton1ActionPerformed

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
        int SelectedRow = tblPatient.getSelectedRow();
        inPatientCode.setText(model1.getValueAt(SelectedRow, 0).toString());
    }//GEN-LAST:event_tblPatientMouseClicked

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        RawatInap ri = new RawatInap();
        ri.setKdKamar(new Kamar().getByName(inCBWardName.getSelectedItem().toString()).getKdKamar());
        ri.setKdPasien(Integer.parseInt(inPatientCode.getText()));
        ri.save();
        JOptionPane.showMessageDialog(this, "Data telah ditambahkan");
        dataToTable();
    }//GEN-LAST:event_addbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenuWardOccupied.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenuWardOccupied.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenuWardOccupied.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenuWardOccupied.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenuWardOccupied().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Doctor;
    private javax.swing.JButton addbutton;
    private javax.swing.JButton btnWardList;
    private javax.swing.JButton buttonwardocccupied;
    private javax.swing.JPanel form;
    private javax.swing.JPanel formward;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox<String> inCBWardName;
    private javax.swing.JTextField inPatientCode;
    private javax.swing.JTextField inpatientCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuward;
    private javax.swing.JLabel patient;
    private javax.swing.JTable tblInpatient;
    private javax.swing.JTable tblPatient;
    private javax.swing.JLabel transaction;
    private javax.swing.JButton updatebutton1;
    private javax.swing.JLabel ward;
    // End of variables declaration//GEN-END:variables
}