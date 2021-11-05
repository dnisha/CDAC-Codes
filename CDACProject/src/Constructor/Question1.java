package Constructor;
import java.util.Scanner;


class Room{
	int roomno;
	String roomtype;
	String roomarea;
	String ACmachine;
	Scanner sc = new Scanner(System.in);
	
	public void setdata() {
		System.out.println("Enter Room No : ");
		 roomno = sc.nextInt();
		
		System.out.println("Enter Room Type : ");
		roomtype = sc.next();
		
		System.out.println("Enter Room Area : ");
		roomarea = sc.next();
		
		System.out.println("AC machine : ");
		ACmachine = sc.next();
		
		
	}
	
	public void displaydata() {
		
		System.out.println( roomno);
		System.out.println( roomtype);
		System.out.println( roomarea);
		System.out.println( ACmachine);
		
	}
}
public class Question1 {

	public static void main(String[] args) {
		
		Room r1 = new Room();
		Room r2 = new Room();
		
		r1.setdata();
		r1.displaydata();
		
		r2.setdata();
		r2.displaydata();
		
		
		
	}

}
