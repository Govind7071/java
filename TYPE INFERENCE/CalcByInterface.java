interface Calculator 
{
    void addition(int a,int b);

    default int subtraction (int a,int b)
    {
        int difference = a - b;
        return difference;
    }


    default int mul(int a,int b)
    {
        int multiply = a * b;
        return multiply;
    }

    static double div(float a ,float b)
    {
       return a/b;
    }

    
}

class Calc implements Calculator
{
    public void addition(int a,int b)
    {
        int add = a + b;
        System.out.println("Sum " + add );
    }


}

public class CalcByInterface
{
    public static void main(String[] args){
        Calc C = new Calc();
        C.addition(2,3);
        System.out.println("Subtraction : "+ C.subtraction(3,1));
        System.out.println("division is " + Calculator.div(5,2)); 
        System.out.println("multiplication : " + C.mul(5,2));

    }
}


