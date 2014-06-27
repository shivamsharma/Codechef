/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define mod 1000000007
#define ull unsigned long long int
int print_binary(int n,int *p)
{
	int i,l,len=0,temp=n;
	while(temp/2>0)
	{
		len++;
		temp/=2;
	}
	len++;
	l=len;
	while(len>0)
	{
		p[len-1]=n%2;
		n/=2;
		len--;
	}
	return l;
}
ull binary_no(int n)
{
	int p[26],j,len;
	ull bi=0;
	len=print_binary(n,p);
	for(j=0;j<len;j++)
	{
		bi+=(ull)p[j]*(ull)pow(10,len-j-1);
	}
	return bi;
}

ull xpown(ull x,ull n)
{
	ull a;
	if(n==0)
	{
		return 1;
	}
	if(n==1)
	{
		return x;
	}
	a=xpown(x,n/2);
	a=(a*a)%mod;
	if(n%2==1)
	{
		a=(a*x)%mod;
	}
	return a;
}
int main()
{
	int tc;
	scanf("%d",&tc);
	while(tc--)
	{
		int n;
		scanf("%d",&n);
		ull temp=(xpown(2,binary_no(n))%mod*xpown(2,binary_no(n))%mod)%mod;
		printf("%llu\n",temp);
	}
	return 0;
}