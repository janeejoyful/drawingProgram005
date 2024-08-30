// Display.java
// This is for my Project20astv100.java 
// Janee Yeak
// 20 May 2021

package Project20astv100;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

class Display extends JPanel
{   
   public Display() // Constructor
   {
      setLayout(null); 
   } 

   public void paintComponent(Graphics g) 
   {
      super.paintComponent(g); 
      Graphics2D g2d = (Graphics2D)g;
      
      g2d.setColor(Color.white);
      g2d.fillRect(0, 0, 1000, 800); 
      
      drawCurves(g2d);
      
		drawSquare1(g2d,1000,650, 5, 7357, 7357); // 7357 is just TEST. 
      

   }

	private void drawSquare1(Graphics2D g2D, int maxX, int maxY, int rand, int wid, int hei)
	{    
      int startWidth = maxX/4;
      
      if (startWidth > 1 && wid > 1 && hei > 1)
      {  
         if(rand == 5)
         {
            int midX = maxX/2;
		      int midY = maxY/2;
		      int startHeight = maxY/4;
            int halfSHeight = startHeight/2;
            int halfSWidth = startWidth/2;
		      int tlX = midX - (startWidth/2);
		      int tlY = midY - (startHeight/2);
            
            g2D.setColor(new Color(255, 193, 217)); 
            g2D.fill(new RoundRectangle2D.Double(tlX, tlY, startWidth, startHeight, 10, 10)); // First main rect
            
            g2D.setColor(new Color(255, 90, 170)); 
            g2D.fill(new RoundRectangle2D.Double(tlX-halfSWidth, tlY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top left
            
            g2D.setColor(new Color(255, 125, 185));
            g2D.fill(new RoundRectangle2D.Double(tlX-halfSWidth, tlY+startHeight, halfSWidth, halfSHeight, 10, 10)); // bottom left
            
            g2D.setColor(new Color(255, 216, 234));
            g2D.fill(new RoundRectangle2D.Double(tlX+startWidth, tlY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top right
            
            g2D.setColor(new Color(255, 34, 136));   
            g2D.fill(new RoundRectangle2D.Double(tlX+startWidth, tlY+startHeight, halfSWidth, halfSHeight, 10, 10));  // bottom right
            
            drawSquare1(g2D, tlX-halfSWidth, tlY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g2D, tlX-halfSWidth, tlY+startHeight, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g2D, tlX+startWidth, tlY-halfSHeight, 2, halfSWidth, halfSHeight); // top right
            drawSquare1(g2D, tlX+startWidth, tlY+startHeight, 1, halfSWidth, halfSHeight); // bottom right.
  
         }
         else if(rand == 4)  // DRAWING TOP LEFT SQUARE'S OTHER SQUARES, RAND == 4
         {
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g2D.setColor(new Color(255, 34, 136)); 
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top left
            
            g2D.setColor(new Color(255, 216, 234));
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight, 10, 10)); // bottom left
            
            g2D.setColor(new Color(255, 125, 185)); 
            g2D.fill(new RoundRectangle2D.Double(maxX+wid, maxY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top right 
            
            drawSquare1(g2D, maxX-halfSWidth, maxY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g2D, maxX-halfSWidth, maxY+hei, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g2D, maxX+wid, maxY-halfSHeight, 2, halfSWidth, halfSHeight); // top right           
         }
         else if (rand == 3) // DRAWING BOTTOM LEFT SQUARE'S OTHER SQUARES, RAND == 3
         {
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g2D.setColor(new Color(255, 34, 136));
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY-halfSHeight, halfSWidth, halfSHeight, 10, 10));  // top left
            
            g2D.setColor(new Color(255, 216, 234));
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight, 10, 10));  // bottom left
            
            g2D.setColor(new Color(255, 90, 170));
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight, 10, 10));  // bottom right
            
            drawSquare1(g2D, maxX-halfSWidth, maxY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g2D, maxX-halfSWidth, maxY+hei, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g2D, maxX+wid, maxY+hei, 1, halfSWidth, halfSHeight); // bottom right.
         }
         else if (rand == 2)// DRAWING TOP RIGHT SQUARE'S OTHER SQUARES, RAND == 2
         {            
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g2D.setColor(new Color(255, 34, 136)); 
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top left
            
            g2D.setColor(new Color(255, 125, 185)); 
            g2D.fill(new RoundRectangle2D.Double(maxX+wid, maxY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top right 
            
            g2D.setColor(new Color(255, 90, 170));
            g2D.fill(new RoundRectangle2D.Double(maxX+wid, maxY+hei, halfSWidth, halfSHeight, 10, 10)); // bottom right
           
            drawSquare1(g2D, maxX-halfSWidth, maxY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g2D, maxX+wid, maxY-halfSHeight, 2, halfSWidth, halfSHeight); // top right  
            drawSquare1(g2D, maxX+wid, maxY+hei, 1, halfSWidth, halfSHeight); // bottom right.
         }
         else if(rand == 1) // DRAWING BOTTOM RIGHT SQUARE'S OTHER SQUARES, RAND == 1
         {
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g2D.setColor(new Color(255, 216, 234)); 
            g2D.fill(new RoundRectangle2D.Double(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight, 10, 10)); // bottom left
            
            g2D.setColor(new Color(255, 125, 185)); 
            g2D.fill(new RoundRectangle2D.Double(maxX+wid, maxY-halfSHeight, halfSWidth, halfSHeight, 10, 10)); // top right 
            
            g2D.setColor(new Color(255, 90, 170)); 
            g2D.fill(new RoundRectangle2D.Double(maxX+wid, maxY+hei, halfSWidth, halfSHeight, 10, 10)); // bottom right
            
            drawSquare1(g2D, maxX-halfSWidth, maxY+hei, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g2D, maxX+wid, maxY-halfSHeight, 2, halfSWidth, halfSHeight); // top right  
            drawSquare1(g2D, maxX+wid, maxY+hei, 1, halfSWidth, halfSHeight); // bottom right.

         }        

      }
	}
   
   private void drawCurves (Graphics2D g2d)
   {
      g2d.setColor(Color.black);
      
      int x1 = 0;
      int y1 = 0;
      int x2 = 1000;
      int y2 = 600; 
      int ctrlx1 = 100; 
      int ctrly1 = 400;
      int ctrlx2 = 400; 
      int ctrly2 = 150;
      int a = 0;
      
      for (int i = 0; i < 55; i++)
      {
         if (a % 2 == 0)
            g2d.setColor(new Color(173, 117, 231));
         else if (a % 3 == 0)
            g2d.setColor(new Color(78, 164, 245));
         else 
            g2d.setColor(new Color(95, 63, 255));
            
         CubicCurve2D cc = new CubicCurve2D.Double();
      
         cc.setCurve(x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2);
         g2d.draw(cc);
      
         y1 += 15;
         y2 += 15;
         ctrly1 += 15;
         ctrly2 += 15;
         
         a++;
      }
      
      y1 = 0;
      y2 = 600;  
      ctrly1 = 400;
      ctrly2 = 150;
      
      for (int i = 0; i < 55; i++)
      {
         if (a % 2 == 0)
            g2d.setColor(new Color(173, 117, 231));
         else if (a % 3 == 0)
            g2d.setColor(new Color(78, 164, 245));
         else 
            g2d.setColor(new Color(95, 63, 255));
         
         CubicCurve2D cc = new CubicCurve2D.Double();

         cc.setCurve(x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2);
         g2d.draw(cc);
      
         y1 -= 15;
         y2 -= 15;
         ctrly1 -= 15;
         ctrly2 -= 15;
         
         a++;
   
      }

   }


}


