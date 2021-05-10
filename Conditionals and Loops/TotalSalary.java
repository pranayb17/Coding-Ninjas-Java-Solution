import java.lang.Math; 
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
		
		int BS= s.nextInt();
        char CH=s.next().charAt(0);
        
        int all;
		if(CH==65)
		{
			all=1700;
		}
		else if(CH==66)
		{
			all=1500;
		}
		else
		{
			all=1300;
		}double ts=((BS+(0.20*BS)+(0.50*BS)+all)-(0.11*BS));
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
		

	}
}
