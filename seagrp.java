/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Main
{
	static int sum(int[] a,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	static boolean solver(int[][] graph,int n,int[] covered,int step)
	{
		if(step==0)
		return true;
		int i=0,j=0;
		while(i<n)
		{
			int temp=1,flag=0;
			if(covered[i]==0){
			while(j<n)
			{
				if(covered[j]==0&&graph[i][j]==1){
				temp=graph[i][i];
				covered[i]=temp;
				if(covered[i]==0)
				temp++;
				covered[i]=1;
				//temp++;
				covered[j]=1;
				if(solver(graph,n,covered,step-2))
				return true;
				else
				{
					covered[i]=0;
					covered[j]=0;
				}}
				j++;
			}if(j==n) return false;
			}i++;
		}
		return 1==0;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		int graph[][];
		int sum[]=new int[110];
		while(tc-->0)
		{
			String str[]=br.readLine().split(" ");
			int n=Integer.parseInt(str[0]);
			int m=Integer.parseInt(str[1]);
			graph=new int[n][n];
			int covered[]=new int[n];
			for(int i=0;i<m;i++)
			{
				str=br.readLine().split(" ");
				int x=Integer.parseInt(str[0]);
				int y=Integer.parseInt(str[1]);
				graph[x-1][y-1]=1;
				graph[y-1][x-1]=1;
			}
		/*	System.out.println("Graph:");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				System.out.print(graph[i][j]+" ");
				System.out.println();
			}*/
			int flag=0,i=0;
			for(i=0;i<n;i++)
			{
				sum[i]=sum(graph[i],n);
				if(sum[i]==0)
				{
					flag=1;
					break;
				}
			}
			i=0;
			while(i<n&&flag==0)
			{
				if(sum[i]==0)
				{
					flag=1;
					break;
				}
				else if(sum[i]>1)
				{
					for(int j=0;j<n;j++)
					{
						if(graph[i][j]==1&&sum[j]>1&&sum[i]>1)
						{
							sum[i]--;
							sum[j]--;
						}
					}
				}
				i++;
				break;
			}
			int step=n;
			if(solver(graph,n,covered,step))
			flag=0;
			else flag=1;
			for(i=0;i<n;i++)
			{
				if(sum[i]==1)
				{
					break;
				}
			}
			if(flag==1)
			System.out.println("NO");
			else System.out.println("YES");
		}
	}
}