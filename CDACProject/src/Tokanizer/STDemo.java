package Tokanizer;
import java.util.StringTokenizer; 
class STDemo
{
	static String in = "title*Java-Samples;" + "author*Emiley J;" + "publisher*java-samples.com;" + "copyright*2007;";
	
public static void main(String args[]) 
{ 
	StringTokenizer st = new StringTokenizer(in, "*;-"); 
	while(st.hasMoreTokens())
	{
	System.out.println(st.nextToken());
 
	}

	
	 
}
}
