package Arrays_2D;

public class Arrays_2D_Transpose {
    public static void main(String[] args) {
         int [][] arr={ {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int n=3;
        int m=3;

        for (int row = 0; row < n; row++) {
    for (int col = row + 1; col < m; col++) { 
        int temp = arr[row][col];
        arr[row][col] = arr[col][row];
        arr[col][row] = temp;
    }
}

for (int row = 0; row < n; row++) {
    for (int col = 0; col < m; col++) {
        System.out.print(arr[row][col] + " ");
    }
    System.out.println();
}
    }
}
