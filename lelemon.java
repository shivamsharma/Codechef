/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Main
{
	public static void main(String[] args)throws IOException
	{
		int tc;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		tc=Integer.parseInt(s);
		int narr[][]=new int[105][105];
		int P[]=new int[105];
		int c[]=new int[105];
		while(tc-->0)
		{
			int n,m;
			long count=0;
			s=br.readLine();
			String mn[]=s.split(" ");
			n=Integer.parseInt(mn[0]);
			m=Integer.parseInt(mn[1]);
			s=br.readLine();
			int i=0;
			for(String str:s.split(" "))
			{
				P[i]=Integer.parseInt(str);
				i++;
			}
			for(i=0;i<n;i++)
			{
				int j=0;
				s=br.readLine();
				boolean flag=false;
				for(String str:s.split(" "))
				{
					if(flag==false)
					{
						c[i]=Integer.parseInt(str);
						flag=true;
					}
					else
					{
						narr[i][j]=Integer.parseInt(str);
						j++;
					}
				}
				Arrays.sort(narr[i],0,c[i]);
				c[i]--;
			}
			for(i=0;i<m;i++)
			{
				count+=narr[P[i]][c[P[i]]];
				if(c[P[i]]==0)
				narr[P[i]][c[P[i]]]=0;
				else
				c[P[i]]--;
			}
			System.out.println(count);
		}
	}
}