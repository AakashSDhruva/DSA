import java.util.*;

public class remove_duplicate_elements_from_sorted_array{
    public static int removeDuplicate(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length -1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner dude = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = dude.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++)
        {
            nums[i] = dude.nextInt();
        }
        System.out.println("the array is");
        int newLength = removeDuplicate(nums);
        for(int i = 0; i < newLength; i++){
            System.out.println(nums[i]);
        }
    }
}