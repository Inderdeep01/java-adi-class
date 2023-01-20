class Node{
    int data;
    Node left;
    Node right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}

class BinarySearchTree{
    Node root;
    BinarySearchTree(){
        root = null;
    }

    public void insert(int key){
        root = insertData(root,key);
    }
    public Node insertData(Node root,int key){
        if(root==null){
            root = new Node(key);
        }
        else if(root.data<=key){
            root.right = insertData(root.right,key);
        }
        else if(root.data>key){
            root.left = insertData(root.left,key);
        }
        return root;
    }

    public void inOrder(){
        inOrderTraversal(root);
    }
    public void inOrderTraversal(Node root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

    public boolean search(int key){
        Node node = root;
        while(node!=null){
            if(node.data==key){
                return true;
            }
            else if(key>node.data){
                node = node.right;
            }
            else if(key<node.data){
                node = node.left;
            }
        }
        return false;
    }

    public void remove(int key){
        root = removeElement(root,key);
    }

    public Node removeElement(Node root,int key){
        if(root==null)
        return null;
        else if(root.data==key){
            if(root.left==null && root.right==null)
                return null;
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                Node minRoot = smallest(root.right);
                root.data = minRoot.data;
                root.right = removeElement(root.right,root.data);
            }
        }
        else if(root.data<key)
            root.right = removeElement(root.right,key);
        else if(root.data>key)
            root.left = removeElement(root.left,key);
        return root;
    }

    public Node smallest(Node root){
        while(root.left!=null)
            root = root.left;
        return root;
    }

    public static void main

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(30);
        bst.insert(25);
        bst.insert(19);
        bst.insert(12);
        bst.insert(16);
        bst.insert(15);
        bst.insert(72);
        bst.inOrder();
        System.out.println(bst.search(12));
        bst.remove(30);
        bst.inOrder();
    }
}