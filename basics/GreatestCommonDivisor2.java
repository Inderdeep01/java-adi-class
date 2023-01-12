/*  Java program to find GCD of two numbers
	GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the
	largest number that divides both of them. 
	For example GCD of 20 and 28 is 4 and GCD of 98 and 56 is 14. 
*/

import java.util.*;
import java.lang.Math;
public class GreatestCommonDivisor2
{
	public static int a,b;
	public static void main(String args[])
	{
		int gcd=1,i=2;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		a = sc1.nextInt();
		System.out.print("Enter the first number : ");
		b = sc1.nextInt();
		int a1=a;
		int b1=b;
		int min = Math.min(a,b);
		do
		{
			for(i=2;i<min; )
			{
				if(a % i ==0 && b % i == 0)
				{
					gcd=gcd*i; 
					a=a/i;
					b=b/i;
				}
				else
					i++;
			}
		} while ((a%gcd ==0 && b%gcd ==0) && (gcd < min) );
		System.out.println("GCD of "+a1+ " and "+ b1 + " :" + gcd );
	}
}
