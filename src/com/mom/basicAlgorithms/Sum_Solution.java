package com.mom.basicAlgorithms;

public class Sum_Solution {
    public static int Sum_Solution_1(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution_1(n - 1)) > 0);
        return sum;
    }

    static int sum = 0;
    public static int Sum_Solution_2(int s, int e){
        if(s==e){
            sum +=e;
        }
        else {
            sum += Sum_Solution_2(s, e-1);
        }
        return sum;
    }

    public static void main(String[] args) {
//        int res = Sum_Solution_1(10);
//        System.out.print(res);

        int res = Sum_Solution_2(1, 10);
        System.out.print(res);
        String newLine = System.getProperty("line.separator");
        System.out.println(newLine);
    }
}
