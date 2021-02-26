package Sorting;

//NOTE: For a binary search to work, the array must already be sorted!!
//If the array isn't sorted, we must sort the array ourselves before using a binary search algorithm.

//Since many problems that consist of using binary search are implemented slightly different, I will use 3 templates.

public class BinarySearch {


    //Template 1: This is the most basic and elementary form of binary search.

    public static int search(int[] nums, int target){
        int pivot = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            pivot = left + (right - left) / 2;
            if(target == nums[pivot]){
                return pivot;
            }else if(target < nums[pivot]){
                right = pivot - 1;
            }else{
                left = pivot + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(nums,8));
    }
}
