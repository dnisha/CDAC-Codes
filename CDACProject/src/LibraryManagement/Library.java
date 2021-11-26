package LibraryManagement;



import javax.swing.DefaultBoundedRangeModel;

import Interface.inter1;

public interface Library {
public static final String lib_name = "Sacred Knowledge";
public static final String lib_address = "Bhilai , Supela 490023";
public static final int lib_number = 101;

default void printMessage(){
	System.out.println("_______________Welcome_______________");
}


 void addRecord();
 void displayRecord();
 
 static void printDetails() {
	 System.out.println("Library name : "+lib_name);
	 System.out.println("Library address : "+lib_address);
	 System.out.println("Library number : "+lib_number);
}
 
 
 
}
