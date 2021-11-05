package Static;

public class Toy {
    String toy_name;
    int price;
    static String made_in;
    
    Toy(){
    	toy_name = "Teaddy";
    	price = 500;
    	made_in ="China"; 
    }
    
   Toy(int price , String toy_name){
	   this.price = price;
	   this.toy_name = toy_name;
	   made_in ="China"; 
   }
   
   public void  display() {
	   
	   System.out.println(toy_name+ " having Price of ,"+price+" Toy is made in "+made_in);
   }
   public static void  staticdisplay() {
	   System.out.println("Toy is made in "+made_in);
   }
    
	

}
