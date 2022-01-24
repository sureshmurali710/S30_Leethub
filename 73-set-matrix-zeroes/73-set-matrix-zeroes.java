class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < matrix.length; ++i)
            for (int j = 0; j < matrix[0].length; ++j)
                if (matrix[i][j] == 0) {
                    set1.add(i);
                    set2.add(j);
                }
        for (int row : set1)
            Arrays.fill(matrix[row], 0);
        for (int col : set2)
            for (int i = 0; i < matrix.length; ++i) matrix[i][col] = 0;
    }
}