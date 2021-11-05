package Tut_new;

public class Author {
	
	String name;
	Books b;
	
	Author(String name,Books b){
		this.name = name;
		this.b = b;
	}
	
	void display() {
		
		System.out.println("Author name : "+name);
		System.out.println("Books id : "+b.id);
		System.out.println("Books name : "+b.name);
		System.out.println("Books price : "+b.price);
		System.out.println("Books pages : "+b.pages);
	}
	

	public static void main(String[] args) {
		
		Books b = new Books("Half Girlfriend ",12,250,500);

		Author a = new Author("Chetan Bhagat",b);
		
		a.display();
		

	}

}
