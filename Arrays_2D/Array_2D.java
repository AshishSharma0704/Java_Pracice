package Arrays_2D;
public class Array_2D {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        int m=3;

        for(int col=0;col<m;col++){
            if(col %2==0){
                for(int row=0;row<n;row++){
                    System.out.print(arr[row][col]);
                }
            }else{
                for(int row=n-1;row>=0;row--){
                    System.out.print(arr[row][col]);
                }
            }System.out.println();
        }
        
    }
}
