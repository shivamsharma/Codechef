/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
class Main
{
	public static void main(String arg[])
	{
		String s=System.console().readLine("");
		int t=Integer.parseInt(s);
		int i;
		for(i=0;i<t;i++)
		{
			String st=System.console().readLine("");
			int tc=Integer.parseInt(st);
			int flag=0;
			int itr=0;
			while(flag!=1)
			{
				itr++;
				String str=""+tc;
				StringBuffer sb=new StringBuffer(str);
				String s1=new String(sb.reverse());
				int tc1=Integer.parseInt(s1);
				tc=tc+tc1;
				String temp=""+tc;
				sb=new StringBuffer(temp);
				String s2=new String(sb.reverse());
				tc1=Integer.parseInt(s2);
				if(tc==tc1)
				flag=1;
			}
			System.out.println(itr+" "+tc);
		}
	}
}
			