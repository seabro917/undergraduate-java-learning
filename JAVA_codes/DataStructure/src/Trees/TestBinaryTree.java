package Trees;

public class TestBinaryTree {
	//	������
	public static void main(String[] args) {
		BinaryTree my_binTree = new BinaryTree();
		TreeNode my_root = new TreeNode(1);
		my_binTree.setRoot(my_root);
		TreeNode my_root_l = new TreeNode(2);
		TreeNode my_root_r = new TreeNode(3);
		my_root.setLeftNode(my_root_l);
		my_root.setRightNode(my_root_r);
		my_root_l.setLeftNode(new TreeNode(4));
		my_root_l.setRightNode(new TreeNode(5));
		my_root_r.setLeftNode(new TreeNode(6));
		my_root_r.setRightNode(new TreeNode(10));
		//		���ֱ���
		System.out.println("ǰ�����");
		my_binTree.frontShow_Tree();
		System.out.println("***********************");
		System.out.println("�������");
		my_binTree.midShow_Tree();
		System.out.println("***********************");
		System.out.println("�������");
		my_binTree.afterShow_Tree();
		//		ǰ�����
		TreeNode result = my_binTree.frontSearch_Tree(10);
		System.out.println(result);

		//		ɾ���ڵ�/����
		my_binTree.delete(2);
		my_binTree.afterShow_Tree();
	}
}
