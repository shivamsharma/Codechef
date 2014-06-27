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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Main
{
	static boolean solver(long n)
	{
		if(n%6==0||n%6==1||n%6==3)
			return true;
		return false;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		long tc=Long.parseLong(br.readLine());
		if(solver(tc))
			System.out.println("yes");
		else System.out.println("no");
	}
}