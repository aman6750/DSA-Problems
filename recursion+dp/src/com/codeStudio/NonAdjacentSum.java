package com.codeStudio;
import java.util.* ;
import java.io.*; 
import java.util.*;

public class NonAdjacentSum {
	
	// problem link => https://www.codingninjas.com/codestudio/problems/maximum-sum-of-non-adjacent-elements_843261?leftPanelTab=0

	
	public static void main(String[] args) {
		
		
		
		//maximumNonAdjacentSum(ArrayList<Integer> nums);
	}
	

		public static int solve(int ind,ArrayList<Integer> nums,int[] dp){
			
			if(ind==0) return nums.get(ind);

			if(ind<0) return 0;

			if(dp[ind]!=-1) return dp[ind];

			int pick = nums.get(ind)+solve(ind-2,nums,dp);

			int notpick = 0 + solve(ind-1,nums,dp);

			return dp[ind]=Math.max(pick,notpick);

		}

		public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
			// Write your code here.

			 int n = nums.size();

			int[] dp = new int[n+1];

			Arrays.fill(dp,-1);


			 return solve(n-1,nums,dp);

		}
	
	
	
}
