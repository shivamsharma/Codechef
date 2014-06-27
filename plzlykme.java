/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Main
{
	static long xpown(long x,long n,long L)
	{
		long temp;
		long a = 1;
		while (n!=0)
		{
			temp = n % 2;
			n=n/2;
	 
			if (temp==1)
			{
				a=(a* x);
				if(a/L>0)
				{
					a=0;
					break;
				}
			}
			x=(x*x); 
		}
		return a;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			long L,D,S,C;
			String str[]=br.readLine().split(" ");
			L=Long.parseLong(str[0]);
			D=Long.parseLong(str[1]);
			S=Long.parseLong(str[2]);
			C=Long.parseLong(str[3]);
			//System.out.println("L:"+L+" D:"+D+" S:"+S+" C:"+C);
			long count=0;
			//temp=0;
			//count=(long)S*xpown((1+C),D-1,L);
			//System.out.println("count:"+count+"  temp:"+temp);
			
			if(xpown(C+1,D-1,L)==0)
			{
				System.out.println("ALIVE AND KICKING");
			}
			else
			{
				if(S*xpown(C+1,D-1,L)>=L)
				{
					System.out.println("ALIVE AND KICKING");
				}
				else
				System.out.println("DEAD AND ROTTING");
			}
		}
	}
}