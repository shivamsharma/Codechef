/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.math.BigInteger;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		long[] list=new long[1009];
		long[] ans=new long[1009];
		long a,b,c;
		while(tc-->0)
		{
			int n=Integer.parseInt(br.readLine());
			String str[]=br.readLine().split(" ");
			int l=0;
			for(String temp:str)
			list[l++]=Long.parseLong(temp);
			str=br.readLine().split(" ");
			a=Long.parseLong(str[0]);
			b=Long.parseLong(str[1]);
			c=Long.parseLong(str[2]);
			String s=br.readLine();
			int d1=(""+b).length();
			int d2=0,flag=0,x=n,y=0;
			long add=0,mul=1;
			for(int i=0;i<n;i++)
			{
				if(s.charAt(i)=='R')
				{
					flag++;
					if(flag%2!=0)
					{
						ans[i]=Long.parseLong((((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(list[--x]))).add(BigInteger.valueOf(add))).mod(BigInteger.valueOf(c))).toString());
					}
					else ans[i]=Long.parseLong((((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(list[y++]))).add(BigInteger.valueOf(add))).mod(BigInteger.valueOf(c))).toString());;
				}
				else if(s.charAt(i)=='A')
				{
					add=(add%c+a%c)%c;
					if(flag%2!=0)
					{
						ans[i]=Long.parseLong((((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(list[--x]))).add(BigInteger.valueOf(add))).mod(BigInteger.valueOf(c))).toString());
					}
					else ans[i]=Long.parseLong((((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(list[y++]))).add(BigInteger.valueOf(add))).mod(BigInteger.valueOf(c))).toString());
				}
				else if(s.charAt(i)=='M')
				{
					add=Long.parseLong(((BigInteger.valueOf(add).multiply(BigInteger.valueOf(b))).mod(BigInteger.valueOf(c))).toString());
					mul=Long.parseLong(((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(b))).mod(BigInteger.valueOf(c))).toString());
					if(flag%2!=0)
					{
						ans[i]=Long.parseLong((((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(list[--x]))).add(BigInteger.valueOf(add))).mod(BigInteger.valueOf(c))).toString());
					}
					else ans[i]=Long.parseLong((((BigInteger.valueOf(mul).multiply(BigInteger.valueOf(list[y++]))).add(BigInteger.valueOf(add))).mod(BigInteger.valueOf(c))).toString());
				}
				System.out.print(ans[i]+" ");
			}
			System.out.println();
		}
	}
}