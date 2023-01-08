 link : 
https://leetcode.com/problems/set-matrix-zeroes/description/


// here we are doing the inplace solution, which means not using any extra space.
// 1st row - represents the 0's if any 0 present in that column
// 1st col - represents the 0's if any 0 present in that row
//the [0][0] is overlapping- so we tooke the row one as a boolean firstRow -- true if 0 present in the 1st row

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRow = false;

        for( int i = 0; i < rows ; i++){
            for (int j = 0 ;j< cols ; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    if(i == 0){
                        firstRow = true;
                    }
                    else{
                        matrix[i][0] = 0;
                    }
                }
            }
        }
        // replacing with 0's from 2nd column and 2 row by traversing each element by checking the 1st col and 1st row'
        for(int i =1;i< rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0] == 0 || matrix[0][j] ==0){
                    matrix[i][j] = 0;
                 }
            }
        }

        // checking the 1st element which represents to column 0's '
        if(matrix[0][0] == 0){
            for(int i =0; i < rows ;i++){
                //making the complete 1st column 0
                matrix[i][0] = 0;
            }
        }

        //checking the firstrow value -- represents if 0 present in 1st row.@interface
        if(firstRow){
            for(int i = 0;i<cols; i++){
                matrix[0][i] = 0;
            }
        }
    }
}
