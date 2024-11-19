public class Max_and_min_element_array {
    public static int maximumValue(int[] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int minimumValue(int[] nums){
        int min = maximumValue(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums = {2,1,3,5,4};
        System.out.println(maximumValue(nums));
        System.out.println(minimumValue(nums));
    }
}
