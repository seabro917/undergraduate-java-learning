package Trees;

public class BinaryTree {
	TreeNode root;
	public BinaryTree() {

	}
	public BinaryTree(TreeNode root) {
		this.root = root;
	}
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public TreeNode getRoot() {
		return root;
	}
	//	ǰ����� ���ýڵ�ķ�����
	public void frontShow_Tree() {
		if(root!=null) {
			root.frontShow();
		}
	}
	//	�������
	public void midShow_Tree() {
		if(root!=null){
			root.midShow();
		}
	}
	public void afterShow_Tree() {
		// TODO Auto-generated method stub
		if(root!=null) {
			root.afterShow();
		}
	}
	public TreeNode frontSearch_Tree(int target) {
		// TODO Auto-generated method stub
		return root.frontSearch(target);
	}
	public void delete(int i) {
		// TODO Auto-generated method stub
		if(root.value==i) {
			root = null;
		}else {
			root.delete(i);
		}
	}

}
