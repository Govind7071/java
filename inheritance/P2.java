class Parent
{
     Parent()    //name of constructor is same as the name of parent class ,(parent constructor)

    {
        System.out.println("Parent class method");
    }
}

class Child extends Parent
{
    void child()     //this is child class constructor
    {
        System.out.println("Child class method");
    }
}

class P2
{
    public static void  main (String[] args)
    {
        Child C = new Child();
        C.child();
        
        
    }
}
