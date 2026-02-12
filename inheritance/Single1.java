class Parent
{
    int a = 10;
    int b = 20;
    void print()
    {
        System.out.println(a+ " " + b);
    }
}


class Child extends Parent
{
    int c;

    void sum ()
    {
        System.out.println (a+b+c);
    }

}
class Single1
{
    public static void main(String[] args)
    {
        Parent P = new Parent();
        // P.a = 10;
        // P.b = 20;
        P.print();
        Child C = new Child();
        C.c = 30;
        C.a = 10;
        C.b = 20;
        C.sum();


    }
}