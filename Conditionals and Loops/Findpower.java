import java.util.Scanner;
import java.lang.Math; 
public class Solution {
    
    public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int n=s.nextInt();
		int power=(int)Math.pow(x, n);
		System.out.println(power);
    }
}
