public class Question1 {
    public int sumOfUnique(int[] nums){
        int[] freq = new int[100];
        for (int i = 0; i < nums.length; i++ ) {
            freq[(nums[i] - 1)]++;
        }

        int sum = 0;
        for (int i = 0; i < 100; i++){
            if(freq[i] == 1){
                sum += i + 1;
            }
        }

        return sum;
    }
}
