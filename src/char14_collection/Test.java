package char14_collection;
public class Test {
	public static int staticVar=0;//�������Ҳ��Ϊ��̬����
	public int instanceVar=0;//��Ա������Ҳ��Ϊʵ������
	//��������,��ӡ����ֵ
	public void printVar() {
		staticVar++;
		instanceVar++;
		System.out.println("staticVar="+staticVar+" instanceVar="+instanceVar);
	}
	
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			Test t=new Test();
			t.printVar();
		}
	}
}
