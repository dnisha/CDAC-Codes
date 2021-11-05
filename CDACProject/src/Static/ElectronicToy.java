package Static;

public class ElectronicToy {
	Toy t1;
	int price;
	String tname;
    int model_n;
    String made;
    
    
    
    ElectronicToy(int model_n , Toy t1){
    	this.model_n = model_n;
    	this.tname = t1.toy_name;
    	this.price = t1.price;
    	this.made = t1.made_in;
    }
    
    public void printAll() {
    	System.out.println("Toy name :"+tname);
    	System.out.println("Toy price :"+price);
    	System.out.println("Toy model number :"+model_n);
    	System.out.println("Made in :"+made);
    	
    }
	public static void main(String[] args) {
		Toy t1 =new Toy(600,"Car");
		
		ElectronicToy e1 = new ElectronicToy(5,t1);
		
		e1.printAll();
		

	}

}
