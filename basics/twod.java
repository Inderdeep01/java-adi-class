import java.util.Scanner;
class twod{
    public static void main(String args[]){
        int n = 4;
        int two[][] = new int[4][];
        two[0] = new int[4];
        two[1] = new int[3];
        two[2] = new int[2];
        two[3] = new int[1];
        int i,j,k=1;
        for(i=0;i<4;i++){
            for(j=0;j<n-i;j++){
                two[i][j] = k++;
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<n-i;j++){
                System.out.print(two[i][j]+" ");
            }
            System.out.println();
        }
    }
}