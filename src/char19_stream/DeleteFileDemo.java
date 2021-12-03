package char19_stream;
import java.io.File;
public class DeleteFileDemo{
	public static void main(String[] args) {
		File f=new File("/music");
		f.mkdirs();
		delFile(f);
	}
	public static void delFile(File f) {//删除文件或目录（包括里面的东西）
		File[] folders=f.listFiles();//获取File对象f的所有文件和目录
		if(folders!=null) {
			for(File x:folders) {
				if(x.isDirectory()) {
					delFile(x);//若元素是目录则递归调用delFile方法
				}else {
					x.delete();//若元素是文件则直接删除
				}
			}
		}
		f.delete();//如果f是文件或空目录就直接删除
	}
}