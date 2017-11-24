package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1{
   public static void main(String[] args) {
      JFrame a = new JFrame();
      a.setBounds(100, 200, 300, 300);
      
      JButton b = new JButton("Å¬¸¯");
      a.add(b);
      
      b.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new Test2(a.getLocation());
            a.setVisible(false);
         }
      });
      
      a.add(b);
      
      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      a.setVisible(true);
   }
}