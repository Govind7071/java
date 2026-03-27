interface Sample2 
{
    void display(int a , int b);
}


public class Lambda2
{
    public static void main (String [] args)
    {
        Sample2 S = (int a ,int b) -> System.out.println("the sum is " + (a+b));
        S.display(2,3);
       
    }
}