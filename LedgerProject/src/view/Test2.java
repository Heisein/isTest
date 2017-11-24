package view;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {
   public Test2() {

   }

   public Test2(Point p) {
      JFrame a = new JFrame();

      if (p != null) {
         a.setLocation(p);
         a.setSize(300, 300);
      } else {
         a.setBounds(100, 200, 300, 300);
      }

      JButton b = new JButton("여긴 두번째");
      a.add(b);

      b.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new Test2(a.getLocation());
         }
      });

      a.add(b);

      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      a.setVisible(true);
   }
}