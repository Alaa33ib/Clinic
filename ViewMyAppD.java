import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewMyAppD extends javax.swing.JFrame {

    
    public ViewMyAppD() {
        initComponents();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel1.setText("My Appointments");

        jButton4.setText("View Appointment(s) with Date (YYYY-MM-DD)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(237, 237, 237))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DoctorPage r = new DoctorPage();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTable1.setModel(new DefaultTableModel());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM appointment WHERE Date =" + "'"+ jTextField2.getText()+ "'"+ " AND Doc_ID=" +GUILogin2.id;
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            
            colN[0] = "Appointment ID";
            colN[1] = "Time";
            colN[2] = "Date";
            colN[3] = "Patient ID";
            colN[4] = "Doctor ID";
            
            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            boolean flag = false;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);
                    flag = true;
                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }
            if(!flag)
             JOptionPane.showMessageDialog(null, "No appointments with this date!");   
            jTextField2.setText("");
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setModel(new DefaultTableModel());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM appointment WHERE Doc_ID=" +GUILogin2.id;
            ResultSet r = statement.executeQuery( sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "Appointment ID";
            colN[1] = "Time";
            colN[2] = "Date";
            colN[3] = "Patient ID";
            colN[4] = "Doctor ID";

            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);

                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }

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

            String sql = "SELECT * FROM appointment WHERE Time ="+ "'" + jTextField3.getText() + ":00" + "'"+ " AND Doc_ID=" +GUILogin2.id;
            ResultSet r = statement.executeQuery(sql);
            ResultSetMetaData rm =  r.getMetaData();
            DefaultTableModel t = (DefaultTableModel)jTable1.getModel();
            int cols = rm.getColumnCount();
            String [] colN = new String[cols];
            colN[0] = "Appointment ID";
            colN[1] = "Time";
            colN[2] = "Date";
            colN[3] = "Patient ID";
            colN[4] = "Doctor ID";

            t.setColumnIdentifiers(colN);
            String id, time, date, id2, id3;
            while(r.next()){
                id = r.getString(1);
                time = r.getString(2);
                date = r.getString(3);
                id2 = r.getString(4);
                id3 = r.getString(5);

                String [] row = {id, time, date, id2, id3};
                t.addRow(row);
            }
            jTextField3.setText("");
            connection.close();
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, e.toString());}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton5ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
