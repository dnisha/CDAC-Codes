import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferProgram {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\FileHandling\\Example2.txt",true));
		
		bw.write("Hello Buffer Writer");
		bw.close();
		
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\FileHandling\\Example2.txt"));
		
	String a=	br.readLine();
	
	System.out.println(a);
	}

}
