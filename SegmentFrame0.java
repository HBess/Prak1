import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SegmentFrame0 extends JFrame implements ActionListener
{
    private SegmentComp0 sc;
    private JTextField tf;
    
    public SegmentFrame0 ()
    {
        sc = new SegmentComp0 ();
        tf = new JTextField ();
        tf.addActionListener (this);
        
        setLayout (new BorderLayout ());
        add (sc, BorderLayout.CENTER);
        add (tf, BorderLayout.SOUTH);
        
        setTitle ("7-Segment-Anzeige");
        setSize (200, 400);
        setVisible (true);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed (ActionEvent e)
    {
        String text = tf.getText ();
        int n = Integer.parseInt (text);
        sc.setNumber (n);
    }
    
    public static void main (String [] args) 
    {
        new SegmentFrame0 ();      
    }
}

