package char19_stream;
import java.io.*;
public class FileStreamTest{
	public static void main(String[] args) throws IOException{
		try {
			byte[] b= {11,4,23,7,8,9};
			OutputStream os=new FileOutputStream("test.txt");
			for(int i=0;i<b.length;i++) {
				os.write(b[i]);
			}
			os.close();
			
			InputStream is=new FileInputStream("test.txt");
			int size=is.available();
			for(int i=0;i<size;i++) {
				System.out.print((char) is.read()+" ");
			}
			is.close();
		}catch(IOException e) {
			System.out.println("Exception");
		}
	}
}