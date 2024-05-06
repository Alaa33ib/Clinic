import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PatientView extends javax.swing.JFrame {

    public PatientView() {
        initComponents();
         this.setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("View All Patients");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Receptionist View");

        jButton3.setText("View Patient with ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View Patient with Phone");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View Patient with SSN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jTable1.setModel(new DefaultTableModel());
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");  
        Statement statement = connection.createStatement();      
        String sql = "SELECT * FROM patient";
         ResultSet r = statement.executeQuery(sql);
        ResultSetMetaData rm =  r.getMetaData();
        DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
	int cols = rm.getColumnCount();
        String [] colN = new String[cols-1];
        colN[0] = "Patient ID";
        colN[1] = "SSN";
        colN[2] = "First name";
        colN[3] = "Middle name";
        colN[4] = "Last name";
	colN[5] = "Phone number";
        colN[6] = "Date of birth";
        colN[7] = "Gender";
        t.setColumnIdentifiers(colN);
        String id, ssn, first, mid, last, phone, dob, gender;
        boolean exists = false;
        while(r.next())
        {
            id = r.getString(1);
            ssn = r.getString(2);
            first = r.getString(3);
            mid = r.getString(4);
            last = r.getString(5);
            phone = r.getString(6);
            dob = r.getString(7);
            gender = r.getString(8);
            exists = true;
            String [] row = {id,ssn,first,mid,last,phone,dob, gender};
            t.addRow(row);
        }
        if(!exists)
            JOptionPane.showMessageDialog(null, "No patient found in the system!");
        connection.close();
       }                                        
       catch (Exception e)
       {  JOptionPane.showMessageDialog(null, e.toString());  
            
 }    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ReceptionistPage r = new ReceptionistPage();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jTable1.setModel(new DefaultTableModel());
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");  
        Statement statement = connection.createStatement();
        if(jTextField1.getText().length()!=5) 
            JOptionPane.showMessageDialog(null, "Invalid ID: must be 5 characters long!");
        else {
              int check = Integer.parseInt(jTextField1.getText());
              String sql = "SELECT * FROM patient WHERE Patid =" +jTextField1.getText();
              ResultSet r = statement.executeQuery(sql);
              ResultSetMetaData rm =  r.getMetaData();
              DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
	      int cols = rm.getColumnCount();
              String [] colN = new String[cols-1];
              colN[0] = "Patient ID";
              colN[1] = "SSN";
              colN[2] = "First name";
              colN[3] = "Middle name";
              colN[4] = "Last name";
	      colN[5] = "Phone number";
              colN[6] = "Date of birth";
              colN[7] = "Gender";
              t.setColumnIdentifiers(colN);
              String id, ssn, first, mid, last, phone, dob, gender;
              boolean exists = false;
              while(r.next())
              {
               id = r.getString(1);
               ssn = r.getString(2);
               first = r.getString(3);
               mid = r.getString(4);
               last = r.getString(5);
               phone = r.getString(6);
               dob = r.getString(7);
               gender = r.getString(8);
               exists = true;
               String [] row = {id,ssn,first,mid,last,phone,dob, gender};
               t.addRow(row);
             }       
             if(!exists)
               JOptionPane.showMessageDialog(null, "Patient not found!");}
             jTextField1.setText("");
             connection.close();
       }  
        catch (NumberFormatException e)
        {  JOptionPane.showMessageDialog(null, "Invalid ID: please enter digits only.");
           jTextField1.setText("");
        } 
        catch (Exception e)
        { JOptionPane.showMessageDialog(null, e.toString());  
            
 }    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     jTable1.setModel(new DefaultTableModel());
     try{   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");  
        Statement statement = connection.createStatement();
        if(jTextField2.getText().length()!=10) 
            JOptionPane.showMessageDialog(null, "Invalid phone number: must be 10 characters long!");
        else 
        {
          int check = Integer.parseInt(jTextField2.getText());
          String sql = "SELECT * FROM patient WHERE Patphone =" +jTextField2.getText();
          ResultSet r = statement.executeQuery(sql);
          ResultSetMetaData rm =  r.getMetaData();
          DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
	  int cols = rm.getColumnCount();
          String [] colN = new String[cols-1];
          colN[0] = "Patient ID";
          colN[1] = "SSN";
          colN[2] = "First name";
          colN[3] = "Middle name";
          colN[4] = "Last name";
	  colN[5] = "Phone number";
          colN[6] = "Date of birth";
          colN[7] = "Gender";
          t.setColumnIdentifiers(colN);
          String id, ssn, first, mid, last, phone, dob, gender;
          boolean exists = false;
          while(r.next())
          {
            id = r.getString(1);
            ssn = r.getString(2);
            first = r.getString(3);
            mid = r.getString(4);
            last = r.getString(5);
            phone = r.getString(6);
            dob = r.getString(7);
            gender = r.getString(8);
            exists = true;
            String [] row = {id,ssn,first,mid,last,phone,dob, gender};
            t.addRow(row);
        } 
        if(!exists)
            JOptionPane.showMessageDialog(null, "Patient not found!");}
        jTextField2.setText("");
        connection.close();
         }       
         catch (NumberFormatException e)
        {  
          JOptionPane.showMessageDialog(null, "Invalid phone number: please enter digits only.");
          jTextField2.setText("");
        }                                       
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString()); }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    jTable1.setModel(new DefaultTableModel());
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");  
        Statement statement = connection.createStatement();
        if(jTextField3.getText().length()!=10) 
            JOptionPane.showMessageDialog(null, "Invalid SSN: must be 10 characters long!");
        else
        {
         int check = Integer.parseInt(jTextField3.getText());
         String sql = "SELECT * FROM patient WHERE Pssn =" + jTextField3.getText();
         ResultSet r = statement.executeQuery(sql);
         ResultSetMetaData rm =  r.getMetaData();
         DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
	 int cols = rm.getColumnCount();
         String [] colN = new String[cols-1];
         colN[0] = "Patient ID";
         colN[1] = "SSN";
         colN[2] = "First name";
         colN[3] = "Middle name";
         colN[4] = "Last name";
	 colN[5] = "Phone number";
         colN[6] = "Date of birth";
         colN[7] = "Gender";
         t.setColumnIdentifiers(colN);
         boolean exists = false;
         String id, ssn, first, mid, last, phone, dob, gender;
         while(r.next())
         {
            id = r.getString(1);
            ssn = r.getString(2);
            first = r.getString(3);
            mid = r.getString(4);
            last = r.getString(5);
            phone = r.getString(6);
            dob = r.getString(7);
            gender = r.getString(8);
            exists = true;
            String [] row = {id,ssn,first,mid,last,phone,dob, gender};
            t.addRow(row);
           }
           if(!exists)
             JOptionPane.showMessageDialog(null, "Patient not found!"); 
        }
        jTextField3.setText("");
        connection.close();
      }  
      catch (NumberFormatException e)
      {  JOptionPane.showMessageDialog(null, "Invalid SSN: please enter digits only.");
            jTextField3.setText("");
      }  
     catch (Exception e)
     {  JOptionPane.showMessageDialog(null, e.toString());  
            
 }    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     jTable1.setModel(new DefaultTableModel());        
    }//GEN-LAST:event_jButton5ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
