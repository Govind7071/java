import java.util.Scanner;

public class e1{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = S.nextInt();
        int b = S.nextInt();
        try {
        int res = a/b;
        System.out.println("The result is :" + res);

        }
        catch(ArithmeticException e){
            // System.out.println("Can't divide it by zero");
            System.out.println(e.getMessage());
        }
        finally{
             S.close();
             System.out.println("End of code");
        }
        
       
    }
}