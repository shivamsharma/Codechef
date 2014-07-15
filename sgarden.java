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
class Input
{
	private int val;
	private boolean flag=false;
	public Input(int val)
	{
		this.val=val;
	}
	public int getVal()
	{
		return val;
	}
	public boolean getFlag()
	{
		return flag;
	}
	public void setFlag(boolean flag)
	{
		this.flag=flag;
		return;
	}
}
class Main
{
	static BigInteger gcd(BigInteger a,BigInteger b)
	{
		if(b==BigInteger.ZERO)
		return a;
		else return gcd(b,a.mod(b));
	}
	static BigInteger lcm(BigInteger a,BigInteger b)
	{
		return (a.multiply(b)).divide(gcd(a,b));
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		final int mod=1000000007;
		int tc=Integer.parseInt(br.readLine());
		Input[] array=new Input[100010];
		while(tc-->0)
		{
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			Map<Long,Boolean> circles=new HashMap<Long,Boolean>();
			BigInteger count=BigInteger.ONE;
			int n=Integer.parseInt(br.readLine());
			String s[]=br.readLine().split(" ");
			int i=1;
			int index=0;
			for(String str:s)
			{
				array[i]=new Input(Integer.parseInt(str));
				map.put(i,array[i].getVal());
				i++;
			}
			//System.out.println("i:"+i);
			for(i=1;i<=n;i++)
			{
				if(array[i].getFlag()==true)
					continue;
				long temp=0;
				int val=array[i].getVal();
				int tag=val;
				array[i].setFlag(true);
				while(true)
				{
					temp++;
					//System.out.println("tag:"+tag);
					tag=map.get(tag);
					array[tag].setFlag(true);
					if(tag==val)
						break;
				}
				//System.out.println("--------------"+temp);
				if(!circles.containsKey(temp))
				{
					count=lcm(count,new BigInteger(""+temp));
					circles.put(temp,true);
				}
			}
			System.out.println(count.mod(new BigInteger(""+mod)));
		}
	}
}