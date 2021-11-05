package oopswithjava_4;

import java.util.Scanner;

public class Stock
{
String sname;
float price;
int qty;
public Stock()
{
sname=""; price=1; qty=1;
}
void input(){   
	Scanner s= new Scanner(System.in);
	System.out.println("enter stock name price and qty");
	sname=s.next();
    price=s.nextFloat();
    qty=s.nextInt();
}

	
			
void display(){
	System.out.println(sname+"  "+price+" "+qty);
}

void order(String n,int q)
{
if(sname.equals(n) &&  qty<=q)
  System.out.println("accepted order");

else
	System.out.println("accepted not order");
}

String changeCase()
{   sname= sname.toUpperCase();
	return sname;
}

void discount()
{
	if(qty>50 &&price>10000)
		price=price- price*.1f;	
}
}
