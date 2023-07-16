package Trees;

public class TreeNode {
	int value;
	TreeNode leftNode;
	TreeNode rightNode;

	public TreeNode(int value) {
		this.value = value;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	//  ǰ�����
	public void frontShow() {
		//		��ǰ���ڵ�
		System.out.println(value);
		//		��ڵ�
		if(leftNode!=null) {
			leftNode.frontShow();
		}
		//		�ҽڵ�
		if(rightNode!=null) {
			rightNode.frontShow();
		}
	}
	public void midShow() {
		// TODO Auto-generated method stub
		if(leftNode!=null) {
			leftNode.midShow();
		}
		System.out.println(value);
		if(rightNode!=null) {
			rightNode.midShow();
		}
	}
	public void afterShow() {
		// TODO Auto-generated method stub
		if(leftNode!=null) {
			leftNode.afterShow();
		}
		if(rightNode!=null) {
			rightNode.afterShow();
		}
		System.out.println(value);

	}
	public TreeNode frontSearch(int target) {
		// TODO Auto-generated method stub
		TreeNode result_temp = null;
		if(value==target) {
			result_temp = this;
		}else {
			if(leftNode!=null) {
				result_temp  = leftNode.frontSearch(target);
			}
			if(result_temp!=null) {
				return result_temp;
			}
			if(rightNode!=null) {
				result_temp =  rightNode.frontSearch(target);
			}
			if(result_temp!=null) {
				return result_temp;
			}
		}
		return result_temp;
	}
	public void delete(int i) {
		// TODO Auto-generated method stub
		TreeNode parent = this;
		if(parent.leftNode!=null) {
			if(parent.leftNode.value==i) {
				parent.leftNode = null;
				return;
			}
		}
		if(parent.rightNode!=null) {
			if(parent.rightNode.value==i) {
				parent.rightNode = null;
				return;
			}
		}
		parent = leftNode;
		if(parent!=null) {
			parent.delete(i);
		}
		parent = rightNode;
		if(parent!=null) {
			parent.delete(i);
		}

	}
}
