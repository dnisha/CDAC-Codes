package Lab_Interface;

public class ShipedOrder extends order {

	final int Shipping_chrg = 40;
	final int Handling_chrg = 40;
	
	
	public double computePrice(){
		
return (getO_qty()*getU_cost() +Shipping_chrg);
		
	}
	
}
