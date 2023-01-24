class gridTraveller{
    public static int travel(int m,int n){
        if(m==0 || n==0)
            return 0;
        if(m==1 && n==1)
            return 1;
        return travel(m-1,n)+travel(m,n-1);
    }
    public static void main(String[]args){
        int n = travel(2,3);
        System.out.println(n);
    }
}