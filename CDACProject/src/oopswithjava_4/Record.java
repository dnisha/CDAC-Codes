package oopswithjava_4;

public class Record {

	public static void main(String[] args) {
		Stock s= new Stock();
		s.input();
		s.order("monitor", 9);
		s.changeCase();
		s.display();
		}

}
