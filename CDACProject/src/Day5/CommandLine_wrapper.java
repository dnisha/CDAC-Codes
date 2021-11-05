package Day5;

//Q wap to ask name age and salary of
//a person using command line argument 
//and check if age > 18 print eligible 
//for voting else not eligible
//java CommandLine_wrapper neha 23  34000 
public class CommandLine_wrapper {

  public static void main(String[] args) {
  //type conversion
  //wrapper classes
  //8 primitive datatype  8 wrapper classes
      String name=args[0];
      int age=Integer.parseInt(args[1]);
      //converting string to float
      float salary=Float.parseFloat(args[2]);
      System.out.println(name);
      if(age>18)
          System.out.println("eligible for voting");
      else 
          System.out.println("Not eligible for voting");

  }

}

