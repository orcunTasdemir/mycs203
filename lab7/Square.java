import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    
    
    

    public Square(){
        
        type = "square";
    }

    @Override
    public void draw() {
        System.out.println("Square draw method");
    }

   
}

