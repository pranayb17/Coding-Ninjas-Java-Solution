// Check Armstrong
// Send Feedback
// Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
// An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
// For example,
// 371, as 3^3 + 7^3 + 1^3 = 371
// 1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
// Input Format :
// Integer n
// Output Format :
// true or false
// Sample Input 1 :
// 1
// Sample Output 1 :
// true
// Sample Input 2 :
// 103
// Sample Output 2 :
// false

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int originalnum=n;
        int leng=0;
        int i=1;
               while(n!=0){
                   n=n/10;
                   leng=leng+1;
                  }
                  int t=originalnum;
                  int rem=0;
                  int sum=0;
                       while(t!=0){
                           int mul=1;
                           rem=t%10;
                          
                           for(i=1;i<=leng;i++){
                                  mul=mul*rem;
                                   
                           } t=t/10;
                            sum=sum+mul;
                           
                              
                    }
                           if(originalnum==sum){
                               System.out.println(true);
                           }
                           else{
                               System.out.println(false);
                           }

	}
}
