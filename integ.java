/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
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
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		int a[]=new int[n];
		int b[]=new int[n];
		int i=0,neg=0,none=-1;
		long count=0,temp=0,j=0; 
		for(String str:s.split(" "))
		{
			a[i]=Integer.parseInt(str);
			if(a[i]<0)
			{
				b[neg]=a[i];
				neg++;
			}
			i++;
		}
		//System.out.println("neg="+neg);
		Arrays.sort(b,0,neg);
	/*	for(i=0;i<neg;i++)
		System.out.print("b["+i+"]="+b[i]+" ");
		System.out.println();*/
		long k=Integer.parseInt(br.readLine());
		while(neg>k)
		{
			neg--;
			count+=(none*(b[neg]+temp))*k;
			temp=none*b[neg];
		}
		for(i=0;i<neg;i++)
		j+=none*(b[i]+temp);
		count+=j;
		System.out.println(count);
	}
}