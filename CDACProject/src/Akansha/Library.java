package Akansha;
//Design library management system 
//1) Design interface  library having fields like lib_name,lib_address and lib_number .
//All fields are public static and final .
//2) create abstract method addrecord and displayrecord.
//3) create default method printMessage() that display welcome message
//4) create static method that printDetails that display library details
public interface Library {
	String lib_name="National Library";
	String lib_add="Noida";
	int lib_no=12;
	//abstract methods
	void Add_Record();
	void Display_Record();
	//default method
	
	default void printMessage() {
		System.out.println("-----WELCOME-----");
	}
	//static method
	
	static void printDetails() {
		System.out.println("-----Library Details-----");
		System.out.println("Library Name: "+lib_name);
		System.out.println("Library Address: "+lib_add);
		System.out.println("Library Number: "+lib_no);
	}
}
