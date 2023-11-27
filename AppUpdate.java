
import java.sql.*;
import javax.swing.JOptionPane;


public class AppUpdate extends javax.swing.JFrame {

  
    public AppUpdate() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("Date (YYYY-MM-DD)");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox1PropertyChange(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Receptionist View");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Please enter the appointment's ID and ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("choose the attribute(s) you'd like to update");

        jLabel5.setText("Appointment ID");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Time (HH:MM)");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ReceptionistPage r = new ReceptionistPage();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");  
        Statement statement = connection.createStatement();  
	if(jTextField1.getText().length()!=5) JOptionPane.showMessageDialog(null, "invalid id");
            int check = Integer.parseInt(jTextField1.getText());
	if((jTextField2.getText().length()!=10)||(jTextField2.getText().charAt(4)!='-')||(jTextField2.getText().charAt(7)!='-')) JOptionPane.showMessageDialog(null, "please enter date in this format YYYY-MM-DD" );
	if((jTextField3.getText().length()!=5)||(jTextField3.getText().charAt(2)!=':')) JOptionPane.showMessageDialog(null, "please enter time in this format HH:MM" );
        
        if(jCheckBox1.isSelected() && jCheckBox2.isSelected())
        {
        
          String sql = "UPDATE APPOINTMENT SET Date=?, Time=? WHERE Apptid=?";

	 PreparedStatement statement2 = connection.prepareStatement(sql);
	 statement2.setString(1, jTextField2.getText());
         statement2.setString(2, jTextField3.getText()+":00");
	 statement2.setString(3, jTextField1.getText());

	int rowUpdated = statement2.executeUpdate(); 
	if (rowUpdated>0) 
        { System.out.println("An existing Appointment's Date and Time was updated successfully");
          JOptionPane.showMessageDialog(null, "An existing Appointment's Date and Time was updated successfully");
        }
        else
          JOptionPane.showMessageDialog(null, "Operation is unsuccessful!");
     } 

       else if(jCheckBox1.isSelected())
       {
        
        String sql = "UPDATE APPOINTMENT SET Date=? WHERE Apptid=?";

	PreparedStatement statement2 = connection.prepareStatement(sql);
	statement2.setString(1, jTextField2.getText());
	statement2.setString(2, jTextField1.getText());

	int rowUpdated = statement2.executeUpdate(); 
	if (rowUpdated>0) 
        { System.out.println("An existing Appointment's Date was updated successfully");
         JOptionPane.showMessageDialog(null, "An existing Appointment's Date was updated successfully");
        }
        else
          JOptionPane.showMessageDialog(null, "Operation is unsuccessful!");
    } 
       else if(jCheckBox2.isSelected())
       {
        
        String sql = "UPDATE APPOINTMENT SET Time=? WHERE Apptid=?";

	PreparedStatement statement2 = connection.prepareStatement(sql);
	statement2.setString(1, jTextField3.getText()+":00");
	statement2.setString(2, jTextField1.getText());

	int rowUpdated = statement2.executeUpdate(); 
	if (rowUpdated>0) 
        { System.out.println("An existing Appointment's Time was updated successfully");
         JOptionPane.showMessageDialog(null, "An existing Appointment's Time was updated successfully");
   
        }
        else
          JOptionPane.showMessageDialog(null, "Operation is unsuccessful!");
       } 


}
catch (java.sql.DataTruncation e)
    {
       JOptionPane.showMessageDialog(null, "invalid date or time");
    }
catch (NumberFormatException e)
        {  JOptionPane.showMessageDialog(null, "invalid id, please enter a 5 digit number");

        }
catch (Exception e)
{  
    JOptionPane.showMessageDialog(null, e.toString());          
}
 

     }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1PropertyChange

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
