package Trees;

public class ArrayBinaryTree {
	int[] data;

	public ArrayBinaryTree(int[] data) {
		this.data = data;
	}
	//	Ç°Ğò±éÀú
	public void frontShow_arrayTree(int start) {
		if(data==null||data.length==0){
			return;
		}
		System.out.println(data[start]);
		if(2*start+1<data.length) {
			frontShow_arrayTree(2*start+1);
		}
		if(2*start+2<data.length) {
			frontShow_arrayTree(2*start+2);
		}
	}
}
