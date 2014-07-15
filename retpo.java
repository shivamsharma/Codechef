/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedInputStream;
import java.io.InputStream;
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
import java.util.Map;
import java.util.HashMap;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			String s[]=br.readLine().split(" ");
			long x=Long.parseLong(s[0]);
			long y=Long.parseLong(s[1]);
			//System.out.println(x+"   "+y);
			if(x<0)
				x*=-1;
			if(y<0)
				y*=-1;
			long ans=x*2;
			String xType="odd";
			String yType="odd";
			if(x%2==0)
				xType="even";
			if(y%2==0)
				yType="even";
			if(y<x&&!xType.equals(yType))
			ans++;
			if(y>x)
			{
				long t=y-x;
				ans+=(t*3)/2+t/2;
			}
			System.out.println(ans);
		}
	}
}