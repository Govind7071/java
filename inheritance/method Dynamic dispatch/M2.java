class p1
{
    static void display()
    {
        System.out.println("Static display of p1 class");    //static wala kabhi override nahi hoga kisi bhi class me

    }
    void info()
    {
        System.out.println("normal method of p1 class");
    }
}
class C1 extends p1
{
    static void display ()
    {
        System.out.println("Static display of c1 class");
    }
    void info()
    {
        System.out.println("normal method of c1 class");
    }
}

public class M2
{
    public static void main (String[] args)
    {
        p1.display();
        C1.display();
        // p1 P = new p1();     cause error due of method overriding
        // p.info();
        C1 C = new C1();
        C.info();

    }
}