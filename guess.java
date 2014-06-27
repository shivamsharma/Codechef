/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
class Main
{
	static long gcd(long a,long b)
	{
		if(b==0)
		return a;
		else return gcd(b,a%b);
		//return gcd(b,a%b);
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			String s[]=br.readLine().split(" ");
			long n=Integer.parseInt(s[0]);
			long m=Integer.parseInt(s[1]);
			long ne=n/2;
			long no=n-n/2;
			long me=m/2;
			long mo=m-m/2;
			long a,b;
			a=n*m;
			b=mo*ne+no*me;
			long c=gcd(a,b);
			a/=c;
			b/=c;
			System.out.println(b+"/"+a);
			/*int i=0;
			 * for(String str:s)
			 * array[i++]=Integer.parseInt(str);*/
		}
	}
}