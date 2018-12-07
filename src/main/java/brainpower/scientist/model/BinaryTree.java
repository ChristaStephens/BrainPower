package brainpower.scientist.model;

public class BinaryTree {
	
	private Scientist scientist;
	private BracketNode opponent;
	private BracketNode next; //loser stays null
	
	
    private static Node root;

    public void Binarytree(int data)
    {
        root = new Node(data);
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static void main(String args[])
    {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        Node n6 = new Node(8);

        Binarytree tree = new Binarytree(3); //  3
        tree.add(root, n1, "left"); //         1/ \
        tree.add(root, n2, "right"); //            4
        tree.add(n2, n3, "left"); //             2/ \
        tree.add(n2, n4, "right"); //                5
    }
}

//we definitely need this 
class Node {
    private int key;
    private Node left;
    private Node right;

    Node (int key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right ) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

}