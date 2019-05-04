import java.util.*;
public class Handshake
{
	public static void main(String[] args)
	{
		int x;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of hands for this situation");
		x=input.nextInt();
		for (int i = 1; i <= x; i++)
			System.out.println("handshake("+i+")="+handshake(i));
	}
	public static int handshake(int num)
	{
		if (num < 2)
			return num - 1;
		else
			return num - 1 + handshake(num - 1);
	}
}