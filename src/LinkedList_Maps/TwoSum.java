package LinkedList_Maps;
//Find two elements whose sums add up to the given target, else throw an exception

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sums add up to the target.");
    }



    public static void main(String[] args){

        int[] nums = new int[]{2,7,12,8};
        int target = 9;
        int target2 = 15;
        int target3 = 18;

       twoSum(nums,target);


    }
}
