import java.util.*;
public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      Shape cloned1 = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + cloned1.getType());		

      Shape cloned2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + cloned2.getType());		

      Shape cloned3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + cloned3.getType());		
   }
}