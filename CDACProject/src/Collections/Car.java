package Collections;

import Interface.inter1;

public class Car {
	
	int model;
	String name;
	float price;
	
	Car (int model , String name,float price) {
		this.model = model;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		
		return "model "+model+" name "+name+" price "+price;
	}

}
