class lis{
    public static int LIS(int n,int[]arr){
        int[] memo = new int[n];
        for(int i=0;i<n;i++){
            memo[i] = 1;
        }
        for(int i=1;i<n;i++){
            for(j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    continue;
                }
                int possible = memo[j]+1;
                if(memo[i]<possible){
                    memo[i] = possible;
                }
            }
        }
        int solution = 1;
        for(int i=0;i<n;i++){
            if(memo[i]>solution)
                solution = memo[i];
        }
        return solution;
    }
}