/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.util.Scanner;
class Main
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=A-B;
		int last=C%10;
		if(last==9)
		System.out.println(C-1);
		else System.out.println(C+1);
	}
}