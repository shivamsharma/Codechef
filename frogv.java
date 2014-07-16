/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Arrays;
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
		Scan scan=new Scan();
		Print print=new Print();
		int n=scan.scanInt();
		int k=scan.scanInt();
		int p=scan.scanInt();
		Point array[]=new Point[n];
		for(int i=0;i<n;i++)
		{
			array[i]=new Point(scan.scanInt(),i+1);
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
			int a=scan.scanInt();
			int b=scan.scanInt();
			if(map.get(a)==map.get(b))
				print.printLine("Yes");
			else print.printLine("No");
		}
		print.close();
	}
}
class Scan
{
	private byte[] buf=new byte[1024];
	private int index;
	private InputStream in;
	private int total;
	public Scan()
	{
		in=System.in;
	}
	public int scan()throws IOException
	{
		if(total<0)
		throw new InputMismatchException();
		if(index>=total)
		{
			index=0;
			total=in.read(buf);
			if(total<=0)
			return -1;
		}
		return buf[index++];
	}
	public int scanInt()throws IOException
	{
		int integer=0;
		int n=scan();
		while(isWhiteSpace(n))
		n=scan();
		int neg=1;
		if(n=='-')
		{
			neg=-1;
			n=scan();
		}
		while(!isWhiteSpace(n))
		{
			if(n>='0'&&n<='9')
			{
				integer*=10;
				integer+=n-'0';
				n=scan();
			}
			else throw new InputMismatchException();
		}
		return neg*integer;
	}
	public double scanDouble()throws IOException
	{
		double doub=0;
		int n=scan();
		while(isWhiteSpace(n))
		n=scan();
		int neg=1;
		if(n=='-')
		{
			neg=-1;
			n=scan();
		}
		while(!isWhiteSpace(n)&&n!='.')
		{
			if(n>='0'&&n<='9')
			{
				doub*=10;
				doub+=n-'0';
				n=scan();
			}
			else throw new InputMismatchException();
		}
		if(n=='.')
		{
			n=scan();
			double temp=1;
			while(!isWhiteSpace(n))
			{
				if(n>='0'&&n<='9')
				{
					temp/=10;
					doub+=(n-'0')*temp;
					n=scan();
				}
				else throw new InputMismatchException();
			}
		}
		return doub*neg;
	}
	public String scanString()throws IOException
	{
		StringBuilder sb=new StringBuilder();
		int n=scan();
		while(isWhiteSpace(n))
		n=scan();
		while(!isWhiteSpace(n))
		{
			sb.append((char)n);
			n=scan();
		}
		return sb.toString();
	}
	private boolean isWhiteSpace(int n)
	{
		if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
		return true;
		return false;
	}
}

class Print
{
	private final BufferedWriter bw;
	public Print()
	{
		bw=new BufferedWriter(new OutputStreamWriter(System.out));
	}
	public void print(String str)throws IOException
	{
		bw.append(str);
	}
	public void printLine(String str)throws IOException
	{
		print(str);
		bw.append("\n");
	}
	public void close()throws IOException
	{
		bw.close();
	}
}