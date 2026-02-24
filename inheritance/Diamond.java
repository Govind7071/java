interface AA {
    default void display(){
         System.out.println("Display in interface AA");

    }
}

interface BB extends AA {
    default void display(){
        System.out.println("Display in interface BB");
    }
}
interface CC extends AA{
    default void display(){
        System.out.println("Display in interface CC");
    }
}
class Program2 implements BB,CC {
    public void display(){
        System.out.println("Display in class Program2");
    
    CC.super.display();
    BB.super.display();

}}
class Diamond {
    public static void main (String[] args){
        Program2 P1 = new Program2();
        P1.display();
    }
}