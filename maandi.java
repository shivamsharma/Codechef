/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Main
{
	static boolean isOverlucky(long n)
	{
		long temp=n,t;
		while(temp>0)
		{
			t=temp%10;
			if(t==4||t==7)
			return true;
			temp=temp/10;
		}
		return false;
	}
	static long algo(long n)
	{
		long count=0;
		int i;
		if(isOverlucky(n))
		count++;
		for(i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				if(isOverlucky(i))
				count++;
				if(isOverlucky(n/i))
				count++;
			}
		}
		if(i*i==n)
		{
			if(isOverlucky(i))
			count++;
		}
		return count;
	}
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			long n=Long.parseLong(br.readLine());
			System.out.println(algo(n));
		}
	}
}