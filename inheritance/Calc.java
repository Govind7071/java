abstract class Parent{
   int a,b;
    Parent(int a,int b){
   this.a = a;
   this.b = b; }

    abstract void add();
    abstract void subtract();
    abstract void divide();
    abstract void  multiply();

}




class Child extends Parent{

    Child(int a,int b){
        super(a,b);
    }
     void add() {
        System.out.println(a+b);
    }
    void subtract()
    {
        System.out.println(a-b);
    
    }
     void divide()
     {
        System.out.println(a/b);

     }
     void multiply ()
     {
        System.out.println(a*b);
     }


}


class Calc
{
    public static void main (String[] args)
    {
        Child C = new Child(2,3);
        C.add();
        C.subtract();
    }
}