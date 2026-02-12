class Overload 
{
    int add(int a, int b)
    {
        return (a+b);

    }



    int add(int a , int b , int c)
    {
        return (a+b+c);
    }



    double add(int a , int b , double c)
    {
        return (a+b+c);
    }
}


public class M1 

{
    public static void main (String[] args)
    {
        Overload O1 = new Overload();
        int r = O1.add(10,20,30);
        System.out.println(r) ;
    }
}