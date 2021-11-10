package Collections;
 
	import java.util.PriorityQueue;

import java.util.Comparator;

  class MyComparator implements Comparator<Integer>
{
    
   @Override
   public int compare(Integer number1, Integer number2) {
       int value =  number1.compareTo(number2);
       // elements are sorted in reverse order
       if (value > 0)           {               return 1;         }
       else if (value < 0)      {               return -1;        }
       else                     {               return 0;        }
   }

}
	
	public class PriorityQueueExample1
	{
	    public static void main(String[] args)
	    {
	       
           PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());
  	        queue.add(22);
	        queue.add(44);
	        queue.add(19);
	        queue.add(10);
	        
	        System.out.println(queue);

	        while (queue.size() != 0)
	        {
	            System.out.println(queue.poll());
	        }      
	    }  }
