class Node{
    int data;
    Node left;
    Node right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}

class avl{
    Node root;
    BinarySearchTree(){
        root = null;
    }

    public int max(int x,int y){
        if(x>y)
            return x;
        else 
            return y;
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
            root = balance(root);
        }
        else if(root.data>key){
            root.left = insertData(root.left,key);
        }
        return root;
    }

    public int height(Node root){
        if(root==null)
            return 0;
        return 1+max(height(root.right),height(root.left));
    }
    public int heightfactor(Node root){
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        return left-right;
    }
    public Node balance(Node root){
        int hf = heightfactor(root);
        if(hf==-1 || hf==0 || hf==1)
            return;
        if(hf<-1){
            if(heightfactor(root.right)==-1){
                Node tmp = root;
                root = root.right;
                root.left = tmp;
            }
            else if(heightfactor(root.right)==1)
        }
    }
}