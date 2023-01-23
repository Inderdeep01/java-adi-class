import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    Node(int key){
        this.data = key;
        left = null;
        right = null;
    }
}

class BinaryTree{
    public Node input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==-1){
            return null;
        }
        Node root = new Node(n);
        Node l = input();
        Node r = input();
        root.left = l;
        root.right = r;
        return root;
    }
}