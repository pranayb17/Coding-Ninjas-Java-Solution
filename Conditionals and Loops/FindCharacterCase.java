
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s= new Scanner(System.in);
    
    char value = s.next().charAt(0);
    
	boolean checkBool = Character.isUpperCase(value);
	boolean check = Character.isLowerCase(value);

	
	if(checkBool){
		System.out.print("1");
	}
	else if(check){
		System.out.print("0");
	}else{
		System.out.print("-1");
	}

    }
}
