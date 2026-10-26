class Solution {
    public boolean binarySearch(int target, int[] bobSizes) {
        int l = 0, r = bobSizes.length - 1, mid;
        while (l <= r) {
            mid = l + ((r - l) / 2);
            if (bobSizes[mid] > target) {
                r = mid - 1;
            } else if (bobSizes[mid] == target) {
                return true;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();
        int diff = (bobSum - aliceSum) / 2;
        Arrays.sort(bobSizes);
        for (int a : aliceSizes) {
            int target = a + diff;
            if (binarySearch(target, bobSizes)) {
                return new int[] {a, target};
            }
        }
        return new int[0];
    }
}class Solution {
    public boolean binarySearch(int target, int[] bobSizes) {
        int l = 0, r = bobSizes.length - 1, mid;
        while (l <= r) {
            mid = l + ((r - l) / 2);
            if (bobSizes[mid] > target) {
                r = mid - 1;
            } else if (bobSizes[mid] == target) {
                return true;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();
        int diff = (bobSum - aliceSum) / 2;
        Arrays.sort(bobSizes);
        for (int a : aliceSizes) {
            int target = a + diff;
            if (binarySearch(target, bobSizes)) {
                return new int[] {a, target};
            }
        }
        return new int[0];
    }
}
