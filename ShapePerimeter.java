interface Shape {
    public double getPerimeter();
}

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle implements Shape {
    double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 3 * side;
    }
}

public class ShapePerimeter {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        Shape rec = new Rectangle(3, 6);
        Shape cir = new Circle(7);
        Shape tri = new Triangle(2);

        System.out.println("Perimeter of Rectangle: " + rec.getPerimeter());
        System.out.println("Perimeter of Circle: " + cir.getPerimeter());
        System.out.println("Perimeter of Triangle: " + tri.getPerimeter());
    }
}
