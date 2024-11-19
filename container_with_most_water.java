import java.util.*;
public class container_with_most_water {
    public static int maxContainer(int[] height){
        int maxWater = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
                int width = j-i;
                int ht = Math.min(height[i], height[j]);
                int currentWater = width*ht;
                maxWater = Math.max(maxWater, currentWater);
        }
    }return maxWater;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height[] = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxContainer(height));
    }
}
