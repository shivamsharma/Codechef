/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.math.BigInteger;
class Main
{
	static BigInteger xpown(BigInteger x,BigInteger n)
	{
		BigInteger a;
		if(n.equals(new BigInteger("0")))
		{
			return new BigInteger("1");
		}
		if(n.equals(new BigInteger("1")))
		{
			return x;
		}
		a=xpown(x,n.divide(new BigInteger("2")));
		a=(a.multiply(a)).mod(new BigInteger("1000000007"));
		if(n.mod(new BigInteger("2")).equals(new BigInteger("1")))
		{
			a=(a.multiply(x)).mod(new BigInteger("1000000007"));
		}
		return a;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		BigInteger bi;
		while(tc-->0)
		{
			int n=Integer.parseInt(br.readLine());
			bi=new BigInteger(Integer.toBinaryString(n));
			bi=bi.multiply(new BigInteger("2"));
			System.out.println(xpown(new BigInteger("2"),bi).toString());
		}
	}
}