
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewMyInfoD extends javax.swing.JFrame {

   
    public ViewMyInfoD() {
        initComponents();
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("My Information");

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Phone Number");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jTable1.setModel(new DefaultTableModel());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM doctor WHERE Docid =" +GUILogin2.id;
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
             colN[0] = "ID";
             colN[1]= "First Name";
             colN[2]= "Last Name";
             colN[3]= "Degree";
             colN[4]= "Speciality";
             colN[5]= "Salary";
             colN[6]= "ZIP Code";
             colN[7]= "Residence Number";
             colN[8]= "Street";
             colN[9]= "Phone Number";
             
            t.setColumnIdentifiers(colN);
            String id, first, last, degree, speciality, salary, zip, res, street, phone;
            while(r.next()){
                id = r.getString(1);
                first = r.getString(2);
                last = r.getString(3);
                degree = r.getString(4);
                speciality = r.getString(5);
                salary = r.getString(6);
                zip = r.getString(7);
                res = r.getString(8);
                street = r.getString(9);
                phone = r.getString(10);
                
                
                String [] row = {id,first,last,degree,speciality, salary, zip, res, street, phone};
                t.addRow(row);
            }
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());
        }    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DoctorPage r = new DoctorPage();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();
         if(jTextField1.getText().length() != 10)
             JOptionPane.showMessageDialog(null, "Invalid Phone number");
         else 
         { int x = Integer.parseInt(jTextField1.getText());
        
        String sql = "UPDATE doctor SET Docphone=? WHERE Docid=?";

	 PreparedStatement statement2 = connection.prepareStatement(sql);
	 statement2.setString(1, jTextField1.getText());
         statement2.setString(2, GUILogin2.id);

	int rowUpdated = statement2.executeUpdate(); 
        if(rowUpdated == 1)
        {  
         jTable1.setModel(new DefaultTableModel());
         String sql2 = "SELECT * FROM doctor WHERE Docid =" +GUILogin2.id;
            ResultSet r = statement.executeQuery(sql2);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
             colN[0] = "ID";
             colN[1]= "First Name";
             colN[2]= "Last Name";
             colN[3]= "Degree";
             colN[4]= "Speciality";
             colN[5]= "Salary";
             colN[6]= "ZIP Code";
             colN[7]= "Residence Number";
             colN[8]= "Street";
             colN[9]= "Phone Number";
             
            t.setColumnIdentifiers(colN);
            String id, first, last, degree, speciality, salary, zip, res, street, phone;

            while(r.next()){
                id = r.getString(1);
                first = r.getString(2);
                last = r.getString(3);
                degree = r.getString(4);
                speciality = r.getString(5);
                salary = r.getString(6);
                zip = r.getString(7);
                res = r.getString(8);
                street = r.getString(9);
                phone = r.getString(10);
                
                String [] row = {id,first,last,degree,speciality, salary, zip, res, street, phone};
                t.addRow(row);
            }
             JOptionPane.showMessageDialog(null, "Phone Number Successfully Updated!");
        }   
         connection.close();}
        }
         catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Invalid Phone number");
         
         }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());
        }
         

    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
