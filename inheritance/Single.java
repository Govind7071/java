class Parent 
{
    void display ()
    {
        System.out.println("I am in display () of Parent Class");
        private_method();
    }
    private void private_method()
    {
        System.out.println("I am private method of parent class"); //not accessible in child class
       
    }
}
class Child extends Parent
{
    void show ()
    {
        System.out.println("I am in show () of child class");
    }

}

public class Single
{
    public static void main (String[] args)
    {
        Parent P = new Parent();
        P.display();
        Child C = new Child();
        C.show();
        C.display();
    }

}