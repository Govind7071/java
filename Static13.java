class Demo
{
   private int r;
   private String name;
   void getdata(int r , String name)
   {
    this.r = r ;
    this.name = name ;
   }
   void show ()
   {
    System.out.println(r);
    System.out.println(name);

   }


}
public class Static13 
{
    public static void main (String[] args)
    {
        Demo D = new Demo() ;
        // D.r = 19;
        // D.name = "Govind" ;
        // System.out.println(D.r);
        // System.out.println(D.name);
        D.getdata(10,"govind");
        D.show();
    }
}