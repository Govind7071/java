interface Interface1{
    int r = 2;
    String name = "Govind";
}
interface I2 extends Interface1{
    void display ();
}

public class I1 implements I2 {
    public void display (){
        System.out.println("Roll No : " + r);
        System.out.println("Name :" + name);
    }
public static void main (String[] args){
    I1 I = new I1();
    I.display();
}

}