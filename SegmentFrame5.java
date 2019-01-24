import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SegmentFrame5 extends JFrame implements ActionListener
{
    private SegmentComp5 [] sc;
    private JTextField tf;
    
    public SegmentFrame5 (int anz)
    { 
        sc = new SegmentComp5 [anz];
        for (int i = 0; i < anz; i++)
        {
            sc [i] = new SegmentComp5 ();
        }
        
        JPanel psc = new JPanel ();
        psc.setLayout (new GridLayout (1, anz));
        for (int i = anz-1; i >= 0; i--)
        {
            psc.add (sc [i]);
        }
           
        tf = new JTextField ();
        tf.addActionListener (this);
        
        setLayout (new BorderLayout ());
        add (psc, BorderLayout.CENTER);
        add (tf, BorderLayout.SOUTH);
        
        setTitle ("7-Segment-Anzeige");
        setSize (1100, 300);
        setVisible (true);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed (ActionEvent e)
    {
        String text = tf.getText ();
        int n = Integer.parseInt (text);
        
        for (int i = 0; i < sc.length; i++)
        {
            sc [i].setNumber (n % 10);
            n = n / 10;
        }
    }
    
    public static void main (String [] args) 
    {
        new SegmentFrame5 (10);      
    }
}

