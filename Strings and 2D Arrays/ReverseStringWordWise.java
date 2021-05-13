// Reverse String Word Wise
// Send Feedback
// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
// Input format :
// String in a single line
// Output format :
// Word wise reversed string in a single line
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// code your indent Always

public class Solution {
    
	public static String reverseWordWise(String input) {
		int start =input.length()-1;
		String ans="";
		
		
		while(start>=0) {
			while(start>=0 && input.charAt(start)==' ') start--;
	
			
			int end=start;
			if(start<0) break;
			
			while(start>=0 && input.charAt(start)!=' ') start--;
			
			if(ans.isEmpty()) {
				ans=ans.concat(input.substring(start+1,end+1));
			}
			
			else {
				ans=ans.concat(' '+input.substring(start+1,end+1));
			}
			     
		}
        
		return ans;
		

	}

}


	

