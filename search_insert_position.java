import java.util.*;
    public class search_insert_position{
        public static int insertPosition(int[] nums, int target){
            int start = 0; int end = nums.length - 1;
            while(start<=end){
                int mid = (start + end)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid] > target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
                
            }
            return start;
        }
        public static void main(String[] args) {
            int nums[] = {1,2,3,5,8};
            int target = 9;
            System.out.println(insertPosition(nums, target)); 
        }
    }
