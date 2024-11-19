public interface reverseArray {
    public static int reverArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]+"");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,6,7};
        int reversearray = reverArray(nums, 0, 0)
        // reverArray(nums, 0, nums.length-1);
        // printArray(nums);

    }
    
}
