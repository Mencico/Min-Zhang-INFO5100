import java.util.Arrays;

public class Question2{
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i) //traversal this array
            ans[i] = nums[i] * nums[i];

        Arrays.sort(ans);
        return ans;
    }
}

