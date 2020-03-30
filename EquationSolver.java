import java.util.*;
import static java.lang.Math.*;
/* This program aim to solve the equation
   with 1 variable and degree 2. */
public class EquationSolver
{
    public static void main(String[] args)
    {
        System.out.println("The equation will be in the form \"ax^2 + bx + c = 0\".");
        System.out.println("Please enter \"a\" \"b\" \"c\".");
        System.out.println("a=");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("b=");
        double b = in.nextDouble();
        System.out.println("c=");
        double c = in.nextDouble();
        if (pow(b,2)-4*a*c < 0)
        {
            System.out.println("The equation has no real number solution.");
        }
        else if (pow(b,2)-4*a*c == 0)
        {
            double x = -b/(2*a);
            System.out.println("The equation has 2 same roots: x = " + x);
        }
        else
        {
            double x1 = (-b+sqrt(pow(b,2)-4*a*c))/2*a;
            double x2 = (-b-sqrt(pow(b,2)-4*a*c))/2*a;
            System.out.println("The solutions of the equation are: x1 = "+ x1 +", x2 = "+ x2);
        }
    }
}