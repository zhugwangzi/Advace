package char18_thread;
public class ReverseTree {
	public static void reverseTree(TreeNode root){
		//��������
		if(root==null||(root.left==null&&root.right==null)) {
			return;
		}
		//�������ҽڵ�
		TreeNode t;
		t=root.left;
		root.left=root.right;
		System.out.println(root.left.data+"  "+root.right.data);
		reverseTree(root.left);//��ڵ�ݹ齻�����������ӽڵ�
		reverseTree(root.right);//�ҽڵ�ݹ齻�����������ӽڵ�
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left.data=2;
		root.right.data=3;
		root.left.left.data=4;
		root.left.right.data=5;
		root.right.left.data=6;
		root.right.right.data=7;
		reverseTree(root);
	}
}
class TreeNode{//����һ������������
	int data;//�ڵ��ŵĵ�����
	TreeNode left;//��ڵ�
	TreeNode right;//�ҽڵ�
	public TreeNode(int x) {
		data=x;
	}
}
