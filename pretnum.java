/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Main{
	static int a[]={1,2,4,6,10,12,16,18,22,28,30,36};
	static int b[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997,1000};
	static int binarySearch(int[] a,int start,int end,int element)
	{
		int mid=(start+end)/2;
		if(start>end)
		{
			return -1;
		}
		if(element==a[mid])
		{
			return mid;
		}
		else
		{
			if(element<a[mid])
			{
				end=mid-1;
				return binarySearch(a,start,end,element);
			}
			else
			{
				start=mid+1;
				return binarySearch(a,start,end,element);
			}
		}
	}
	static long xpown(long x,long n)
	{
		long a;
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return x;
		}
		a=xpown(x,n/2);
		a=(a*a);
		if(n%2==1)
		{
			a=(a*x);
		}
		return a;
	}
	static int prime_calculate(int[] prime)
	{
		int i=0,j=0,flag=0;
		while(b[j]<1000)
		{
			prime[i++]=b[j++];
		}
		j=b[j-1]+1;
		while(j<=1000000)
		{
			flag=0;
			for(int k=0;k<168;k++)
			{
				if(j%b[k]==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			prime[i++]=j;
			j++;
		}
		prime[i]=100000000;
		return i;
	}
	static int prime_no(long n,int prime[],int index)
	{
		if(n==1)
		return 0;
		int temp=(int)Math.sqrt(n),flag=0;
		int i=0;
		while(prime[i]<=temp)
		{
			if(n%prime[i]==0)
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==0)
		return 1;
		return 0;
	}
	static int check(long n,int[] prime,int index)
	{
		long count=0,flag=0,b=1;
		int i=0;
		for(i=0;i<25;i++)
		{
			if(n%a[i]==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		return 0;
		flag=0;
		b=a[i];
		while(b<=n)
		{
			count++;
			if(b==n)
			{
				flag=1;
				break;
			}
			b*=a[i];
		}
		if(flag==1&&prime_no(count+1,prime,index)==1)
		return 1;
		return 0;
	}
	static int check_no(long n,int[] prime,int index)
	{
		long temp=n,count=0;
		long i=(long)Math.sqrt(temp);
		while(i*i==temp&&temp!=1)
		{
			count+=2;
			temp=i;
			i=(long)Math.sqrt(temp);
		}
		if(prime_no(temp,prime,index)==1&&prime_no(count+1,prime,index)==1&&count<=4)
		return 1; 
		return 0;
	}
		
	public static void main(String[] args)throws IOException
	{
		int prime[]=new int[1000001];
		int index=prime_calculate(prime);
		int flag[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			flag=new int[1000001];
			long count=0,x,y;
			String s=br.readLine();
			String str[]=s.split(" ");
			long l=Long.parseLong(str[0]);
			long r=Long.parseLong(str[1]);
			if(l==1)
			flag[0]=2;
			int a1=0,a2=0;
			while(true)
			{
				if(prime[a1]>r||a1>index-1)		//check cond if prime no greater than b than stop
				break;
				while(true)
				{
					long temp=xpown(prime[a1],prime[a2]-1);					//2^1 ,2^2,2^4
					if(temp>r)
					{
						a1++;
						a2=0;
						break;
					}
					if(temp<l)
					{
						a2++;
						continue;
					}
					a2++;
					flag[(int)(temp-l)]=1;						//flag =1 for 4,9,16,64
				}
			}
			a1=0;
			x=l;
			while(true)
			{
				long temp;
				if(prime[a1]>r||a1>index-1)		//check cond if prime no greater than b than stop
				break;
				temp=l%prime[a1];
				y=l-temp;
				for(long i=y;i<=r;i=i+prime[a1])
				{
					if(i<l)
					continue;
					if(i==prime[a1])
					{
						flag[(int)(i-l)]=1;
						continue;
					}
					if(flag[(int)(i-l)]==0)
					flag[(int)(i-l)]=2;
				}
				a1++;
			}
			for(int i=0;i<=r-l;i++)
			if(flag[i]==0||flag[i]==1)
			count++;
			System.out.println(count);
		}
	}
}