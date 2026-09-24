class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Possible starting positions of the k-element window
        int left = 0;
        int right = arr.length - k;

        // Binary search for the best window
        while (left < right) {

            int mid = (left + right) / 2;

            // Compare the left candidate and right candidate
            if (x - arr[mid] > arr[mid + k] - x) {

                // Right side is closer, move window right
                left = mid + 1;

            } else {

                // Left side is closer or equally close
                right = mid;
            }
        }

        List<Integer> answer = new ArrayList<>();

        // Take k elements from the best window
        for (int i = left; i < left + k; i++) {
            answer.add(arr[i]);
        }

        return answer;
    }
}
