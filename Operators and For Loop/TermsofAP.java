// Terms of AP
// Send Feedback
// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
// Input format :
// Integer x
// Output format :
// Terms of series (separated by space)
// Constraints :
// 1 <= x <= 1,000
// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41
// Sample Input 2 :
// 4
// Sample Output 2 :
// 5 11 14 17

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int R=1;
		int count=1;
		int i=1;
		
		        while(count<=X) {
		        	R=((3*i)+2);
		        	i++;
		        	if(R%4!=0) {  //if the no is printed then increase the value
		        		System.out.print(R+" ");
		        		count++;
		        	}
		        	
		        } 
		       
		      }

	}

