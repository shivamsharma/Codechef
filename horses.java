/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Main
{
	public static void main(String arg[])
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int diff,temp;
		for(int i=0;i<tc;i++)
		{
			int tcs=sc.nextInt();
			int array[]=new int[tcs];
			for(int j=0;j<tcs;j++)
			{
				array[j]=sc.nextInt();
			}
			if((array[0]-array[1])>=0)
			diff=array[0]-array[1];
			else
			diff=array[1]-array[0];
			for(int j=0;j<tcs;j++)
			{
				for(int k=j+1;k<tcs;k++)
				{
					if((array[j]-array[k])>=0)
					temp=array[j]-array[k];
					else
					temp=array[k]-array[j];
					if(diff>temp)
					diff=temp;
				}
			}
			System.out.println(diff);
		}
	}
}