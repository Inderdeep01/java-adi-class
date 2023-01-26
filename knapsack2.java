import java.util.*;
class pair{
    int weight;
    int value;
    pair(int a,int b){
        weight = a;
        value = b;
    }
}
class knapsack2{
    public static pair compare(pair pair1,pair pair2){
        if(pair1.value>pair2.value)
            return pair1;
        else if(pair2.value>pair1.value)
            return pair2;
        else if(pair1.value==pair2.value){
            if(pair1.weight==pair2.weight)
                return pair1;
            else if(pair1.weight>pair2.weight)
                return pair2;
            else if(pair2.weight>pair1.weight)
                return pair1;
        }
        return pair1;
    }

    public static int max(int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }

    public static int knapsack2(int[]weight,int[]value,int W,int V,int n){
        if(W<0)
            return 0;
        if(W==0 || n<0){
            return V;
        }
        int include = knapsack2(weight,value,W-weight[n],V+value[n],n-1);
        int exclude = knapsack2(weight,value,W,V,n-1);
        return max(include,exclude);
    }

    public static pair knapsack(int[]weight,int[]value,int capacity,int W,int V,int n,int N){
        if(W>capacity){
            pair res = new pair(0,0);
            return res;
        }
        if(W==capacity ||n==N){
            //return W,V pair ; possible solution
            pair res = new pair(W,V);
            return res;
        }
        //include the item;
        pair include = knapsack(weight,value,capacity,weight[n]+W,value[n]+V,n+1,N);
        //consider the item again
        pair again = knapsack(weight,value,capacity,weight[n]+W,value[n]+V,n,N);
        //exclude the item
        pair exclude = knapsack(weight,value,capacity,W,V,n+1,N);
        //compare for solution
        pair compare1 = compare(include,again);
        pair compare2 = compare(exclude,again);
        return compare(compare1,compare2);
    }
    public static void main(String[] args){
        /* int N = 4;
        int n = 0;
        int[] weight = {8,5,2,4};
        int[] value = {10,7,2,5};
        int capacity = 10;
        pair out = knapsack(weight,value,capacity,0,0,n,N);
        System.out.println(out.weight);
        System.out.println(out.value); */
        int[] weight = {30,10,20};
        int[] value = {10,20,30};
        System.out.println(knapsack2(weight,value,50,0,2));
    }
}