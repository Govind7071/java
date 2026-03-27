interface Sum 
{
    void Add(int a, int b);
}


class Addition implements Sum{
     public void Add(int a , int b)
    {
        System.out.println("the sum of two number is " + (a+b));

    }

}

public class Function_interface 
{
    public static void main (String[] args)
    {
        Addition a = new Addition() ;
        a.Add(2,3);
    }
}