link : https://leetcode.com/problems/rotate-image/description/



sol : 
Here we need to rotate the array in clockwise. But we retote the elements in code in anticlockwise to 
help with the space complexity.
  
class Solution {
    public void rotate(int[][] matrix) {
        int left = 0 , right = matrix.length - 1;
        while (left < right){

            for(int i=0; i<right-left;i++){
                int  top = left;
                int  bottom = right;
              //  Storing the 1st one with temp 
                int topLeft = matrix[top][left +i];
                // moving the left bottom to the left top
                matrix[top][left+i] = matrix[bottom-i][left];
             // Moving the right bottom to the left bottom
                matrix[bottom-i][left] = matrix[bottom][right-i];
              //moving the top right to the right bottom 
                matrix[bottom][right-i] = matrix[top+i][right];
              //Moving the temp to the right top
                matrix[top+i][right] = topLeft;
            }

            right = right -1;
            left = left +1;
           

        }

    }
}
