/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigDecimal;
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
		InputStream in=System.in;
		BufferedInputStream bis=new BufferedInputStream(in);
		String stt=new String(bis.read());
		System.out.println(stt);
		int tc=Integer.parseInt(br.readLine());
		String str="";
		char ch[]=new char[1000100];
		Map<Character,Character> map;
		while(tc-->0)
		{
			map=new HashMap<Character,Character>();
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++)
			{
				String s=br.readLine();
				char c=s.charAt(0);
				char p=s.charAt(2);
				map.put(c,p);
			}
			str=br.readLine();
			int len=str.length();
			int dot=0,tag=0,tap=0;
			int j=-1,k=str.length();
			for(int i=0;i<len;i++)
			{
				ch[i]=str.charAt(i);
				if(map.get(ch[i])!=null)
				{
					ch[i]=map.get(ch[i]);
				}
				if(ch[i]=='.')
				dot=1;
			}
			for(int i=0;i<len;i++)
			{
				if(ch[i]=='0')
				j++;
				else break;
			}
			if(dot==1)
			{
				for(int i=len-1;i>=0;i--)
				{
					if(ch[i]=='0')
					k--;
					else break;
				}
			}
			if(dot==1&&k!=0&&ch[k-1]=='.')
			k--;
			if(j+1!=k)
			{
				for(int i=j+1;i<k;i++)
				System.out.print(ch[i]);
			}
			else System.out.print("0");
			System.out.println();
		}
	}
}