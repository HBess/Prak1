import java.awt.*;
import javax.swing.*;


public class SegmentComp3 extends JComponent
{
    private int s1, s2, s3, s4, s5, s6, s7;
        
    public SegmentComp3 () 
    {
        setNumber (0); 
    }
    
    public void setNumber (int n)
    {
        if (n == 0)
            setSegments (1, 1, 1, 1, 1, 1, 0);
        if (n == 1)
            setSegments (0, 1, 1, 0, 0, 0, 0);
        if (n == 2)
            setSegments (1, 1, 0, 1, 1, 0, 1);    
        if (n == 3)
            setSegments (1, 1, 1, 1, 0, 0, 1);    
        if (n == 4)
            setSegments (0, 1, 1, 0, 0, 1, 1);    
        if (n == 5)
            setSegments (1, 0, 1, 1, 0, 1, 1);    
        if (n == 6)
            setSegments (1, 0, 1, 1, 1, 1, 1);    
        if (n == 7)
            setSegments (1, 1, 1, 0, 0, 0, 0);    
        if (n == 8)
            setSegments (1, 1, 1, 1, 1, 1, 1);    
        if (n == 9)
            setSegments (1, 1, 1, 1, 0, 1, 1);    
        
        repaint ();
    }
    
    public void setSegments (int a1, int a2, int a3, int a4, int a5, int a6, int a7)
    {
        s1 = a1;
        s2 = a2;
        s3 = a3;
        s4 = a4;
        s5 = a5;
        s6 = a6;
        s7 = a7;
    }
    
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        
        int w = getWidth ();
        int h = getHeight ();
        
        /* Alte Version:
        int min = Math.min (w, h/2);
        int d = min * 7 / 10;
        int e = min * 3 / 20;
        int x = 6;                     
        */
        
        // Festlegen: e = d / 4
        // Breite = 2*e + d = 1.5 * d <= w
        // Höhe = 2*e + 2*d = 2.5 * d <= h
        // => d <= w / 1.5 = w*2/3
        //    d <= h / 2.5 = h*2/5
        // => d = minimum (w*2/3, h*2/5)
        int d = Math.min (w*2/3, h*2/5);
        int e = d / 4;
        int x = 6;
        
        g2.setStroke (new BasicStroke (x));
        
        if (s1 == 1)
            g2.drawLine (e+x, e, e+d-x, e);
        if (s2 == 1)
            g2.drawLine (e+d, e+x, e+d, e+d-x);
        if (s3 == 1)
            g2.drawLine (e+d, e+d+x, e+d, e+d+d-x);
        if (s4 == 1)
            g2.drawLine (e+x, e+d+d, e+d-x, e+d+d);
        if (s5 == 1)
            g2.drawLine (e, e+d+x, e, e+d+d-x);
        if (s6 == 1)
            g2.drawLine (e, e+x, e, e+d-x);
        if (s7 == 1)
            g2.drawLine (e+x, e+d, e+d-x, e+d);
    }
    
}

