package leetCode;

public class Task2293 {
    public static void main(String[] args){
        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }
    public static int minMaxGame(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] newList = new int[nums.length / 2];
        for (int j = 0; j < newList.length; j++) {
            for (int i = j * 2; i < nums.length - 1; i++) {
                if(j % 2 == 1){
                    if (nums[i] > nums[i + 1]) {
                        newList[j] = nums[i];
                    } else {
                        newList[j] = nums[i + 1];
                    }
                } else {
                    if (nums[i] < nums[i + 1]) {
                        newList[j] = nums[i];
                    } else {
                        newList[j] = nums[i + 1];
                    }
                }
                i++;
                break;
            }
        }
        if (newList.length == 1) {
            return newList[0];
        } else {
            return minMaxGame(newList);
        }
    }
}
