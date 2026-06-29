// Problem: LeetCode 7 - Reverse Integer
// Topic: Math
// Approach: Reverse digits using modulo (%) and division (/)
// Time Complexity: O(log10(n))
// Space Complexity: O(1)


class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}
