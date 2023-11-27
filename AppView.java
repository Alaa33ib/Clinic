import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class AppView extends javax.swing.JFrame {

    public AppView() {
        initComponents();
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("View Appointment(s) with Date (YYYY-MM-DD)");
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

        jButton1.setText("View All Appointments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("View Appointment(s) with Time (HH:MM)");
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

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Receptionist View");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Appointment with ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addGap(170, 170, 170)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTable1.setModel(new DefaultTableModel());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();
            if((jTextField2.getText().length()!=10)||(jTextField2.getText().charAt(4)!='-')||(jTextField2.getText().charAt(7)!='-')) JOptionPane.showMessageDialog(null, "please enter date in this format YYYY-MM-DD" );


            String sql = "SELECT * FROM appointment WHERE Date =" + "'"+ jTextField2.getText()+ "'";
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
           String [] colN = new String[cols];
            colN[0] = "Appointment id";
            colN[1] = "Appointment time";
            colN[2] = "Appointment date";
            colN[3] = "Patient's id";
            colN[4] = "Doctor's id";

            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            boolean exist = false;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);
                exist = true;
                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }
            if(!exist)
                JOptionPane.showMessageDialog(null, "Appointment not found");
             jTextField2.setText("");
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());

        }
        catch ( e)
    {
       JOptionPane.showMessageDialog(null, "invalid date ");
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      jTable1.setModel(new DefaultTableModel());  
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM appointment";
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "Appointment id";
            colN[1] = "Appointment time";
            colN[2] = "Appointment date";
            colN[3] = "Patient's id";
            colN[4] = "Doctor's id";

            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            boolean exist = false;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);
                exist = true;
                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }
            if(!exist)
                JOptionPane.showMessageDialog(null, "Appointment not found");

            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTable1.setModel(new DefaultTableModel());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();
            if((jTextField3.getText().length()!=5)||(jTextField3.getText().charAt(2)!=':')) JOptionPane.showMessageDialog(null, "please enter time in this format HH:MM" );


            String sql = "SELECT * FROM appointment WHERE Time ="+ "'" + jTextField3.getText() + ":00" + "'";
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "Appointment id";
            colN[1] = "Appointment time";
            colN[2] = "Appointment date";
            colN[3] = "Patient's id";
            colN[4] = "Doctor's id";

            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            boolean exist = false;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);
                exist = true;
                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }
            if(!exist)
                JOptionPane.showMessageDialog(null, "Appointment not found");
           jTextField3.setText("");
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());}
        catch (MysqlDataTruncation e)
    {
       JOptionPane.showMessageDialog(null, "invalid time");
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            if(jTextField1.getText().length()!=5) JOptionPane.showMessageDialog(null, "invalid id");
            int check = Integer.parseInt(jTextField1.getText());
                

            String sql = "SELECT * FROM appointment WHERE Apptid =" +jTextField1.getText();
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "Appointment id";
            colN[1] = "Appointment time";
            colN[2] = "Appointment date";
            colN[3] = "Patient's id";
            colN[4] = "Doctor's id";

            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            boolean exist = false;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);
                exist = true;
                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }
            if(!exist)
                JOptionPane.showMessageDialog(null, "Appointment not found");
            jTextField1.setText("");
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());
        }
        catch (NumberFormatException e)
        {  JOptionPane.showMessageDialog(null, "invalid id, please enter a 5 digit number");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

 

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
