package LocalandAnnonumous;




public class MyClass {
	void Tester() {
		class ClassTest implements Unittest {

			@Override
			public void test1() {
				System.out.println("Local class test1");
				
			}

			@Override
			public void test2() {
				System.out.println("Local class test2");
				
			}
			}
		Unittest u = new ClassTest();
	u.test1();
	u.test2();
		
		
	}
	
	void TesterAnnonymous (){
		Unittest t = new Unittest() {

			@Override
			public void test1() {
				System.out.println("Anonymous  class test1");
				
			}

			@Override
			public void test2() {
				System.out.println("Anonymous  class test2");
				
			}
			
		};
		t.test1();
		t.test2();
		
		
		
	}
	
	public static void main(String args[] ) {
		
		MyClass m=new MyClass();
		m.Tester();
		m.TesterAnnonymous();
		
	}

}
