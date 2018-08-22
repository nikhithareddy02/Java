package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeProblems {
	//To find max value in the tree
	public static int maxValueInTree(Node<Integer> node) {
		int max = Integer.MIN_VALUE;
		if(node != null) {
			int leftmax = maxValueInTree(node.left);
			int rightmax = maxValueInTree(node.right);
			max = leftmax > rightmax ? leftmax : rightmax;
			max = max > (int)node.data ? max : (int)node.data;	
		}
		return max;
	}
	//Searching for an element in the tree
	@SuppressWarnings("unchecked")
	public static <E> Boolean searchElement(Node<E> node,E element) {
		if(node != null) {
			if(node.data == element) {
				return true;
			}
			return searchElement(node.left, element) || searchElement(node.right, element);
		}
		return false;
	}
	//To find level with maximum sum
	@SuppressWarnings("unchecked")
	public static <E> void levelWithMaxSum(Node<Integer> node) {
		int currentSum = 0,maxSum = Integer.MIN_VALUE;
		if(node != null) {
			Queue<Node<Integer>> q = new LinkedList<Node<Integer>>();
			Queue<Node<Integer>> q2 = new LinkedList<Node<Integer>>();
			Node<Integer> temp;
			q.add(node);
			q.add(null);
			currentSum = node.data;
			while(!q.isEmpty()) {
				temp = q.poll();
				q2.add(temp);
				if(temp != null) {
					if(temp.left != null) {
						q.add(temp.left);
					}
					if(temp.right != null) {
						q.add(temp.right);
					}
				}
				else {
					currentSum = 0;
					for(Node<Integer> i:q) {
						currentSum += i.data;
					}
					if(!q.isEmpty()) {
						q.add(null);
					}
					maxSum = maxSum > currentSum ? maxSum : currentSum; 
				}
			}
			/*while(!q2.isEmpty()) {
				temp = q2.poll();
				if(temp == null) {
					System.out.print(null + "\t");
				}
				else {
					System.out.print(temp.data+"\t");
				}
			}*/
			System.out.println(maxSum);
		}
	}
	public static void main(String[] args) {
		BinaryTree<Integer> t = new BinaryTree<Integer>();
		//Integer[] array = {7,2,3,40,5,6,10};
		Integer[] array = {1,2,3,4,5,6,7};
		t.root = t.buildTreeFromArray(t, array);
		BinaryTreeMoreFunctions.levelOrderNonRecursive(t.root);
		/*	t.printLevelorder(t.root);
		System.out.println("Max Value");
		System.out.println(maxValueInTree(t.root));
		System.out.println(searchElement(t.root, 10));*/
		levelWithMaxSum(t.root);
	}
}
