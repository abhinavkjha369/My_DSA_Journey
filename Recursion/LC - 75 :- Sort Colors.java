// Problem: LeetCode 75 - Sort Colors
// Topic: Arrays
// Approach: Dutch National Flag Algorithm (3 pointers)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums){
        int L = 0, M = 0, H = nums.length - 1;
        while (M <= H){              // Base Case

            if(nums[M] == 0){
                swap(nums, L, M);    // Recursive Calls
                L++;
                M++;
            }
            else if(nums[M] == 1){
                M++;
            }
            else{
                swap(nums, M, H);
                H--;
            }
        }
    }
}
