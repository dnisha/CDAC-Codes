package Test;

public abstract class Tv {
int volume;
//String Disply;

abstract void show() ;
abstract void type();

void Display(Tv t) {
	t.show();
}

void Typeof(Tv t) {
	t.type();
}
	public static void main(String[] args) {
	
		Lg t1 = new Lg();
	
	
t1.Display(new Lg());
//t1.type();
t1.Typeof(new Lg ());
	

		
	}

}
