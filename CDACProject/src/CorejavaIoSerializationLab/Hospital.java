package CorejavaIoSerializationLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.channels.NonWritableChannelException;

class pnewData extends ObjectOutputStream
{

	public pnewData(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() {}
	
}

public class Hospital {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Patient p1 = new Patient();
		p1.getData();
		
		File f = new File("PatientData.txt");
		
		FileOutputStream fo = new FileOutputStream(f,true);
	
		if(f.length() == 0) {
			ObjectOutputStream  o = new ObjectOutputStream(fo);
			o.writeObject(p1);
			o.close();
			
		}
		else {
			pnewData o1 =new pnewData(fo);
			o1.writeObject(p1);
		}
		ObjectInputStream oi= new ObjectInputStream(new FileInputStream(f));
		try {
			do {
				
				p1 = (Patient)oi.readObject();
				p1.display();
			} while (p1 != null);
			
			
			
		} catch (Exception e) {
			System.out.println("No more Data ");
		}
	

	}

}
