/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.util.Scanner;
class A112
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		int n,i,j,k,length,rev=0;
		String s=System.console().readLine("");
		n=Integer.parseInt(s);
		int array[][]=new int[2][n];
		int add[]=new int[n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<2;j++)
			{
				array[j][i]=sc.nextInt();
			}
		}
		int temp,power;
		for(i=0;i<n;i++)
		{
			add[i]=array[0][i]+array[1][i];
			length = String.valueOf(add[i]).length();
			//System.out.println(length);
			//temp=length;
			while(length>0)
			{
				k=+add[i]%10;
				//System.out.println(k);
				rev+=k*Math.pow(10,length-1);
				length--;
				add[i]=add[i]/10;
			} //System.out.println(rev);
			add[i]=0;
			temp= String.valueOf(rev).length();
			//System.out.println(temp);
			power=0;
			while(temp>0&&power<=temp+1000000)
			{
				k=rev%10;
				//System.out.println(k);
				if(k!=0)
				{ 
					add[i]+=k*Math.pow(10,power);
					power++;
				}
				temp--;
				rev/=10;
			}
			System.out.println(add[i]);
		}
	}
}