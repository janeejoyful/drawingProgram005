// Project20astv100.java
// Janee Yeak
// 20 May 2021

// This program creates a colourful square fractal using 2D graphics. Since the 2D graphics 
// class extends the Graphics class, all of the methods I used are from the superclass. 
// For this version I rounded all my rectangle's corners, and added a wavy background. I think
// This could be used for a flag or blanket or something like that.


package Project20astv100;

import java.awt.*;
import javax.swing.*;

public class Project20astv100 
{
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createPicture(); 
         }
      });
   }

   public static void createPicture() 
   {
      JFrame myFrame = new JFrame("The Colourful Square Fractal");
      myFrame.setSize(1000, 800);
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Display myPanel = new Display();
      myFrame.add(myPanel);
      myFrame.setVisible(true);
   }
}
