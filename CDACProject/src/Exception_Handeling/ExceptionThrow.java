package Exception_Handeling;


public class ExceptionThrow {

   public static void main(String[] args) {

       try
       {
           int i=10;

       if(i!=10)
           throw new ArithmeticException();
       if(i>5)
           throw new ArrayIndexOutOfBoundsException();
       }
       catch(ArithmeticException | ArrayIndexOutOfBoundsException r) 
       {
           System.out.println("errror occcured");
           r.printStackTrace();
       }

   }

}