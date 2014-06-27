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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			int n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			String s=br.readLine();
			int i=0;
			for(String str:s.split(" "))
			{
				a[i++]=Integer.parseInt(str);
			}
			int k=Integer.parseInt(br.readLine());
			int temp=a[k-1];
			Arrays.sort(a,0,n);
			System.out.println(Arrays.binarySearch(a,0,n,temp)+1);
		}
	}
}
			