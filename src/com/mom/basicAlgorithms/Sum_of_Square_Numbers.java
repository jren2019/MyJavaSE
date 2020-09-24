package com.mom.basicAlgorithms;

public class Sum_of_Square_Numbers {

    public static boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean res = judgeSquareSum(5);
        System.out.println(res);
    }
}
