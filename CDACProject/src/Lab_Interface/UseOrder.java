package Lab_Interface;

public final class UseOrder {

	public static void main(String[] args) {
		ShipedOrder o1 = new ShipedOrder();
		o1.setC_name("Mobile");
		o1.setNumber(12);
		o1.setO_qty(2);
		o1.setU_cost(1500);
		
		System.out.println(o1.getC_name());
		System.out.println(o1.getNumber());
		System.out.println(o1.getO_qty());
		System.out.println(o1.getU_cost());
		System.out.println(o1.computePrice());
		
		

	}
;
}
