/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static void main(String[] args)throws IOException
	{
		int tc;
		String s1,s2;
		int a[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		tc=Integer.parseInt(s);
		while(tc-->0)
		{
			s=br.readLine();
			int len=s.length();
			char ch;
			a=new int[26];
			int flag=0;
			if(len%2==0)
			{
				for(int i=0;i<len/2;i++)
				{
					ch=s.charAt(i);
					a[ch-'a']++;
					ch=s.charAt(i+len/2);
					a[ch-'a']--;
				}
				for(int i=0;i<26;i++)
				{
					if(a[i]!=0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				System.out.println("YES");
				else System.out.println("NO");
			}
			else
			{
				for(int i=0;i<len/2;i++)
				{
					ch=s.charAt(i);
					a[ch-'a']++;
					ch=s.charAt(i+len/2+1);
					a[ch-'a']--;
				}
				for(int i=0;i<26;i++)
				{
					if(a[i]!=0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
}