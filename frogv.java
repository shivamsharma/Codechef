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
class Point
{
	private int x,num;
	public Point(int x,int num)
	{
		this.x=x;
		this.num=num;
	}
	public int getX()
	{
		return x;
	}
	public int getNum()
	{
		return num;
	}
}
class PointComparator implements Comparator<Point>
{
	public int compare(Point p1,Point p2)
	{
		if(p1.getX()<p2.getX())
			return -1;
		else if(p1.getX()>p2.getX())
			return 1;
		return 0;
	}
}
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String str[]=br.readLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int k=Integer.parseInt(str[1]);
		int p=Integer.parseInt(str[2]);
		String[] s=br.readLine().split(" ");
		Point array[]=new Point[n];
		for(int i=0;i<n;i++)
		{
			array[i]=new Point(Integer.parseInt(s[i]),i+1);
		}
		Arrays.sort(array,new PointComparator());
		/*for(int i=0;i<n;i++)
		{
			System.out.println("x:"+array[i].getX()+"   num:"+array[i].getNum());
		}*/
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=1;
		map.put(array[0].getNum(),count);
		for(int i=1;i<n;i++)
		{
			//System.out.println("value:"+(array[i-1].getX()-array[i].getX()));
			if((array[i].getX()-array[i-1].getX())<=k)
			{
				map.put(array[i].getNum(),count);
			}
			else
			{
				count++;
				map.put(array[i].getNum(),count);
			}
		}
		//System.out.println(map);
		for(int i=0;i<p;i++)
		{
			str=br.readLine().split(" ");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			if(map.get(a)==map.get(b))
				System.out.println("Yes");
			else System.out.println("No");
		}
	}
}