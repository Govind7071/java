interface Library 
{
    default void book()
    {
        System.out.println("book section in defalut method");
    }

    static void price ()
    {
        System.out.println("the price in static section " );
    }
    void AbsMethod();
}

class BookBank implements Library 
{
    public void AbsMethod()
    {
        System.out.println("Abstract method");
    }
}

public class Fun_interface2
{
    public static void main (String[] args )
    {
        BookBank B = new BookBank ();
        B.AbsMethod();
        Library.price();
        B.book();
    }
}