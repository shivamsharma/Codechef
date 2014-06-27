/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Main
{
	static double area(int c[])
	{
		double a=(c[0]*(c[3]-c[5])+c[2]*(c[5]-c[1])+c[4]*(c[1]-c[3]))/2;
		if(a<0)
		a*=-1;
		return a;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int coord[][]=new int[n][6];
		for(int i=0;i<n;i++)
		{
			int j=0;
			for(String str:br.readLine().split(" "))
			{
				coord[i][j++]=Integer.parseInt(str);
			}
		}
		double min=area(coord[0]),max=area(coord[0]);
		int minIndex=0,maxIndex=0;
		for(int i=0;i<n;i++)
		{
			if(min>=area(coord[i]))
			{
				minIndex=i;
				min=area(coord[i]);
			}
			if(max<=area(coord[i]))
			{
				maxIndex=i;
				max=area(coord[i]);
			}
		}
		minIndex++;
		maxIndex++;
		System.out.println(minIndex+" "+maxIndex);
	}
}