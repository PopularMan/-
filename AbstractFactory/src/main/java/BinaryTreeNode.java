/**
 * 上午9:06 2020/4/3
 * Created By CC.Z
 * Version:1.0.
 */

import java.util.Arrays;

/**
 * 实现一个数组排序.
 */
public class BinaryTreeNode {

	int data = 0;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data) {
		left = null;
		right = null;
		this.data = data;
	}

	public void insert(BinaryTreeNode root, int data) {
		if (root != null) {
			if (root.data > data) {
				if (root.left == null) {
					root.left = new BinaryTreeNode(data);
				} else {
					insert(root.left, data);
				}
			} else {
				if (root.right == null) {
					root.right = new BinaryTreeNode(data);
				} else {
					insert(root.right, data);
				}
			}
		}
	}

	public void in(BinaryTreeNode root) {
		if (root != null) {
			in(root.left);
			System.out.println(root.data);
			in(root.right);
		}
	}

	public static void main(String[] args) {
		int data[] = {22, 11, 23, 2323, 1231231, 999, 0, 123};
		BinaryTreeNode root = new BinaryTreeNode(data[0]);
		Arrays.stream(data).forEach(x -> {
		      if(x!=data[0]){
		      	root.insert(root,x);
		      }
		});
		root.in(root);
	}

}
