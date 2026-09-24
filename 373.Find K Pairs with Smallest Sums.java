import java.util.*;

public class Main {
    public static List<Integer> sorting(List<Integer> nums, int k, int x) {
        nums.sort((a, b) -> {
            if (Math.abs(a - x) == Math.abs(b - x)) {
                return Integer.compare(a, b);
            }
            return Integer.compare(Math.abs(a - x), Math.abs(b - x));
        });
        List<Integer> ans = new ArrayList<>(nums.subList(0, k));
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 15, 7, 3, 4);
        int k = 3;
        int x = 8;
        System.out.println(sorting(nums, k, x));  // Output: [7, 10, 15]
    }
}
