import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.*;
import java.awt.Graphics2D.*;

/**
 * Write a description of class Mug here.
 *
 * @author Orcun Tasdemir
 * @version 1.0
 */
public class Mug implements Icon
{
       
    public Mug(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getIconWidth()
    {
        return width;
    }

    public int getIconHeight()
    {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y){
        
        int holderWidth = 4;
        int margin = 30;
        int cupholderup = height/8;
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D.Double holder = new Rectangle2D.Double(x + margin,
        y + margin + cupholderup,
        width/4, height/2 - 2*cupholderup);
        
        Rectangle2D.Double holderInside = new Rectangle2D.Double(x + holderWidth + margin,
        y + holderWidth + margin + cupholderup,
        width/4 - 2*holderWidth,
        height/2 - 2*holderWidth - 2*cupholderup);
        
        Rectangle2D.Double mug = new Rectangle2D.Double(x + width/4 + margin,
        y + margin, width/2.6, height/2);
        
        g2.draw(mug);
        g2.draw(holder);
        g2.draw(holderInside);
    }
    private int width;
    private int height;
}