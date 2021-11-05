package Exception_Handeling;

public class Vote {
String name;
int age;
void getdata(String n,int a)
{name=n;
 age=a;
}
void display()
{ 	System.out.println(name + age);  }

void validVoter()
{
	if(age>=18)
		System.out.println("eligible for voting");
	else
		throw new VotingException();
}

void validVoter2()
{
	try {
	if(age>=18)
		System.out.println("eligible for voting");
	else
		throw new VotingException();
	}catch(VotingException v)
	  {	System.out.println("ok");	}
	}

	public static void main(String[] args) {
		Vote v= new Vote();
		v.getdata("ajay",12);
		v.validVoter();
		v.display();
		
	

	}

}
