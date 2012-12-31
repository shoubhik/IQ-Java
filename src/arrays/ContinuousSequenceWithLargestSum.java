package arrays;

import utils.Utils;

/**
 * You are given an array of integers (both positive and negative). Find the con-
 tinuous sequence with the largest sum. Return the sum.
 EXAMPLE
 input: {2, -8, 3, -2, 4, -10}
 output: 5 [ eg, {3, -2, 4} ]

 */
public class ContinuousSequenceWithLargestSum {

    /**
     * You might have identified that dynamic programming is appropriate for
     * this problem. Let’s
     write down the recurrence:

     sum(i,j) = max_k sum(i,k) + sum(k+1, j)
     This will give an O(N^3) solution. A brute force summing of the
     sequences will give the same
     time.
     A simple linear algorithm will work by keep track of the current
     subsequence sum. If that
     sum ever drops below zero, that subsequence will not contribute to the
     subsequent maximal
     subsequence since it would reduce it by adding the negative sum.

     * @param arr
     * @return
     */
    public static int getLargestPositiveSum(int arr[]){
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0 ; i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum > maxSum)
                maxSum = currentSum;
            else if(currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {2, -8, 3, -2, 4, -10};
        System.out.println("input array is:" + Utils.printArraySingleLine(arr));
        System.out.println("maximal positive sum = " + getLargestPositiveSum(arr));
    }
}
