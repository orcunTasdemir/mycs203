import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextFrame
{
    Random rand = new Random();
    JFrame frame;
    final int upperbound = 100;
    final int width = 400;
    final int height = 800;

    public JTextField[] tfs;
    JButton btn;
    public  TextFrame (int numnum){

        frame = new JFrame();       

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(400,800));
        jp.setLayout(new GridLayout(numnum + 1, 0));

        btn = new JButton("Click here to update the graphs");
        tfs = new JTextField[numnum];

        for(int i = 0; i < tfs.length; i++){
            int randInt = rand.nextInt(upperbound);
            tfs[i] = new JTextField(""+ randInt, 10);
            jp.add(tfs[i]);
        } 

        btn.setPreferredSize(new Dimension(40, 40));
        frame.getContentPane().add(jp);

        jp.add(btn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.requestFocus();
    } 
}
