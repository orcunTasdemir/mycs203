import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    

    
    public Rectangle(){
        
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw method");
    }
}
