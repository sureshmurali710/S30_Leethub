class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int low = 0;
        int high = m - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int pos = findMax(mat[mid]);
            if (mat[mid][pos] < mat[mid + 1][pos]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int row = low;
        int column = findMax(mat[row]);
        return new int[] { row, column };
    }

    private int findMax(int[] nums) {
        int max = -1;
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                pos = i;
            }
        }
        return pos;
    }
    }
