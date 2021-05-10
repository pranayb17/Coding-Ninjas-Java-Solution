// Code : Mirror Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
//  ...1 
//  ..12
//  .123
//  1234
// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 3
// Sample Output 1:
//      1 
//     12
//    123
// Sample Input 2:
// 4
// Sample Output 2:
//     1 
//    12
//   123
//  1234


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
		while(i<=n){
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j=j+1;	
			}
			int J=1;
			while(J<=i) {
				System.out.print(J);
				J=J+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
