import java.awt.*;
import java.awt.geom.*;
import java.util.*;

/**
A car that can be moved around.
 */
public class AirplaneShape implements MoveableShape
{
    /**
    Constructs a car item.
    @param x the left of the bounding rectangle
    @param y the top of the bounding rectangle
    @param width the width of the bounding rectangle
     */
    public AirplaneShape(int x, int y, int width)
    {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body
        = new Rectangle2D.Double(x, y + width / 6, 
                width - 1, width / 6);
        // Ellipse2D.Double frontTire
        // = new Ellipse2D.Double(x + width / 6, y + width / 3, 
        // width / 6, width / 6);
        // Ellipse2D.Double rearTire
        // = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,
        // width / 6, width / 6);

        // The upper wing
        Point2D.Double r1
        = new Point2D.Double(x + width / 3, y + width / 6);
        Point2D.Double r2
        = new Point2D.Double(x + width / 3, y );     
        Point2D.Double r3
        = new Point2D.Double(x + width * 5 / 6, y + width / 6);

        Line2D.Double wingbase
        = new Line2D.Double(r1, r2);
        Line2D.Double wingtip 
        = new Line2D.Double(r2, r3);

        //The lower wing
        Point2D.Double r4
        = new Point2D.Double(x + width / 3, y + width/3 );
        Point2D.Double r5
        = new Point2D.Double(x + width / 3, y + width/2 );     
        Point2D.Double r6
        = new Point2D.Double(x + width * 5 / 6, y + width/3 );

        Line2D.Double wingbase2
        = new Line2D.Double(r4, r5);
        Line2D.Double wingtip2
        = new Line2D.Double(r5, r6);
        
        //Tip of the plane
        Point2D.Double r7
        = new Point2D.Double(x + width, y + width/3 );
        Point2D.Double r8
        = new Point2D.Double(x + width, y + width/6 );     
        Point2D.Double r9
        = new Point2D.Double(x + width + 20, y + width/ 4);
        
        Line2D.Double tipbase1
        = new Line2D.Double(r7, r8);
        Line2D.Double tip
        = new Line2D.Double(r8, r9);
        Line2D.Double tipbase2
        = new Line2D.Double(r7, r9);
        
        g2.draw(body);
        g2.draw(tipbase1);
        g2.draw(tipbase2);
        g2.draw(tip);
        g2.draw(wingbase);
        g2.draw(wingtip);
        g2.draw(wingbase2);
        g2.draw(wingtip2);

    }

    private int x;
    private int y;
    private int width;
}
