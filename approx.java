/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static void main(String ...arg)throws IOException
	{
		int i,t;
		BufferReader br=new BufferReader(new InputStreamReader(System.in));
		String s=br.readLine();
		t=Integer.parseInt(s);
		String str="415926530119026040722614947737296840070086409613316415926531190260407226149477372968400786399613316415926530119026047226149477372968400700863996133164159265301190260407226149477372968400700863996133164159265301190260407226149477372968470086399613316415926530119026040722614947737296840070086409613316415926531190260407226149477372968400786399613316415926530119026047226149477372968400700863996133164159265301190260407226149477372968400700863996133164159265301190260407226149477372968470086399613316415926530119026040722614947737296840070086409613316415926531190260407226149477372968400786399613316415926530119026047226149477372968400700863996133164159265301190260407226149477372968400700863996133164159265301190260407226149477372968470086399613316";
		for(i=0;i<t;i++)
		{
			int n;
			s=br.readLine();
			n=Integer.parseInt();
			if(n==0)
			System.out.print("3");
			else if(n==1)
			System.out.print("3.1");
			else if(n>1)
			{
				System.out.print("3.1");
				if(n<=748)
				{
					System.out.print(str.substring(0,n-1));
				}
				else
				{
					int div=n/748;
					int rem=n%748;
					for(int k=0;k<div;k++)
					{
						System.out.print(str.substring(0,747));
					}
					System.out.print(str.substring(0,rem));
				}
					
			}
			
			System.out.println();
		}
	}
}