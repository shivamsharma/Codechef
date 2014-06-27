/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.util.Scanner;
import java.math.BigInteger;
class Main
{
	static BigInteger fact(int n)
	{
		if (n==1)
		return new BigInteger("1");
		else return fact(n-1).multiply(new BigInteger(""+n));
	}
	
	public static void main(String ...args)
	{
		BigInteger b;
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
			int t=sc.nextInt();
			b=fact(t);
			System.out.println(b.toString());
		}
	}
}
			