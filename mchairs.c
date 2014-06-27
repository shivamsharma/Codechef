/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define mod 1000000007
long long int xpown(long long int x,long long int n)
{
	long long int a;
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
		long long int n;
		scanf("%lld",&n);
		printf("%lld\n",xpown(2,n)-1);
	}
	return 0;
}