package Concepts.Arrays.Matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2},{3,4}}; 
        //row 
        //column
        //print table
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
    }
}