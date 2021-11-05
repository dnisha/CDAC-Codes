package OOPS;
import java.util.*;

class Stock{
	String s_name;
	int qty;
	float price;
	float discount;
	
	Stock(){
		s_name = "Tesla";
		price = 785.51f;
		qty = 2;
		
	}
	
	public void getdata(String s_name, float price,int qty) {
		this.s_name = s_name;
		this.price = price;
		this.qty = qty;
	}
	
	public void order(String s_name,int qty) {
		
		if(this.s_name.equals(s_name)) {
			
			if(qty > this.qty) {
				System.out.println("You cannot order that much amount of stock.......!");

			}
			
			else if(this.qty > qty ||this.qty==qty) {
				this.qty -=qty;

			}
			
		}
	
		else {
			System.out.println("No Such Stock Avilable.......!");
		}
		
	}
	
	public void discount(float price,int qty) {
		
		if(qty>50 && this.price >10000) {
			
			this.discount = (10*this.price)/100;

			this.price -= this.discount;
		}
		
	}
	
	public void display() {
		System.out.println("Name : "+s_name+", Price : "+price+", Quantity "+qty);
	}
}
public class Question1 {

	public static void main(String[] args) {
	
//		Stock s1 = new Stock();
//		s1.display();
//		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Stock Name :");
		String s_name = sc.nextLine();
		
		System.out.println("Enter Quantity of Stock :");
		int qty = sc.nextInt();
		
		System.out.println("Enter Stock price :");
		float price = sc.nextFloat();
		
		Stock s2 = new Stock();
		
		s2.getdata(s_name,price,qty);
		
		s2.display();
		
		
		System.out.println("Enter Stock Name you want to order :");
		String name = sc.next();
		
		System.out.println("Enter Quantity of Stock :");
		int qty1 = sc.nextInt();
		
		s2.order(name, qty1);
//		s2.discount(price,qty);
		s2.display();
		
		

	}

}
