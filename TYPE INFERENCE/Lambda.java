interface Sample2 
{
    void display(String name);
}


public class Lambda 
{
    public static void main (String [] args)
    {
        Sample2 S = (String name) -> System.out.println("the name is " + name);
        S.display("Govind");
       
    }
}