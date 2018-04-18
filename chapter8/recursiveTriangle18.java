import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    
    private int[] tempX;
    private int[] tempY;

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

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public int midX(int x1, int x2)
   {
        return ((x1+x2)/2);
    }
    
   public int midY(int y1, int y2)
   {
       return ((y1+y2)/2);
    }
   
   public int distance(int x1, int x2, int y1, int y2)
   {
       return Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
    
   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
       
       int d = distance(xPos[0],xPos[1],yPos[0],yPos[1]);

        //if the segment/distance is 30 or so, good length to stop
        //{
            //find the mid points of each line segment
       if (d < 30)
       {
           return;
        }

            //make the x and y array (3 points + first point to finish triangle)
       
            tempX = {

            //draw the Triangle
            //page.drawPolyline (xNew, yNew, xNew.length);

            //create x,y Array using the midpoints you calculated
            //example




            // Recursive calls for each section of triangle



        //}



   }//end of Triangle
}
