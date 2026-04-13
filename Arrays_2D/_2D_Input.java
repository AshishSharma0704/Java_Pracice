package Arrays_2D;
public class _2D_Input{
    public static void main(String[] args){
    int row =2;
    int col =2;
    int original[]={1,2,3,4};

    int [][] arr =new int[row][col];
    
   int k=0;
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=original[k++];
        }
    }



    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }

         System.out.println(); 
    }
    }
}