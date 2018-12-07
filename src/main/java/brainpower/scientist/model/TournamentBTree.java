package brainpower.scientist.model;

import java.util.SortedSet;
import java.util.TreeSet;

public class TournamentBTree {
	
	public static void main(String[] args) {
		SortedSet<Scientist> tree = new TreeSet<>();
		
	}
	
	Node root;
	
	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void addNode(int key, Scientist scientist) {
		Node newNode = new Node(key, scientist);
		
		if(root == null) {
			root = newNode;
		}
		
		else {
			Node focusNode = root;
			
			Node parent;
			
			while(true) {
				parent = focusNode;
				
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
					
					else {
						focusNode = focusNode.rightChild;
						
						if(focusNode == null) {
							parent.rightChild = newNode;
							return;
						}
					}
				}
			}
		}
	}

}

class Node {
	int key;
	Scientist scientist;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, Scientist scientist){
		this.key = key;
		this.scientist = scientist;
	}
	
	@Override
	public String toString() {
		return "Name: " + scientist.getName() + " Strenght: " + scientist.getStrength();
	}
}
