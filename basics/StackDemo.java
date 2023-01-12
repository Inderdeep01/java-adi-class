import java.util.*;
class Stack 
{
	int arr[];
	int count;
	Stack(int n) 
	{
		arr = new int[n];
		count = -1;
  	}
	void push(int item) 
	{
		if(count  == 9)
			System.out.println("Stack is full.");
		else
			arr[++count] = item;
	}
	int  pop() 
	{
		if(count < 0) 
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return arr[count--];
	}
}
public class StackDemo 
{
	public static void main(String args[]) 
	{
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		Stack  s1 = new Stack(n);
		for(int i=0; i<n; i++) 
			s1.push(i);
		for(int i=0; i<10; i++)
			System.out.println(s1.pop());
	}
}