class A
{
    void methodA()
    {
        System.out.println("I am in grandparent class");
    }
}

class B extends A


{
    void methodB()
    {
        System.out.println("I am method of parent class");
    }

}
class C extends B
{
    void methodC()
    {
        System.out.println("I am in child class");
    }

}

class Multilevel
{
    public static void main (String [] args)
    {
        C C = new C();
        C.methodC();
        C.methodB();
        C.methodA();

    }
}