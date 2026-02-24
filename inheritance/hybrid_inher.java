class A{
    void show (){
        System.out.println("Show in class A");
    }
}
interface B {
    void show ();
}
interface C {
    void show ();
}
class D extends A implements B,C{
    public void show(){
        System.out.println("Show in class D");
    }
}
class hybrid_inher {
    public static void main (String[] args){
        D D1 = new D();
        D1.show();
    }
}