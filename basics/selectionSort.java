class selectionSort{
    public static void main(String args[]){
        int n = 7;
        int arr[] = {17,23,9,1,39,41,7};
        for(int i=0;i<n;i++){
            for(int j=i+i;j<n;j++){
                if(arr[j]<arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}