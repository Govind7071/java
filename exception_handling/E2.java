// import java.util.Scanner;

// public class E2{
//     public static void main(String[] args){
//         Scanner S = new Scanner(System.in);
//         System.out.println("Enter the number :");
//         int a = S.nextInt();
//         int b = S.nextInt();
//         try {
//         int res = a/b;
//         System.out.println("The result is :" + res);

//         }
//         catch(ArithmeticException e){
//             // System.out.println("Can't divide it by zero");
//             System.out.println(e.getMessage());
//         }
//         finally{
//              S.close();
//              System.out.println("End of code");
//         }
        
       
//     }
// }

public class E2{
    public static void main(String[] args){
        inty a = args.length;
        try{
            int b = 10/a;
            System.out.println(b);
            int c[] = {1,2};
            c[1]  = 100 ;
            System.out.println(c[0]+" " +c[1]);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutofBoundsException e){
            System.out.println(e.getMessage());
        }
        // catch(Exception e){
        //      System.out.println(e.getMessage());
        // }
        finally{
            System.out.println("End of code");

        }

        
    }
}