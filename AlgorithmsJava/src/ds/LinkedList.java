package ds;

import java.io.IOException;
import java.util.Scanner;

class LLNode{
	
	private int data;
	private LLNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LLNode getNext() {
		return next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	
}
class SingleLinkedList {
	LLNode head;
	
	public SingleLinkedList() {

	}
	
	public void insertAtBegining(int data){
		if(head == null){
			head = new LLNode();
			head.setData(data);
			head.setNext(null);
		}
		else{
			LLNode newLLNode = new LLNode();
			newLLNode.setData(data);
			LLNode temp = head;
			while(temp.getNext()!=null){
				temp = temp.getNext();
			}
			temp.setNext(newLLNode);
			newLLNode.setNext(null);
		}
	}
	
	public void display(){
		System.out.println("Display of LinkedList");
		LLNode temp = head;
		while(temp!=null){
			System.out.print(temp.getData()+"\t");
			temp = temp.getNext();
		}
		System.out.println();
	}
	public void reverseLL() {
		LLNode currentnode = head;
		LLNode prevnode = null;
		LLNode nextnode = null;
		while(currentnode != null) {
			nextnode = currentnode.getNext();
			currentnode.setNext(prevnode);
			prevnode = currentnode;
			currentnode = nextnode;			
		}
		head = prevnode;
		System.out.println("After Reversal "); 
		display();
	}
	public void DeleteNode(int data) {
		LLNode temp = head;
		while(temp!=null){
			temp = temp.getNext();
			if(temp.getNext().getData() == data) {
				break;
			}
		}
		LLNode next = temp.getNext();
		temp.setNext(next.getNext());
		
	}
	public void DeleteList() {
		head = null;
	}
	public int size() {
		int size = 0;
		LLNode temp = head;
		while(temp!=null){
			size += 1;
			temp = temp.getNext();
		}
		return size;
	}
	public int findNth(int n) {
		int i = 1;
		LLNode temp = head;
		while(i <= n) {
			temp = temp.getNext();
			i=i+1;
		}
		return temp.getData();
	}
}
public class LinkedList{
	public static void main(String[] args) throws NumberFormatException, IOException {
		SingleLinkedList sll = new SingleLinkedList();
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		for (int i = 0; i < ar.length; i++) {
			sll.insertAtBegining(Integer.parseInt(ar[i]));
		}
		System.out.println("Size : "+sll.size());
		sll.display();
		System.out.println("3rd Element : "+sll.findNth(3));
		sll.reverseLL();
		/*sll.DeleteList();
		sll.display();*/
		sll.DeleteNode(4);
		sll.display();
		sc.close();
	}
}
