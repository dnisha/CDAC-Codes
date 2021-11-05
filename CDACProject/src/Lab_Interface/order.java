package Lab_Interface;

import java.util.Scanner;

public class order {
	
	 String c_name;
	 int number;
	 double o_qty;
	 double u_cost;
	

	
	public String getC_name() {
		return c_name;
	}



	public void setC_name(String c_name) {
		this.c_name = c_name;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public double getO_qty() {
		return o_qty;
	}



	public void setO_qty(double o_qty) {
		this.o_qty = o_qty;
	}



	public double getU_cost() {
		return u_cost;
	}



	public void setU_cost(double u_cost) {
		this.u_cost = u_cost;
	}



	public double computePrice() {
		return (u_cost*o_qty);
	};
	

}
