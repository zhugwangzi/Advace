package char19_stream;
import java.io.*;
public class FileStreamTest2{
	public static void main(String[] args) throws IOException{
		//先写入后读取，先output后input
		//创建文件输出流对象fop,并且创建a.txt文件，在eclipse的工作空间目录
		File f=new File("a.txt");//和下行一起才可以创建文件
		OutputStream fop=new FileOutputStream(f);
		//创建文件输出流写对象，指定编码格式为UTF-8
		OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
		//向文件中写入数据
		writer.append("中文输入");
		writer.append("\r\n");
		writer.append("English");
		writer.close();//关闭写入流
		fop.close();//关闭输出流
		
		InputStream fip=new FileInputStream(f);//创建文件输入流对象
		//创建文件输入流写对象，指定编码格式为UTF-8
		InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
		StringBuffer sbBuffer=new StringBuffer();//创建StringBuffer对象
		while(reader.ready()) {
			sbBuffer.append((char) reader.read());//读取a.txt文件的内容
		}
		System.out.println(sbBuffer.toString());//输出文件的内容
		reader.close();//关闭读取流
		fip.close();//关闭输入流
	}
}
