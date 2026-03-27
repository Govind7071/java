interface Example2 
{
    void display();
}
public class Lambda4 {
    static   int a = 10;

    void show (){
        Example2 E2 = () -> System.out.println(a);
        E2.display();

    }

    public static void main (String[] args)
    {
        Lambda4 l4  = new Lambda4();
        l4.show();
        System.out.println(Lambda4.a);
    }
}