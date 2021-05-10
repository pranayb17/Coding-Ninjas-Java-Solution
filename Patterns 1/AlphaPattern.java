// Code : Alpha Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 7
// Sample Output 1:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF
// GGGGGGG


import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        char startch='A';
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print((char)(startch));
                    j++;
            }
            System.out.println();
            startch++;
            i++;
        }
		
		
	}

}
