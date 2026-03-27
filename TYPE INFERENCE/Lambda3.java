interface Sample2 
{
    int display(int a , int b);
}


public class Lambda3
{
    public static void main (String [] args)
    {
        Sample2 S = (int a ,int b) -> {

            return a + b ;
        };

        
         int res = S.display(2,3);
         System.out.println("the sum is " + res);
       
    }
}