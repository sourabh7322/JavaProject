//Given an array of integers, implement a function to find the maximum sum of a contiguous subarray. Describe your approach and the time complexity of your solution


package JavaProject;
import java.util.Scanner;
public class MaxSubArray {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n==0){
        System.out.println("Array must have at least one element");
        return;
       }
       int[] nums = new int[n];
       System.out.println("Enter the element of the array:");
       for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
       }
       try{
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum sum of subArray:"+ maxSum);
       }catch(IllegalAccessError e){
        System.out.println(e.getMessage());
       }
    }

    public static int maxSubArray(int[] nums){
        if(nums == null || nums.length==0){
            throw new IllegalAccessError("Array not be null or empty");
        }

        int currentMax = nums[0];
        int globalMax = nums[0];

        for(int i =1; i<nums.length; i++){
            currentMax = Math.max(nums[i] ,currentMax + nums[i]);
            if(currentMax>globalMax){
                globalMax = currentMax;
            }

        }
        return globalMax;
    }

    
}
