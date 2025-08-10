
import java.util.*;

public class T33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //gereftan adad
        System.out.print("Enter Real: ");
        double real1 = input.nextDouble();
        System.out.print("Enter imaginary: ");
        double imaginary1 = input.nextDouble();
        Complex com1 = new Complex(real1, imaginary1);

        Complex com2 = new Complex();
        System.out.print("Enter Real 2: ");
        double real2 = input.nextDouble();
        System.out.print("Enter imaginary 2: ");
        double imaginary2 = input.nextDouble();
        com2.SetReal(real2);
        com2.SetImaginary(imaginary2);

        //tedaad adad saakhte shode
        System.out.println("Total count is: " + Complex.GetCount());

        //jam 
        System.out.print("Addition: ");
        Complex com3 = com2.Addition(com1);
        System.out.println(com3);

        //tefrigh 
        System.out.print("Subtraction: ");
        System.out.println(com2.Subtraction(com1));

        //taghsim 
        System.out.print("Division: ");
        Complex com4 = com2.Division(com1);
        System.out.println(com4);

        //zarb 
        System.out.print("Multiplication: ");
        Complex com5 = com2.Multiplication(com1);
        System.out.println(com5);

        //baraabari
        System.out.print("Equality: ");
        boolean equal = com2.IsEqual(com1);
        System.out.println(equal);

        //entesaab imaginary adad 2
        double imaginary = com2.GetImaginary();
        //set kardan real adad 1
        com1.SetReal(3.0);
    }

}

public class Complex {

    //shomaarande tedaad adad saakhte shode
    private static int Count = 0;
    private double Real, Imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real, double imag) {
        Count++;
        this.Real = real;
        this.Imaginary = imag;
    }

    //getter va setter 
    public static int GetCount() {
        return Count;
    }

    public void SetReal(double real) {
        this.Real = real;
    }

    public void SetImaginary(double imag) {
        this.Imaginary = imag;
    }

    public double GetReal() {
        return this.Real;
    }

    public double GetImaginary() {
        return this.Imaginary;
    }

    //jam 
    public Complex Addition(Complex other) {
        return new Complex(this.Real + other.GetReal(), this.Imaginary + other.GetImaginary());
    }

    //tafrigh 
    public Complex Subtraction(Complex other) {
        return new Complex(this.Real - other.GetReal(), this.Imaginary - other.GetImaginary());
    }

    //zarb 
    public Complex Multiplication(Complex other) {
        return new Complex(
                this.Real * other.GetReal() - this.Imaginary * other.GetImaginary(),
                this.Real * other.GetImaginary() + this.Imaginary * other.GetReal()
        );
    }

    //taghsim 
    public Complex Division(Complex other) {

        double denominator = Math.pow(other.GetReal(), 2) + Math.pow(other.GetImaginary(), 2);
        return new Complex(
                (this.Real * other.GetReal() + this.Imaginary * other.GetImaginary()) / denominator,
                (this.Imaginary * other.GetReal() - this.Real * other.GetImaginary()) / denominator
        );
    }

    //metod baraaye baraabari
    public boolean IsEqual(Complex other) {
        return (this.Real == other.Real) && (this.Imaginary == other.Imaginary);
    }

    //Override kardan metod toString
    @Override
    public String toString() {
        if (Real != 0 && Imaginary > 0) {
            return Real + " + " + Imaginary + "i";
        } else if (Real != 0 && Imaginary < 0) {
            return Real + " - " + (-Imaginary) + "i";
        } else if (Real == 0) {
            return Imaginary + "i";
        } else if (Imaginary == 0) {
            return Real + "";
        }
        return "";
    }
}
