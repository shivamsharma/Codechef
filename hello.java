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
			float d,r[],cost;
			int u,n,m[],c[],index=0;
			s=br.readLine();
			String str[]=s.split(" ");
			d=Float.parseFloat(str[0]);
			u=Integer.parseInt(str[1]);
			n=Integer.parseInt(str[2]);
			cost=d*u;
			//System.out.println("cost:"+cost);
			r=new float[n];
			m=new int[n];
			c=new int[n];
			for(int i=0;i<n;i++)
			{
				s=br.readLine();
				String kali[]=s.split(" ");
				m[i]=Integer.parseInt(kali[0]);
				r[i]=Float.parseFloat(kali[1]);
				c[i]=Integer.parseInt(kali[2]);
				float flag=(float)c[i]/m[i]+r[i]*u;
				if(cost>flag)
				{
					cost=flag;
				//	System.out.println("cost new:"+cost);
					index=i+1;
				}
			}
			System.out.println(index);
		}
	}
}