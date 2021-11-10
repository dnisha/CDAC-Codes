package Collections;
 
	import java.util.PriorityQueue;

import java.util.Comparator;

  class MyComparator implements Comparator<String>
{
   @Override
   public int compare(String x, String y)
   {
      return x.length() - y.length();
   }
}
	
	public class PriorityQueueExample
	{
	    public static void main(String[] args)
	    {
	        
           PriorityQueue<String> queue = new PriorityQueue<String>(15, new MyComparator());
	        queue.add("Tyrion Lannister");
	        queue.add("Daenerys Targaryen");
	        queue.add("Arya Stark");
	        queue.add("Petyr 'Littlefinger' Baelish");
	        
	        System.out.println(queue);

	        while (queue.size() != 0)
	        {
	            System.out.println(queue.poll());
	        
	        }      
	    
	    }  }
