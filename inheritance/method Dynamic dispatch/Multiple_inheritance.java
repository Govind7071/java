interface A{
    int a = 10;               //by default: public bhi laga hai ,static bhi laga hai ,final bhi laga hai 
    void method(); 
}


interface B{
    void method();
}

class C implements A,B{
   public  void method(){
        System.out.println("Abstract a");
    }
//    public void method2(){
//         System.out.println("Abstract B");
//     }
}


class Multiple_inheritance{
    public static void main (String[] args){
    C Cc = new C();
    Cc.method();
    System.out.println(C.a);   
    
}}