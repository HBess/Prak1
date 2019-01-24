import java.awt.*;
import javax.swing.*;


public class SegmentComp1 extends JComponent
{
    private int num;
        
    public SegmentComp1 () 
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
        int d = min * 7 / 10;
        int e = min * 3 / 20;
                             
        g2.setStroke (new BasicStroke (5));
        
        if (num == 0)
        {
            g2.drawLine (e, e, e+d, e);
            g2.drawLine (e, e, e, e+d);
            g2.drawLine (e, e+d, e, e+d+d);
            g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e, e+d, e+d+d);
            //g2.drawLine (e, e+d, e+d, e+d);
        }
        
        if (num == 1)
        {
            //g2.drawLine (e, e, e+d, e);
            //g2.drawLine (e, e, e, e+d);
            //g2.drawLine (e, e+d, e, e+d+d);
            //g2.drawLine (e, e+d+d, e+d, e+d+d);
            g2.drawLine (e+d, e, e+d, e+d);
            g2.drawLine (e+d, e, e+d, e+d+d);
            //g2.drawLine (e, e+d, e+d, e+d);
        }
    }
    
}

