package char19_stream;
import java.io.File;
public class DeleteFileDemo{
	public static void main(String[] args) {
		File f=new File("/music");
		f.mkdirs();
		delFile(f);
	}
	public static void delFile(File f) {//ɾ���ļ���Ŀ¼����������Ķ�����
		File[] folders=f.listFiles();//��ȡFile����f�������ļ���Ŀ¼
		if(folders!=null) {
			for(File x:folders) {
				if(x.isDirectory()) {
					delFile(x);//��Ԫ����Ŀ¼��ݹ����delFile����
				}else {
					x.delete();//��Ԫ�����ļ���ֱ��ɾ��
				}
			}
		}
		f.delete();//���f���ļ����Ŀ¼��ֱ��ɾ��
	}
}