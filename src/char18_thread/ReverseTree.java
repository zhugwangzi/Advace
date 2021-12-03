package char18_thread;
public class ReverseTree {
	public static void reverseTree(TreeNode root){
		//结束条件
		if(root==null||(root.left==null&&root.right==null)) {
			return;
		}
		//交换左右节点
		TreeNode t;
		t=root.left;
		root.left=root.right;
		System.out.println(root.left.data+"  "+root.right.data);
		reverseTree(root.left);//左节点递归交换它的左右子节点
		reverseTree(root.right);//右节点递归交换它的左右子节点
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
class TreeNode{//定义一个二叉树类型
	int data;//节点存放的的数据
	TreeNode left;//左节点
	TreeNode right;//右节点
	public TreeNode(int x) {
		data=x;
	}
}
