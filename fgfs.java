/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
class Box
{
	public int s,f,p;
	public Box()
	{
		this.s=this.f=this.p=0;
	}
	public Box(int s,int f,int p)
	{
		this.s=s;
		this.f=f;
		this.p=p;
	}
	public int getS()
	{
		return this.s;
	}
	public int getF()
	{
		return this.f;
	}
	public int getP()
	{
		return this.p;
	}
	public String toString()
	{
		return String.format("s:%d  f:%d  p:%d",s,f,p);
	}
}
class BoxComparator implements Comparator<Box>
{
	public int compare(Box b1,Box b2)
	{
		if(b1.getP()-b2.getP()!=0)
		return (b1.getP()-b2.getP());
		return (b1.getF()-b2.getF());
	}
}
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		Box[] box=new Box[200000];
		while(tc-->0)
		{
			String str[]=br.readLine().split(" ");
			int n=Integer.parseInt(str[0]);
			int k=Integer.parseInt(str[1]);
			if(n==0)
			{
				System.out.println("0");
				continue;
			}
			for(int i=0;i<n;i++)
			{
				String s[]=br.readLine().split(" ");
				box[i]=new Box(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
			}
			Arrays.sort(box,0,n,new BoxComparator());
			int count=1;
			int f=box[0].getF();
			int p=box[0].getP();
			for(int i=1;i<n;i++)
			{
				if(box[i].getP()!=p||box[i].getS()>=f)
				{
					count++;
					f=box[i].getF();
					p=box[i].getP();
				}
			}
			System.out.println(count);
		}
	}
} 