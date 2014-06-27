/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
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
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(br.readLine());
		String str=br.readLine();
		int array[]=new int[n];
		int i=0;
		for(String s:str.split(" "))
		array[i++]=Integer.parseInt(s);
		int sum=0,temp=0;
		for(i=0;i<n;i++)
		{
			if(array[i]==0)
			temp=0;
			else temp++;
			if(sum<temp)
			sum=temp;
		}
		System.out.println(sum);
	}
}