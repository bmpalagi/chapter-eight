//Brad Palagi
//Revursive Triangle

import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;


    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    
    //so [2] is the top point of the triangle, [0] is the bottom right, and [1] is the bottom left

   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.magenta);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint
   
   // finds the midpoint of two points by summing them and dividing by two
   public int midX(int x1, int x2)
   {
        return ((x1+x2)/2);
    }
    
   //I could've just used one midpoint method now that I look at it, but I use this one for only y values
   public int midY(int y1, int y2)
   {
       return ((y1+y2)/2);
    }
   
    //distance formula method used to determine the base case
   public double distance(int x1, int y1, int x2, int y2)
   {
       return Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
   
   //This is the recursive method that will draw all of the triangles
   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points
       double d = distance(xPos[0],yPos[0],xPos[1],yPos[1]);
       
       //Base case; if a triangle leg is less than ten it stops the recursion
       if (d < 9)
       {
           return;
       }
       
       //initial inner triangle points
       int x1 = midX(xPos[0],xPos[1]);
       int x2 = midX(xPos[1],xPos[2]);
       int x3 = midX(xPos[2],xPos[0]);
       
       int y1 = midY(yPos[0],yPos[1]);
       int y2 = midY(yPos[1],yPos[2]);
       int y3 = midY(yPos[2],yPos[0]);
           
       int[] xNew = {x1, x2, x3, x1};
       int[] yNew = {y1, y2, y3, y1};
       
       //draws the initial inner Triangle
       page.drawPolyline (xNew, yNew, xNew.length);
       
       //Top triangle
       int[] xNext = {xPos[2], x3, x2, xPos[2]};
       int[] yNext = {yPos[2], y3, y2, yPos[2]};
       
       Triangle(xNext,yNext,page);
       
       //Right triangle
       int[] xNextt = {x3, xPos[0], x1, x3};
       int[] yNextt = {y3, yPos[0], y1, y3};
       
       Triangle(xNextt,yNextt,page);
       
       //Left Triangle
       int[] xNexttt = {x2, x1, xPos[1], x2};
       int[] yNexttt = {y2, y1, yPos[1], y2};
       
       Triangle(xNexttt,yNexttt,page);
       
   }//end of Triangle
}
