import java.util.*;

public class twosumcopy{
    public static int[] twosum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array"); 
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        }
}
