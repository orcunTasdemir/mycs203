import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main extends JButton
{
    public static void main (String[] args){

        JFrame fr = new JFrame();

        JButton zoomin = new JButton("Zoom in!");
        JButton zoomout = new JButton("Zoom out!");

        CarIcon car = new CarIcon(100, 100);

        fr.setPreferredSize(new Dimension(800, 800));

        final JLabel label = new JLabel(car);
        
        label.setPreferredSize(new Dimension(200, 200));
        fr.setLayout(new FlowLayout());

        //adds
        fr.add(label);
        fr.add(zoomin);
        fr.add(zoomout);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);    

        zoomin.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    car.width += car.width*0.1;
                    car.height += car.height*0.1;
                    label.repaint();
                    System.out.println("button in");
                }
            });
        zoomout.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    car.width -= car.width*0.1;
                    car.height -= car.height*0.1;
                    label.repaint();
                }
            });
    }
}