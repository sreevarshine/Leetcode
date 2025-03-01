class Solution {
    public int maxPoints(int[][] points) {
        int max = 1;

        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                double slope;
                if (points[i][1] - points[j][1] == 0) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (double) (points[i][0] - points[j][0]) / (points[i][1] - points[j][1]);
                }
                map.put(slope, map.getOrDefault(slope, 1) + 1);
            }
            if (!map.isEmpty()) {
                max = Math.max(max, Collections.max(map.values()));
            }
        }

        return max;
    }
}