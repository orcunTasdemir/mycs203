import java.util.*;

public class ShapeCache {
	
   private static Hashtable<String, Shape> Map  = new Hashtable<String, Shape>();

   public static Shape getShape(String shapeId) {
      Shape cachedShape = Map.get(shapeId);
      return (Shape) cachedShape.clone();
   }

   
   public static void loadCache() {
      Circle circle = new Circle();
      circle.setid("1");
      Map.put(circle.getid(),circle);

      Square square = new Square();
      square.setid("2");
      Map.put(square.getid(),square);

      Rectangle rectangle = new Rectangle();
      rectangle.setid("3");
      Map.put(rectangle.getid(), rectangle);
   }
}