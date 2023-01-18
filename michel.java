import java.util.*;
class michel{
public static void main(String[] args){

    HashMap<Integer,Boolean> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> ll = new LinkedList<Integer>();
    int n=0;
    boolean cyclic = false;
    while(!done){
        ll.add(sc.nextInt());
        n++;
    }
    for(int i=0;i<n;i++){
        if(map.get(ll.get(i))){
            cyclic = true;
        }
        else{
            map.put(ll.get(i),true);
        }
    }
    if(cyclic){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
}}