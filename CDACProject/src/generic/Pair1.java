package generic;

public class Pair1 {

	public static void main(String[] args) {
Pair<String> p = new Pair<>("Deepak","Nishad");
System.out.println(p.first);
System.out.println(p.second);
	}

}

class Pair<T>{
	T first;
	T second;
	
	Pair(){
		first = null;
		second= null;
	}
	
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
}