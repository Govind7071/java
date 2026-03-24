package pack1;

class Sample1 {
    static int r = 2;
    static  String name = "Govind";
    static void display(){
        System.out.println("Display in sample class 1");
        System.out.println(r+" " + name);
    }
}

public class First{
    public static void main(String[] args){
        Sample1.display();
    }
}