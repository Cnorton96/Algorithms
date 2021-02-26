package Sorting;

//Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated,
//and only the integer part of the result is returned.


public class SquareRoot {

    //This solution is using template 1 of binary search.

    public static int mySqrt(int x){
        if(x < 2){
            return x;
        }
        long num;
        int pivot;
        int left = 2;
        int right = x / 2;

        while(left <= right){
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;
            if(num > x){
                right = pivot - 1;
            }else if(num < x){
                left = pivot + 1;
            }else{
                return pivot;
            }
        }

        return right;
    }



    public static void main(String[] args){
        int test1 = 8;
        int test2 = 4;
        int test3 = 1;

        System.out.println("Test 1: " + mySqrt(test1));
        System.out.println("Test 2: " + mySqrt(test2));
        System.out.println("Test 3: " + mySqrt(test3));
    }
}
