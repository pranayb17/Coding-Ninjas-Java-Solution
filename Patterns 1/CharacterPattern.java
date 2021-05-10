// Code : Character Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// A
// BC
// CDE
// DEFG
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 13
// Sample Input 1:
// 5
// Sample Output 1:
// A
// BC
// CDE
// DEFG
// EFGHI


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while (i<=n) {
			
			int j =1;
			while (j<=i) {
				System.out.print((char)('A'+j+i-2));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
