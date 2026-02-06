class Rectangle
{
    int width, length ;
    void getdata ( int width , int length)
    {
        this.width = width;
        this.length = length ;

    }
    int area  ()
    {
        int a =  length * width ;
        return (a) ;

    }
}
public class Rectangle_area 
{
    public static void main (String[] args)
    {
        Rectangle R = new Rectangle () ;
        R.getdata (3,5);
        int res = R.area() ;
        System.out.println(res);
    }
}

