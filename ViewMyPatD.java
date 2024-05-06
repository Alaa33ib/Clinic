import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewMyPatD extends javax.swing.JFrame {

    public ViewMyPatD() {
        initComponents();
          this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("My Patients");

        jButton4.setText("View My Patient(s) with Diagnosis");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Update Diagnosis of Patient");
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

        jButton1.setText("View All My Patients");
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

        jButton5.setText("View My Patient with ID");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Do you want to update a patient's diagnosis?");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient ID");

        jLabel4.setText("Diagnosis");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DoctorPage r = new DoctorPage();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jTable1.setModel(new DefaultTableModel());
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();
            String sql = "SELECT Patid, Pssn, Pfirst, Pmiddle, Plast, Patphone, Dob, Gender, Diagnosis FROM patient, appointment WHERE Patid = Pat_ID AND Diagnosis = " +"'"+ jTextField2.getText()+ "'"+" AND Doc_ID = " + GUILogin2.id;
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "ID";
            colN[1]= "SSN";
            colN[2]= "First name";
            colN[3]= "Middle name";
            colN[4]= "Last name";
            colN[5]= "Phone number";
            colN[6]= "Date of birth";
            colN[7]= "Gender";
            colN[8]= "Diagnosis";  
            t.setColumnIdentifiers(colN);
            String id, ssn, first, mid, last, phone, dob, gender, diagnosis;
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
                diagnosis =r.getString(9);
                exists = true;
                String [] row = {id,ssn,first,mid,last,phone,dob, gender,diagnosis};
                t.addRow(row);
            }
            if(!exists)
             JOptionPane.showMessageDialog(null, "No patient found!");
            jTextField2.setText("");
            connection.close(); }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString()); }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      jTable1.setModel(new DefaultTableModel());
      if(jCheckBox1.isSelected())
      {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
           Statement statement = connection.createStatement(); 
           if(jTextField3.getText().length()!=5) 
             JOptionPane.showMessageDialog(null, "Invalid ID: must be 5 characters long!");
           else 
           {
            int check = Integer.parseInt(jTextField3.getText());
            String sql3 = "SELECT COUNT(1) FROM appointment WHERE Doc_ID =" + GUILogin2.id + " AND Pat_ID=" + jTextField3.getText();
            ResultSet result =  statement.executeQuery(sql3);
            result.next();
            if(result.getInt(1) > 0)//patient is the doctor's patient
            {
             String sql = "UPDATE patient SET Diagnosis=" + "'" + jTextField4.getText() +"'"+ "WHERE Patid=" + "'" + jTextField3.getText() +"'";
	     PreparedStatement statement2 = connection.prepareStatement(sql);
             int upd = statement2.executeUpdate();
             if (upd != 0)
             {
               jTable1.setModel(new DefaultTableModel());
               String sql2 = "SELECT * FROM patient WHERE Patid = " + jTextField3.getText();
               ResultSet r = statement.executeQuery(sql2);
               ResultSetMetaData rm =  r.getMetaData();
               DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
               int cols = rm.getColumnCount();
               String [] colN = new String[cols];
               colN[0] = "ID";
               colN[1]= "SSN";
               colN[2]= "First name";
               colN[3]= "Middle name";
               colN[4]= "Last name";
               colN[5]= "Phone number";
               colN[6]= "Date of birth";
               colN[7]= "Gender";
               colN[8]= "Diagnosis";  
               t.setColumnIdentifiers(colN);
               String id, ssn, first, mid, last, phone, dob, gender, diagnosis;
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
                diagnosis =r.getString(9);
                String [] row = {id,ssn,first,mid,last,phone,dob,gender,diagnosis};
                t.addRow(row);
                } 
                JOptionPane.showMessageDialog(null, "Diagnosis successfully updated!");} 
                else
                 JOptionPane.showMessageDialog(null, "Operation is unsuccessful!"); }
            else
                 JOptionPane.showMessageDialog(null, "No patient found!"); }
           jTextField3.setText("");
           jTextField4.setText("");
           connection.close();}
       catch (NumberFormatException e)
        {  JOptionPane.showMessageDialog(null, "Invalid ID: please enter digits only.");
           jTextField3.setText("");
        } 
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString()); }
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setModel(new DefaultTableModel());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();
            String sql = "SELECT Patid, Pssn, Pfirst, Pmiddle, Plast, Patphone, Dob, Gender, Diagnosis FROM patient, appointment WHERE Patid = Pat_ID AND Doc_ID = " + GUILogin2.id;
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "ID";
            colN[1]= "SSN";
            colN[2]= "First name";
            colN[3]= "Middle name";
            colN[4]= "Last name";
            colN[5]= "Phone number";
            colN[6]= "Date of birth";
            colN[7]= "Gender";
            colN[8]= "Diagnosis";  
            t.setColumnIdentifiers(colN);
            String id, ssn, first, mid, last, phone, dob, gender, diagnosis;
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
                diagnosis =r.getString(9);
                exists = true;
                String [] row = {id,ssn,first,mid,last,phone,dob, gender,diagnosis};
                t.addRow(row);
            }
            if(!exists)
              JOptionPane.showMessageDialog(null, "You have no patients!");
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString()); }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      jTable1.setModel(new DefaultTableModel());
      try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
           Statement statement = connection.createStatement();
           if(jTextField1.getText().length()!=5) 
           JOptionPane.showMessageDialog(null, "Invalid ID: must be 5 characters long!");
           else 
           {
            int check = Integer.parseInt(jTextField1.getText());
            String sql = "SELECT Patid, Pssn, Pfirst, Pmiddle, Plast, Patphone, Dob, Gender, Diagnosis FROM patient, appointment WHERE Patid = Pat_ID AND Patid = " + jTextField1.getText() +" AND Doc_ID = " + GUILogin2.id;
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "ID";
            colN[1]= "SSN";
            colN[2]= "First name";
            colN[3]= "Middle name";
            colN[4]= "Last name";
            colN[5]= "Phone number";
            colN[6]= "Date of birth";
            colN[7]= "Gender";
            colN[8]= "Diagnosis";   
            t.setColumnIdentifiers(colN);
            String id, ssn, first, mid, last, phone, dob, gender, diagnosis;
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
                diagnosis =r.getString(9);
                exists = true;
                String [] row = {id,ssn,first,mid,last,phone,dob, gender,diagnosis};
                t.addRow(row);
            }  
            if(!exists)
              JOptionPane.showMessageDialog(null, "No patient found!"); }
            jTextField1.setText("");
            connection.close();
        }
        catch (NumberFormatException e)
        {  JOptionPane.showMessageDialog(null, "Invalid ID: please enter digits only.");
           jTextField1.setText("");
        } 
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton7ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
