package com;

public class Solution {
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		s.solution(5);
	}
	
    public void solution(int N) {
        // write your code in Java SE 8
        
    	StringBuffer sb = new StringBuffer();
    	for(int i=1; i<=N; i++)
    	{
    		if(i == N)
    		{
    			sb.append("L");
    			System.out.println(sb);
    		}
    		else
    		{
    			System.out.println("L");
    			sb.append("L");
    		}
    	}
    }
}
