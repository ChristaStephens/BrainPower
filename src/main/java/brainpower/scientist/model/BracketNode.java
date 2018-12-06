package brainpower.scientist.model;

public class BracketNode {
	//root node would be the highest number/highest ranked
	//scientist in the group
	//need head and string data type
	private Scientist scientist;
	private BracketNode opponent;
	private BracketNode next; //loser stays null
	
	
	//don't do it this way
	private BracketNode createBracketNode() {
		BracketNode bn = new BracketNode();
	 
		//Will insert the scientist here, but not sure
		//how to add them in?
	    bn.add(0);
	    bn.add(0);
	    bn.add(0);
	    bn.add(0);
	    bn.add(0);
	    bn.add(0);
	    bn.add(0);
	    bn.add(0);
	 
	    return bn;
	}
	
	//inserts the scientist into the list - might need to
	//auto wire scientist in to pass into this method?
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	
	//starts the recursion of the root node
	//calling itself to solve the problem, yo "hopefully"
	public void add(int value) {
	    Object root = addRecursive(root, value);
	}
	
	
	
	//check to see if it contains a specific value by looking
	//through the node from left to right.
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	//maybe delete nodes from list once they drop from list?

}
