/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.util.Scanner;
class CAKEDOM
{
	static int i,j,k,l=0;
	static int len,temp,pos,flag;
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		String s1,s2;
		char a[]=new char[101];
		int check[]=new int[tc];
		char ch;
		for(i=0;i<tc;i++)
		{
			s1=System.console().readLine("");
			temp=Integer.parseInt(s1);
			s2=System.console().readLine("");
			StringBuffer sb=new StringBuffer(s2);
			a=s2.toCharArray();
			len=s2.length();
			flag=0;
			for(j=0;j<len;j++)
			{
				if(a[0]==a[len-1]&&len>1&&a[0]!='?')
				{
					check[l]=11;
					l++;
					break;
				}
				if(len==1)
				{
					check[l]=12;
					l++;
					break;
				}
				if(a[j]=='?')
				{
					pos=j;
					for(k=0;k<temp;k++)
					{
						if(pos==0&&a[pos+1]!=(char)k&&len>=1)
						{
							check[l]=13;
							l++;
							a[pos]=(char)k;
							break;
						}
						else if(pos==(len-1)&&a[pos-1]!=(char)k)
						{
							check[l]=13;
							l++;
							a[pos]=(char)k;
							break;
						}
						else if(a[pos-1]!=(char)k&&a[pos+1]!=(char)k)
						{
							check[l]=13; [
							l++;
							a[pos]=(char)k;
							break;
						}
					}
				}
			}
			
		}
		for(i=0;i<tc;i++)
		{ if(check[i]==11)
		System.out.println("NO");
		else if(check[i]==12)
		System.out.println("0");
		else for(j=0;j<len;j++)
		System.out.print(""+a[j]+"\n"); }
		
	}
}