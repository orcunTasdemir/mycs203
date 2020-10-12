import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class MugTester here.
 *
 * @author Orcun Tasdemir
 * @version 1.0
 */
public class MugTester
{
    public static void main(String[] args){

        JFrame fr = new JFrame();
        
        Mug mug = new Mug(100, 100);
        
        fr.setPreferredSize(new Dimension(500, 500));
        final JLabel label = new JLabel(mug);
        fr.setLayout(new FlowLayout());
        fr.add(label);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }   
}
