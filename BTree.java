import java.util.Queue;
import java.util.LinkedList;
public class BTree {
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx; // Static index

        // Function to construct the binary tree
        public static Node buildTree(int nodes[]) {
            if (idx >= nodes.length || nodes[idx] == -1) {
                idx++;  // Move index forward
                return null;
            }

            // Create a new node
            Node newNode = new Node(nodes[idx]);
            idx++;  // Move index forward

            // Recursively construct left and right subtrees
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Helper function for Preorder Traversal (Root → Left → Right)
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");  // Print current node
        preorder(root.left);  // Recursively traverse left subtree
        preorder(root.right); // Recursively traverse right subtree
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");  // Print current node
        preorder(root.right);  // Recursively traverse left subtree
    }
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);  // Recursively traverse left subtree
        postorder(root.right); // Recursively traverse right subtree
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node temp = q.remove();
            if(temp == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }

            } else {
                System.out.print(temp.data + " ");
                if (temp.left!= null)
                    q.add(temp.left);
                if (temp.right!= null)
                    q.add(temp.right);
            }
        }
    }

    public static int countNodes(Node root) {
        if(root==null) {
            return 0;
        }
        int l_Nodes = countNodes(root.left);
        int r_Nodes = countNodes(root.right);
        return l_Nodes + r_Nodes + 1;
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree.idx = 0; // **Reset index before building the tree**
        Node root = BinaryTree.buildTree(nodes);

        System.out.print("Preorder Traversal: ");  
        preorder(root);  // **This will now print the full traversal**
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();
        System.out.println("Levelorder Traversal: ");
        levelOrder(root);

        int n = countNodes(root);
        System.out.println("the no. of nodes present in the tree is : " + n );
    }
}


