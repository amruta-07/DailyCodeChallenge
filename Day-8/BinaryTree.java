class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }
}

public class BinaryTree {
    Node root = null; // empty Tree

    public void insert_data(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node temp = root;
            while (temp != null) {
                if (data > temp.data) {
                    if (temp.right == null) {
                        temp.right = new Node(data);
                        break;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null) {
                        temp.left = new Node(data);
                        break;
                    }
                    temp = temp.left;
                }
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree ref = new BinaryTree();
        ref.insert_data(10);
        ref.insert_data(8);
        ref.insert_data(7);

    }

}
