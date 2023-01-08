link: https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length-1;
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);
        
        //printing the 1st row 
        while(left <= right && top <= bottom) {
            for (int i =left;i<=right;i++){
                res.add(matrix[top][i]);
            }
           //after printing the 1st row - increasing top so we can start the last column and next iteration we have a check
            top++;
            //printing the last column 
            for (int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
          //decreasing the right as we are done with last row and for the next time check
          //A additional check for the last round, and for the inner spiral 
            if (top <= bottom && left <= right) {
                // prining the bottom from right to left 
            for (int i=right;i>=left;i--){
                res.add(matrix[bottom][i]);
            }
             
            bottom--;
           
             for (int i=bottom;i>=top;i--){
                res.add(matrix[i][left]);
            }
            }
            left++;

        }
        return res;
    }
}
