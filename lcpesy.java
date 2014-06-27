/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(br.readLine());
		String s="",t="";
		while(tc-->0)
		{
			int a[]=new int[62];
			int b[]=new int[62];
			int count=0;
			s=br.readLine();
			t=br.readLine();
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>=48&&ch<=57)
				{
					a[ch-'0'+52]++;
				}
				else
				{
					if(Character.isUpperCase(ch))
					a[ch-'A'+26]++;
					else a[ch-'a']++;
				}
			}
			for(int i=0;i<t.length();i++)
			{
				char ch=t.charAt(i);
				if(ch>=48&&ch<=57)
				{
					b[ch-'0'+52]++;
				}
				else
				{
					if(Character.isUpperCase(ch))
					b[ch-'A'+26]++;
					else b[ch-'a']++;
				}
			}
			for(int i=0;i<62;i++)
			{
				a[i]=a[i]<b[i]?a[i]:b[i];
				count+=a[i];
			}
			System.out.println(count);
			//String s[]=br.readLine().split(" ");
			/*int i=0;
			 * for(String str:s)
			 * array[i++]=Integer.parseInt(str);*/
		}
	}
}