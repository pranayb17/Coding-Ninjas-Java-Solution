// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7

package while_loop;
import java.util.Scanner;

public class lec6_Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pv=1;
		int ans=0;
		int lastnum=0;
		
		
		while(n>0) {
			lastnum =n%10;              //for holding last digt
			     n=n/10;                //updating value of n
			      ans=ans+lastnum*pv;     //multiply last number with place value
			        pv=pv*2;              //increase place value by 2
			
		           }System.out.print(ans);
		

	} 

}
