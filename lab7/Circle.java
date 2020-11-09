import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    
    public Circle(){
        
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle draw method");
    }

}
