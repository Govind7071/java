// use two treads and first will print 1 to 5 and second will print A to E


class Print 
{
    synchronized void numberPrint()
    {
        for (int i = 1 ; i <= 5 ; i++)
        {   System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch (Exception e ){}
                
            
        }
    }
    synchronized void letterPrint()
    {
        for (char c = 'A'; c <'F';c++){
            System.out.println(c);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){

            }
        }
    }
}
class Number extends Thread
{
  Print p;
  Number(Print p){
    this.p = p ;
  }
  public void run () {
    p.numberPrint();
  }
}
class Letter extends Thread{
    Print p ;
    Letter(Print p ){
        this.p = p ;
    }
    public void run (){
        p.letterPrint();
    }
}


public class T1
{
    public static void main (String [] args){
        Print p = new Print();
        Number n1 = new Number (p);
        Letter n2 = new Letter (p);


        n1.setPriority(Thread.MAX_PRIORITY);
         n2.setPriority(Thread.MIN_PRIORITY);

         n1.start();
         n2.start();
         

    }
}
