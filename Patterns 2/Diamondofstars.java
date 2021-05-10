// Code : Diamond of stars
// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.


// Pattern for N = 5
//  --*
//  -***
//  *****
//  -***
//  --*



// The dots represent spaces.



// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *



import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int n1=n/2+1;
		int n2=n-n1;
		for(int i=1;i<=n1;i++) {
			
			for(int space=1;space<=(n1-i);space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k=n2-1;
		for(int i=1;i<=n2;i++) {
			for(int space=1;space<=i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*k+1);j++) {
				System.out.print("*");
			}
			k--;
			System.out.println();
		}


	}

}
