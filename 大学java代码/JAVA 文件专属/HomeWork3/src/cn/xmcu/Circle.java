package cn.xmcu;

public final class Circle {
   private final double pai;
   {
	   pai=3.14;
   }
   
   public static double getArea(double radius) {
	   Circle circle = new Circle();
	   return circle.pai*radius*radius;
   }
}
