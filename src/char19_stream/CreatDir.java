package char19_stream;
import java.io.File;
public class CreatDir {
	public static void main(String[] args) {
		File f=new File("/a");
		f.mkdirs();
		if(f.isDirectory()) {
			System.out.println("Ŀ¼��abc");
			String[] s=f.list();
			for(int i=0;i<s.length;i++){
				File f1=new File("abc/"+s[i]);
				if(f1.isDirectory()) {
					System.out.println(s[i]+"��һ��Ŀ¼");
				}else {
					System.out.println(s[i]+"��һ���ļ�");
				}
			}
		}else {
			System.out.println("/abc ����һ���ļ���");
		}
	}
}
