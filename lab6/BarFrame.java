import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class graphing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarFrame extends JPanel
{
    public int bars;
    public ArrayList fields;
    public static JFrame window = new JFrame();

    public BarFrame(int bars, ArrayList fields){
        this.bars = bars;
        this.fields = fields;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //System.out.println(bars);
        int x = 0;
        int y = 0;
        int value;
        int heights = height/(bars+1);
        for(int i = 0; i < bars; i++){
            value = Integer.valueOf((String)fields.get(i));
            g.setColor(Color.RED);
            g.fillRect(x,y,value,heights);
            
            
            //System.out.println(y);
            y += heights;
        }
    }

    public  void draw() {
        window.getContentPane().add(new BarFrame(bars, fields));
        window.setVisible(true);
    }
    
    public static final int width = 600;
    public static final int height = 600;    
}

