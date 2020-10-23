import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Write a description of class DataModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataModel
{
    public ArrayList<String> data = new ArrayList<>();

    public DataModel(JTextField[] array){
        // System.out.println(array[0].getText() + array[1].getText()
        // + array[2].getText());
        for(int i = 0; i < array.length; i++){    
            data.add(array[i].getText());    
        }
    }   
}
