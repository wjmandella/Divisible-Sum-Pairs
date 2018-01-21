// My solution to the HackerRank problem "Divisible Sum Pairs."
// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import java.util.Scanner;

public class DivisibleSumPairsApp {
    static int divisibleSumPairs(int n, int k, int[] ar) {
 
    	int count = 0;
    	for(int i = 0; i < (ar.length - 1) ; i++) {
    		for(int j = (i+1); j < ar.length; j++) {
    			if((ar[i] + ar[j]) % k == 0) {
    				count++;
    			}
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for n (integer 2 - 100): "); 
        int n = in.nextInt();
        System.out.print("Enter a value for k (integer 1 - 100): "); 
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            System.out.print("Enter an integer (1 - 100): "); 
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        in.close();
    }
}
