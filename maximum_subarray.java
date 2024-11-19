import java.util.*;
public class maximum_subarray{
    public static int maxiArrayValue(int[] nums){
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0;i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("the value is ");
        System.out.println(maxiArrayValue(nums));
    }
    
}