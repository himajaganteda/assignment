class Shapes{

    public double area(){
         return 0;
    }
}

class Triangle extends Shapes{
   private double base;
   private double height;
   public Triangle(double base, double height){
       this.base = base;
       this.height = height;
   }
   @Override
   public double area(){
       return 0.5*base*height;
   }
}

class Circle extends Shapes{
    private double radius;
    public Circle(double radius){
        this.radius =radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shapes{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return length*width;
    }
}

public class ShapesArea{
    public static void main(String[] args){
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL.NO: AV.SC.U4CSE24111\n");

        Shapes tri = new Triangle(7,4);
        Shapes cir = new Circle(1);
        Shapes rec = new Rectangle(4,6);
  
        System.out.println("Area of Triangle: " + tri.area());
        System.out.println("Area of Circle: " + cir.area());
        System.out.println("Area of Rectangle: " + rec.area());
    }
}
        