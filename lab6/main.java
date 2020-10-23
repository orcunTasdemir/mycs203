import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener; 
import java.util.ArrayList;

/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(int[] args){

        TextFrame textFrames = new TextFrame(args[0]);
        // System.out.println(textFrames.tfs[0].getText());
        // System.out.println(textFrames.tfs.length);
        DataModel data = new DataModel(textFrames.tfs);

        BarFrame barFrame = new BarFrame(args[0], data.data);
        barFrame.draw();
        barFrame.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        barFrame.window.setBounds(30, 30, BarFrame.width, BarFrame.height);

        barFrame.window.getContentPane()
        .add(new BarFrame(args[0], data.data));

        barFrame.window.setVisible(true);

        // ArrayList<String> previousData = data.data;
        // final int DELAY = 5000;
        // // Milliseconds between timer ticks
        // Timer t = new Timer(DELAY, new
        // ActionListener()
        // {
        // public void actionPerformed(ActionEvent event)
        // {
        // DataModel data = new DataModel(textFrames.tfs);
        // BarFrame barFrame = new BarFrame(args[0], data.data);
        // barFrame.draw();
        // }

        // });
        // t.start();
        textFrames.btn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    DataModel data = new DataModel(textFrames.tfs);
                    BarFrame barFrame = new BarFrame(args[0], data.data);
                    barFrame.draw();
                }
            });
        
        }}
