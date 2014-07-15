/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			long count=0;
			int n=Integer.parseInt(br.readLine());
			String str=br.readLine();
			for(int i=0;i<n;i++)
			{
				char ch=str.charAt(i);
				if(ch=='1')
					count++;
			}
			long ans=count*(count+1)/2;
			System.out.println(ans);
		}
	}
}