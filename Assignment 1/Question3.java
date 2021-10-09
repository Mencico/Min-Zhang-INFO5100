public class Question3 {
    public void firstNonRepeat(int A[]) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n) {
                    System.out.println("First non-repeating element is: " + A[i]);
                    return;
                }
                if (j != i && A[i] == A[j]) {
                    break;
                }
            }
        }
        System.out.println("All the elements are repeated.");
        // I think this question may be a little wrong. Such as this exception: int A[1,1,2,2]
        // it can not return the numbers. So I have to use the void to solve this problem.
    }
}


