class Student 
{
    int r ; 
    String name ;
    static String college = "ABES" ;
    static int count = 0 ; 
    void getdata(int r , String name)
    {
        this.r = r ;
        this.name =  name ;
        count++;
    }

    void display ()
    {
        System.out.println(r) ;
        System.out.println(name) ;
        System.out.println(college) ;
        System.out.println(count) ;

    }
}

public class Static_class 
{
    public static void main (String[] args)
    {
       
        
        Student S1 = new Student () ;
       
        S1.getdata(1,"Govind");
        System.out.println(Student.count);
        S1.display();
        System.out.println(Student.college);
        Student S2 = new Student () ;
        System.out.println("object 2");
        S2.getdata(10,"Govind Yadav");
        System.out.println(Student.count);



        

    }
}