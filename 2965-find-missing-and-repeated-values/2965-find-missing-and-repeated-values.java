import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int total = n * n;

        HashSet<Integer> set = new HashSet<>();

        int repeated = -1;

        // Find repeated value
        for (int[] row : grid) {
            for (int num : row) {

                if (set.contains(num))
                    repeated = num;
                else
                    set.add(num);
            }
        }

        // Find missing value
        int missing = -1;

        for (int i = 1; i <= total; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}