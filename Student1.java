class Demo {
    int r;
    String name ;
    void getdata (int x, String y)
    {
        r = x;
        name = y;
    }

    void display ()
    {
        System.out.println(r) ;
        System.out.println(name);
    }
}


public class Student1
{
    public static void main (String[] args)
    {
        Demo D1 = new Demo() ; 
        D1.getdata (1,"govind" );
        D1.display () ;

    }

}