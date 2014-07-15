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
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			String s[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int m=Integer.parseInt(s[1]);
			int k=Integer.parseInt(s[2]);
			char[] genome1={'A','T','C','G'};
			char[] genome2={'A','T','C','G'};
			int a=0,b=1;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(j==m-1)
					System.out.print("A");
					else System.out.print("T");
				}
				System.out.println();
			}
		}
	}
}  