/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SuperAdmin;

import Login.Panel.CreateNew;
import Manager.AddCancelOrderTab;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author G0kul x Arun
 */
public class ManageDeliveryStaffTab extends javax.swing.JFrame {

    /**
     * Creates new form ManageDeliveryTab
     */
    public ManageDeliveryStaffTab() {
        initComponents();
    }
    String login;
    public String setId(String id){login = id; return login;}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SearchTbDelivery = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryStaffTable = new javax.swing.JTable();
        RefreshBTN = new javax.swing.JButton();
        AddStaffBTN = new javax.swing.JButton();
        EditStaffBTN = new javax.swing.JButton();
        DeleteStaffBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Delivery Staff Tab");

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Delivery Staff");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        SearchTbDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTbDeliveryActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DeliveryStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Password", "Position", "First Name", "Last Name", "Gender", "Contact", "Address", "Email", "Birth Year", "Birth Month", "Birth Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DeliveryStaffTable);

        RefreshBTN.setBackground(new java.awt.Color(0, 255, 0));
        RefreshBTN.setFont(new java.awt.Font("Poppins", 3, 14)); // NOI18N
        RefreshBTN.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBTN.setText("Refresh");
        RefreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBTNActionPerformed(evt);
            }
        });

        AddStaffBTN.setBackground(new java.awt.Color(0, 0, 255));
        AddStaffBTN.setFont(new java.awt.Font("Poppins", 3, 12)); // NOI18N
        AddStaffBTN.setForeground(new java.awt.Color(255, 255, 255));
        AddStaffBTN.setText("Add Staff");
        AddStaffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStaffBTNActionPerformed(evt);
            }
        });

        EditStaffBTN.setBackground(new java.awt.Color(0, 0, 255));
        EditStaffBTN.setFont(new java.awt.Font("Poppins", 3, 12)); // NOI18N
        EditStaffBTN.setForeground(new java.awt.Color(255, 255, 255));
        EditStaffBTN.setText("Edit Staff");
        EditStaffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStaffBTNActionPerformed(evt);
            }
        });

        DeleteStaffBTN.setBackground(new java.awt.Color(0, 0, 255));
        DeleteStaffBTN.setFont(new java.awt.Font("Poppins", 3, 12)); // NOI18N
        DeleteStaffBTN.setForeground(new java.awt.Color(255, 255, 255));
        DeleteStaffBTN.setText("Delete Staff");
        DeleteStaffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStaffBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchTbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RefreshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchTbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         tableNull = "True";
        String filepath = "C:\\Users\\G0kul\\Desktop\\oodj\\OODJ\\src\\main\\java\\Login\\Panel\\employeeDTL.txt";
            File file = new File(filepath);
            try{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                String Search = SearchTbDelivery.getText();
                
                DefaultTableModel model = (DefaultTableModel)DeliveryStaffTable.getModel();
                Object[] lines = br.lines().toArray();
                model.setRowCount(0);
                for(int i = 0; i< lines.length; i++){
                    
                    String[] row = lines[i].toString().split(" ");
                    
                    //search on the basis of item id
                    if(row[0].equals(Search) && row[2].equals("delevery-person")){
                        model.setRowCount(0);
                        model.addRow(row);
                    }
                                      
                    //Search on the basis of receiver, sender, address, item name
                    if(row[3].equals(Search) || row[4].equals(Search) || row[5].equals(Search) || row[7].equals(Search)|| row[6].equals(Search) ){
                        if(row[2].equals("delevery-person")){
                            model.addRow(row);
                        }
                    }
                    
                    
                }
            }catch(FileNotFoundException e){} 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SuperAdminDashboard().setVisible(true);//set pages
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EditStaffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStaffBTNActionPerformed
        // TODO add your handling code here:
         this.dispose();
            EditDeliveryStaffTab ed = new EditDeliveryStaffTab();
            ed.setId(login);
            ed.setVisible(true);//set pages
    }//GEN-LAST:event_EditStaffBTNActionPerformed

    private void AddStaffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStaffBTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CreateNew c = new CreateNew();//set pages
        c.setId(login);
        c.setVisible(true);
    }//GEN-LAST:event_AddStaffBTNActionPerformed

    String tableNull = "True";
    private void RefreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBTNActionPerformed
        if(tableNull.equals("True")){
            this.tableNull = "false";
            String filepath = "C:\\Users\\G0kul\\Desktop\\oodj\\OODJ\\src\\main\\java\\Login\\Panel\\employeeDTL.txt";
            File file = new File(filepath);
            try{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                DefaultTableModel model = (DefaultTableModel)DeliveryStaffTable.getModel();
                Object[] lines = br.lines().toArray();
                model.setRowCount(0);
                for(int i = 0; i< lines.length; i++){
                        
                        String[] row = lines[i].toString().split(" ");
                    if(row[2].equals("delevery-person")){
                        model.addRow(row);
                    }
                }
                fr.close();
                br.close();
            }catch(FileNotFoundException e){} catch (IOException ex) {       
                Logger.getLogger(AddCancelOrderTab.class.getName()).log(Level.SEVERE, null, ex);
            }       
        }
    }//GEN-LAST:event_RefreshBTNActionPerformed

    private void SearchTbDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTbDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTbDeliveryActionPerformed

    private void DeleteStaffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStaffBTNActionPerformed
        String file = "C:\\Users\\G0kul\\Desktop\\oodj\\OODJ\\src\\main\\java\\Login\\Panel\\employeeDTL.txt";
        String tempFile = "C:\\Users\\G0kul\\Desktop\\oodj\\OODJ\\src\\main\\java\\Login\\Panel\\tempEmployeeDTL.txt";
        int idPosition = 0;
        int position = DeliveryStaffTable.getSelectedRow();
        String remove = DeliveryStaffTable.getValueAt(position, 0).toString();        
       
        
        File oldFile = new File(file);
        File newFile = new File(tempFile);
        String Line;
        String data[];
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            
            System.out.println(position);
            System.out.println(remove);
            while((Line = br.readLine()) != null){
                data = Line.split(" ");
                if(!(data[idPosition].equalsIgnoreCase(remove))){
                    pw.println(Line);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();
            
            oldFile.delete();
            File newname = new File(file);
            newFile.renameTo(newname);
            this.dispose();
            SuperAdminDashboard sa = new SuperAdminDashboard();
            sa.setId(login);
            sa.setVisible(true);
        }catch(IOException e){System.out.println(e);}
    }//GEN-LAST:event_DeleteStaffBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ManageDeliveryStaffTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDeliveryStaffTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDeliveryStaffTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDeliveryStaffTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDeliveryStaffTab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStaffBTN;
    private javax.swing.JButton DeleteStaffBTN;
    private javax.swing.JTable DeliveryStaffTable;
    private javax.swing.JButton EditStaffBTN;
    private javax.swing.JButton RefreshBTN;
    private javax.swing.JTextField SearchTbDelivery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
