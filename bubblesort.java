import java.util.Scanner;

public class bubblesort{ 

    public static int[] bubbleSort(int[] nums) { // Renamed function for clarity
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;  // Optimization flag

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return nums; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] sortedArray = bubbleSort(nums); // Call bubbleSort and store result

        System.out.println("Sorted array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}