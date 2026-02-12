class Default
{
    Default ()
    {
        System.out.println("i am default constructor");
    }
}
public class Const1
{
    public static void main (String[] args)
    {
        Default D = new Default(); 
        //  D.Default();
    }
}