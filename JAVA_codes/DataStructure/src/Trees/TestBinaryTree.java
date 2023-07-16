package Trees;

public class TestBinaryTree {
	//	创建树
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
		//		三种遍历
		System.out.println("前序遍历");
		my_binTree.frontShow_Tree();
		System.out.println("***********************");
		System.out.println("中序遍历");
		my_binTree.midShow_Tree();
		System.out.println("***********************");
		System.out.println("后序遍历");
		my_binTree.afterShow_Tree();
		//		前序查找
		TreeNode result = my_binTree.frontSearch_Tree(10);
		System.out.println(result);

		//		删除节点/子树
		my_binTree.delete(2);
		my_binTree.afterShow_Tree();
	}
}
