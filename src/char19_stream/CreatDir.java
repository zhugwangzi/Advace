package char19_stream;
import java.io.File;
public class CreatDir {
	public static void main(String[] args) {
		File f=new File("/a");
		f.mkdirs();
		if(f.isDirectory()) {
			System.out.println("目录：abc");
			String[] s=f.list();
			for(int i=0;i<s.length;i++){
				File f1=new File("abc/"+s[i]);
				if(f1.isDirectory()) {
					System.out.println(s[i]+"是一个目录");
				}else {
					System.out.println(s[i]+"是一个文件");
				}
			}
		}else {
			System.out.println("/abc 不是一个文件夹");
		}
	}
}
