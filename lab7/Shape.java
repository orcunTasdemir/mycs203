import java.awt.*;
import java.lang.reflect.Field;

/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape implements Cloneable
{
    public String id;
    public String type;

    /**
    Draws the shape.
    @param g2 the graphics context
     */
    abstract void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public String getType(){
        return type;
    };

    public String getid(){
        return id;
    };

    public void setid(String id){
        this.id = id;
    };

}
