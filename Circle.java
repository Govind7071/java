import java.util.Scanner;
public class Circle {
    public static void main(String[] args){

    //     float r=4.5f;
    //    float area=(float )(3.14*r*r);
    //    float circumference=(float) (2*3.14)*r;
    //     System.out.println("the area of circle is : " + area);
    //     System.out.println("the circumference is : " + circumference);

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number");
    float r = s.nextFloat();

        
        float area=(float )(3.14*r*r);
        float circumference=(float) (2*3.14)*r;
        System.out.println("the area of circle is : " + area);
        System.out.println("the circumference is : " + circumference);
        s.close();
    }
}