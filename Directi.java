/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static void main(String[] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String w=br.readLine();
		int t=Integer.parseInt(w);
		for(int i=0;i<t;i++)
		{
			String s=br.readLine();
			int n=Integer.parseInt(s);
			String[] array=new String[n];
			String ans="";
			for(int j=0;j<n;j++)
			{
				array[j]=br.readLine();
			}
			for(int j=n-1;j>=0;j--)
			{
				if(j==n-1)
				{
					if(array[j].startsWith("Left"))
					ans=array[j].replaceFirst("Left","Begin");
					if(array[j].startsWith("Right"))
					ans=array[j].replaceFirst("Right", "Begin");
					System.out.println(ans);
				}
				else if(j==0)
				{
					if(array[j+1].startsWith("Left"))
					ans=array[j].replaceFirst("Begin","Right");
					if(array[j+1].startsWith("Right"))
					ans=array[j].replaceFirst("Begin", "Left");
					System.out.println(ans);
				}
				else
				{
					if(array[j+1].startsWith("Left"))
					ans=array[j].replaceFirst("Left","Right");
					if(array[j+1].startsWith("Right"))
					ans=array[j].replaceFirst("Right", "Left");
					System.out.println(ans);
				}
			}
		}
	}
}