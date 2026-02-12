class P
{
    void display()
    {
        System.out.println("Display of P class");
    }
}
class C extends P
{
    void display()
    {
         System.out.println("Display of C class");

    }
   

}

public class M1
{
    public static void main (String[] args)
    {
        C c1 = new C();
        P p1 = new C();
        c1.display();

    }
}