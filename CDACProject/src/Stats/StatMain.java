package Stats;

import java.util.Scanner;

import javax.sound.sampled.TargetDataLine;

public class StatMain extends StatsOperations{
	
   void getData(){
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter a : ");
	   this.a = sc.nextInt();
	   
	   System.out.println("Enter b : ");
	   this.b = sc.nextInt();
	   
	   System.out.println("Enter c : ");
	   this.c = sc.nextInt();
		
	}

	public static void main(String[] args) {
		StatMain o = new StatMain();
		
	o.getData();
	o.minimum();
	o.maximum();
	o.average();

	}

}
