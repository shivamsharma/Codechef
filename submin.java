/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class Main
{
	private static long m[]=new long[1000010];
	private static long abs(long a,long b)
	{
		if(a>b)
		return (a-b);
		return (b-a);
	}
	private static void solver(int a[],int n)
	{
		List<List> set=new ArrayList<List>();
		List<Integer> list;
		int min=0;
		for(int k=n-1;k>=0;k--){
		for(int i=0;i<n;i++)
		{
			list=new ArrayList<Integer>();
			min=a[i];
			for(int j=i;j<=k;j++)
			{
				if(a[j]<min)
				min=a[j];
				list.add(a[j]);
			}
			list.add(min);
		//	System.out.println("List:"+list);
			if(list.size()>1)
			set.add(list);
		}}
		//System.out.println("Set:"+set+" ----Size:"+set.size());
		Iterator<List> iterator=set.iterator();
		List<Integer> subarray;
		while(iterator.hasNext())
		{
			subarray=iterator.next();
			//System.out.println(subarray.get(subarray.size()-1));
			m[subarray.get(subarray.size()-1)]++;
		}
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		String s=br.readLine();
		int i=0;
		for(String t:s.split(" "))
		a[i++]=Integer.parseInt(t);
		solver(a,n);
		//for(int j=0;j<20;j++)
		//System.out.println("m["+j+"]:"+m[j]);
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			//String s[]=br.readLine().split(" ");
			/*int i=0;
			 * for(String str:s)
			 *array[i++]=Integer.parseInt(str);*/
			 int k=Integer.parseInt(br.readLine());
			 System.out.println(m[k]);
		}
	}
}