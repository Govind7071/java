interface Sample {
    void display () ;     //public abstract method 
}

public class fun_interface implements Sample 
{
    public void display()
    {
        System.out.println("I am in display in class main ");
    }



public static void main (String[] args)
{
    fun_interface M = new fun_interface();
    M.display();
}

}