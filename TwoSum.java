package LeetCODE;
class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int tar = 5;
        int[] result = twoSum(num, tar);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
