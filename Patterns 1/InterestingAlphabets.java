// Code : Interesting Alphabets
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE
// Input format :
// N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 8
// Sample Output 1:
// H
// GH
// FGH
// EFGH
// DEFGH
// CDEFGH
// BCDEFGH
// ABCDEFGH


import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        char ch = (char)(65+n);
        while(i<=n){
            int j = i;
            while (j>0){
                System.out.print((char)(ch-j));
                j--;
            }
            System.out.println();
        	i++;
            
        }
        
	}
}
