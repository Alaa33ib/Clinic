import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITest extends JFrame implements ActionListener //first page
{
   GUILogin l2;
   GUILogin2 l1;
   JButton button, button2;
   public GUITest()
   {
   this.setTitle("Clinic Management System");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setSize(550,250);
   this.setLayout(null);
   this.setVisible(true);
   this.setLocationRelativeTo(null);
   this.setResizable(false);
   JLabel label = new JLabel();
   label.setText("Welcome to the Clinic!");
   label.setFont(new Font("Segoe UI", Font.BOLD, 18));
   label.setForeground(new Color(0,0,0));
   label.setHorizontalAlignment(JLabel.CENTER);
   label.setVerticalAlignment(JLabel.TOP);
   label.setBounds(50, 5, 400, 400);
   
   JLabel label2 = new JLabel();
   label2.setText("Are You a Doctor or Receptionist?");
   label2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
   label2.setForeground(new Color(0,0,0));
   label2.setHorizontalAlignment(JLabel.CENTER);
   label2.setVerticalAlignment(JLabel.TOP);
   label2.setBounds(50, 50, 400, 400);
  

   button = new JButton();
   button.setBounds(90, 100, 150, 50);
   button.setText("Doctor");
   button.setFont(new Font("Calibri", Font.PLAIN, 15));
   button.addActionListener(this);
   
   button2 = new JButton();
   button2.setBounds(300, 100, 150, 50);
   button2.setText("Receptionist");
   button2.setFont(new Font("Calibri", Font.PLAIN, 15));
   button2.addActionListener(this);

   this.add(label);
   this.add(label2);
   this.add(button); 
   this.add(button2);
   
   }

   public void actionPerformed(ActionEvent e)
   { 
       if (e.getSource() == button)
       {
         l1 = new GUILogin2();
         this.setVisible(false);
       }
     else if (e.getSource() == button2)
     {
        l2 = new GUILogin();
        this.setVisible(false);
     }
   } 
        
    
}