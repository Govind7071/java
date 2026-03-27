import static java.lang.Math.PI;
import java.util.Scanner;


interface Example
{
    double area (int r);
}

public class AreaCircleFunInterface 
{
    public static void main(String[] args )
    {
        Example E = (int r) -> PI *r*r;
        System.out.println("Enter the radius  : ");
        Scanner S = new Scanner(System.in);
         r  = S.nextInt();
    }
}