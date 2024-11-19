import java.util.*;

public class remove_elemmts{
    public static int removeElements(int[] nums, int val){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the val");
        int val = sc.nextInt();

        int newSize = removeElements(nums, val);
    
        System.out.println("The updated array is");
        for(int i = 0; i < newSize; i++){
            System.out.println(nums[i]);
        }

    }
}