class Stack{
    int arr[] = new int[10];
    int count;
    Stack(){
        count = -1;
    }
    void push(int item){
        if(count==9){
            System.out.println("Stack is full");
        }
        else{
            arr[++count] = item;
        }
    }

    int pop(){
        if(count<0){
            System.out.println("Stack underflow");
            return 0;
        }
        return 
    }
}

class hello{
    public static void main(int args[]){
        System.out.println("Hello");
        Stack s1 = new Stack();
    }
}