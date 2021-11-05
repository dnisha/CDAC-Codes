package Exception_Handeling;
//user defined exception 
//public class VotingException extends Exception  -->checkedexception
public class VotingException extends RuntimeException// unchecked exception
{
	public VotingException()
	{ super();
		System.out.println("cannot vote");
	}
	
	public String getMessage()
	{
		return "try next time";
		
	}
	
	
}
