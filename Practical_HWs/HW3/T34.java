
import java.util.*;

public class T34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Triangle 1");
        System.out.print("x : ");
        double x1 = input.nextDouble();
        System.out.print("y : ");
        double y1 = input.nextDouble();
        System.out.print("z : ");
        double z1 = input.nextDouble();
        Triangle triangle1 = new Triangle(x1, y1, z1);

        System.out.println("\nTriangle 2");
        System.out.print("x : ");
        double x2 = input.nextDouble();
        System.out.print("y : ");
        double y2 = input.nextDouble();
        System.out.print("z : ");
        double z2 = input.nextDouble();
        Triangle triangle2 = new Triangle(x2, y2, z2);

        System.out.println("\nSquare :");
        System.out.print("x : ");
        double x3 = input.nextDouble();
        Square square = new Square(x3);

        System.out.println("Circle :");
        System.out.print("r : ");
        double r = input.nextDouble();
        Circle circle = new Circle(r);

        System.out.println("\nRectangle :");
        System.out.print("x : ");
        double x4 = input.nextDouble();
        System.out.print("y : ");
        double y3 = input.nextDouble();
        Rectangle rectangle = new Rectangle(x4,y3);
        
        System.out.print("Area :");
        System.out.println(triangle1.Area());

        System.out.print("IsEqual :");
        System.out.println(triangle1.IsEqual(triangle2));

        System.out.print("Type :");
        System.out.println(triangle1.GetType());

        System.out.print("is IsoscelesType :");
        System.out.println(triangle1.IsIsosceles());

    }

}

public class Triangle {

    public enum TriType {
        // motesaviol azla
        Equilateral,
        // motesaviol saqeyn
        Isosceles,
        // age har kodom az 2 taaye bala nabaashe, pas ye mosalase mamoliye.
        Regular
    };

    //zel haaye mosalas
    public double x;
    public double y;
    public double z;

    public TriType Type;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        if (((x + y) > z && (x + z) > y && (z + y) > x) == false) {
            this.Type = null;
        } //bar resiye motesaviol azla bodan
        else if (x == y && y == z) {
            this.Type = TriType.Equilateral;
        } //bar resiye motesaviol saqeyn bodan
        else if ((x == y && y != z)
                || (x == z && z != y)
                || (y == z && z != x)) {
            this.Type = TriType.Isosceles;
        } //mosalase mamoli 
        else {
            this.Type = TriType.Regular;
        }

    }

    public Triangle() {
        this(1, 1, 1);
    }

    //noe mosalas
    public TriType GetType() {
        return this.Type;
    }

    public void SetX(double x) {
        this.x = x;
    }

    public void SetY(double y) {
        this.y = y;
    }

    public void SetZ(double z) {
        this.z = z;
    }

    public double GetX() {
        return this.x;
    }

    public double GetY() {
        return this.y;
    }

    public double GetZ() {
        return this.z;
    }

    //masaahat
    public double Area() {
        if (this.Type == null) {
            return 0;
        }
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    //moohit
    public double Perimeter() {
        if (this.Type == null) {
            return 0;
        }
        return x + y + z;
    }

    //bar resiye shekle 2 mosalas 
    public boolean IsEqual(Triangle other) {
        return this.Type == other.Type;
    }

    //motesaviol saqeyn hast ?
    public boolean IsIsosceles() {
        return this.Type == TriType.Isosceles;
    }

    //motesaviol azla hast ?
    public boolean IsEquilateral() {
        return this.Type == TriType.Equilateral;
    }
}

public class Square {

    //zel moraba
    public double x;

    public Square(double x) {
        this.x = x;
    }

    public Square() {
        this(1);
    }

    public void SetSide(double side) {
        this.x = side;
    }

    public double GetSide() {
        return this.x;
    }

    //masaahat
    public double Area() {
        return x * x;
    }

    //mohit
    public double Perimeter() {
        return 4 * x;
    }

    //qotr
    public double Diagonal() {
        return Math.sqrt(2) * x;
    }
}

public class Circle {

    //shoaa
    public double r;

    private final double PI = 3.141592;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
        this(1);
    }

    public void SetRadius(double radius) {
        this.r = radius;
    }

    public double GetRadius() {
        return this.r;
    }

    //masaahat
    public double Area() {
        return PI * r * r;
    }

    //moohit
    public double Perimeter() {
        return 2 * PI * r;
    }
}

public class Rectangle {

    public enum RectType {
        Rectangle,
        Square
    };

    //zele mostatil
    public double x;
    public double y;

    public RectType Type;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;

        //moraba bodan
        if (x == y) {
            this.Type = RectType.Square;
        } //mostatil bodan
        else {
            this.Type = RectType.Rectangle;
        }
    }

    //noe mostatil
    public Rectangle() {
        this(1, 1);
    }

    public RectType GetType() {
        return this.Type;
    }

    public void SetX(double x) {
        this.x = x;
    }

    public void SetY(double y) {
        this.y = y;
    }

    public double GetX() {
        return this.x;
    }

    public double GetY() {
        return this.y;
    }

    //masaahat
    public double Area() {
        return x * y;
    }

    //moohit
    public double Perimeter() {
        return 2 * x + 2 * y;
    }

    //shekle 2 mostatil 
    public boolean IsEqual(Rectangle other) {
        return this.Type == other.Type;
    }
}
