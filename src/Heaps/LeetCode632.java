import java.util.*;

class Solution {

    public static class Triplate implements Comparable<Triplate> {
        int ele;
        int row;
        int col;

        Triplate(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        public int compareTo(Triplate t) {
            return this.ele - t.ele;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {

        int[] ans = {0, Integer.MAX_VALUE};
        PriorityQueue<Triplate> pq = new PriorityQueue<>();

        int k = nums.size();
        int max = Integer.MIN_VALUE;

        // Insert first element from each list
        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new Triplate(ele, i, 0));
            max = Math.max(max, ele);
        }

        while (true) {

            Triplate top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;

            if (max - ele < ans[1] - ans[0]) {
                ans[0] = ele;
                ans[1] = max;
            }

            if (col == nums.get(row).size() - 1) {
                break;
            }

            int next = nums.get(row).get(col + 1);
            max = Math.max(max, next);

            pq.add(new Triplate(next, row, col + 1));
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        List<List<Integer>> nums = new ArrayList<>();

        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));

        int[] result = sol.smallestRange(nums);

        System.out.println("Smallest Range: [" + result[0] + ", " + result[1] + "]");
    }
}