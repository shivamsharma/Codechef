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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		tc=Integer.parseInt(s);
		while(tc-->0)
		{
			s=br.readLine();
			int count=0,temp=0,hello=0;
			for(int i=0;i<s.length();)
			{
				count=0;
				while(s.charAt(i)=='.'&&i<s.length())
				{
					count++;
					i++;
				}
				if(count>temp)
				{
					hello++;
					temp=count;
				}
				i++;
			}
			System.out.println(hello);
		}
	}
}