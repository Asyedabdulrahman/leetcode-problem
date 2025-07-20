class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Custom comparator for max-heap (farthest point on top)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> distance(b) - distance(a) // max-heap by distance
        );

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest
            }
        }

        // Collect the result
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    // Avoid sqrt for better performance (comparison only)
    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
