package char19_stream;
import java.io.*;
public class FileStreamTest2{
	public static void main(String[] args) throws IOException{
		//��д����ȡ����output��input
		//�����ļ����������fop,���Ҵ���a.txt�ļ�����eclipse�Ĺ����ռ�Ŀ¼
		File f=new File("a.txt");//������һ��ſ��Դ����ļ�
		OutputStream fop=new FileOutputStream(f);
		//�����ļ������д����ָ�������ʽΪUTF-8
		OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
		//���ļ���д������
		writer.append("��������");
		writer.append("\r\n");
		writer.append("English");
		writer.close();//�ر�д����
		fop.close();//�ر������
		
		InputStream fip=new FileInputStream(f);//�����ļ�����������
		//�����ļ�������д����ָ�������ʽΪUTF-8
		InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
		StringBuffer sbBuffer=new StringBuffer();//����StringBuffer����
		while(reader.ready()) {
			sbBuffer.append((char) reader.read());//��ȡa.txt�ļ�������
		}
		System.out.println(sbBuffer.toString());//����ļ�������
		reader.close();//�رն�ȡ��
		fip.close();//�ر�������
	}
}
