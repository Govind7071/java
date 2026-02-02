import java.util.Scanner;


class Input1 {
    public static void main (String[] args){
        Scanner x = new Scanner (System.in);
        System.out.println("enter the boolean  value : ");
        boolean b = x.nextBoolean();
        System.out.println(b);




         
        System.out.println("enter the integer  value : ");
        int i = x.nextInt();
        System.out.println(i);


        System.out.println("enter a float value : ");
        float f = x.nextFloat();
         System.out.println(f);




        System.out.println("Enter a string : ");
        String s = x.nextLine();
        System.out.println(s);


        System.out.println("enter a character : ");
        char c = x.next().charAt(0);
         System.out.println(c);



    }
}