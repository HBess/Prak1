import java.awt.*;
import javax.swing.*;

public class SegmentComp5a extends JComponent
{
    private int num;
        
    public SegmentComp5a () 
    {
    	num = 0;
    }
    
    public void setNumber (int n)
    {
        num = n;
        repaint ();
    }
    
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        
        int w = getWidth ();
        int h = getHeight ();
        
        int min = Math.min (w, h/2);
        int d = min * 8 / 10;
        int e = min * 2 / 20;
                             
        g2.setStroke (new BasicStroke (5));
        
        if (num == 0)
        {
            g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            //g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 1)
        {
            //g2.drawLine (e, e, e+d, e);
            //g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            //g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            //g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 2)
        {
            g2.drawLine (e, e, e+d, e);
            //g2.drawLine (e, e, e, e+d);
            g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            //g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 3)
        {
            g2.drawLine (e, e, e+d, e);
            //g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 4)
        {
            //g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            //g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 5)
        {
            g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            //g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 6)
        {
            g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            //g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 7)
        {
            g2.drawLine (e, e, e+d, e);
            //g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            //g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            //g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 8)
        {
            g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 9)
        {
            g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e+d, e+d, e+d+d);
            g2.drawLine (e, e+d, e+d, e+d);
        }
    }
}
