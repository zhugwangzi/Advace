package char14_collection;
import java.util.*;

public class UpdateStu implements Comparable<Object>{//ʵ��CompareTo�ӿ�
	 String name;
	 long id;
	 public UpdateStu(String name,long id) {//���췽��
		 this.name=name;
		 this.id=id;
	 }
	 //��12~17�п���ɾ����������stu.����name��id
	 public String getName() {//��ȡname
		 return name;
	 }
	 public long getId() {//��ȡid
		 return id;
	 }
	 public int compareTo(Object o) {//��дcompareTo����
		 UpdateStu upstu=(UpdateStu) o;
		 int result=id>upstu.id?1:(id==upstu.id?0:-1);
		 return result;
	 }
	public static void main(String[] args) {
		//ʵ����4�����󣬲��Ҹ�ֵ����
		UpdateStu stu1=new UpdateStu("��ͬѧ", 01011);
		UpdateStu stu2=new UpdateStu("��ͬѧ", 01023);
		UpdateStu stu3=new UpdateStu("��ͬѧ", 01032);
		UpdateStu stu4=new UpdateStu("��ͬѧ", 01005);
		TreeSet<UpdateStu> tree=new TreeSet<>();//����δ��ֵ��tree����
		tree.add(stu1);//���Ԫ��
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu> it=tree.iterator();//������������ֵ�����϶���it
		System.out.println("set�����е�����Ԫ�أ�");//���Ԫ��
		while(it.hasNext()) {//��������Ԫ��
			UpdateStu stu=(UpdateStu) it.next();
			//���˳���ǰ���ѧ������������stu1~stu4
			System.out.println(stu.name+","+stu.id);
		}
		System.out.println("��ȡstu2ǰ���Ԫ�أ�");
		it=tree.headSet(stu2).iterator();//��ȡstu2ǰ���ѧ��
		while(it.hasNext()) {
			UpdateStu stu=(UpdateStu) it.next();
			System.out.println(stu.getName()+","+stu.getId());
		}
		System.out.println("��ȡ���Ԫ��");
		it=tree.subSet(stu4,stu3).iterator();//��ȡstu4~stu3��ѧ��
		while(it.hasNext()) {
			UpdateStu stu=(UpdateStu) it.next();
			System.out.println(stu.getName()+","+stu.getId());
		}
	}
}
