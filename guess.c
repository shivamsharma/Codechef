/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define lli unsigned long long int
lli gcd(lli n,lli m)
{
	if(m==0)
	return n;
	else
	return gcd(m,n%m);
}
int main()
{
	int tc;
	scanf("%d",&tc);
	while(tc--)
	{
		lli n,m;
		scanf("%lld%lld",&n,&m);
		lli nodd,neven,modd,meven;
		neven=n/2;
		nodd=n-neven;
		meven=m/2;
		modd=m-meven;
		lli sum=neven*modd+meven*nodd;
		lli total=m*n;
		lli divisor=gcd(total,sum);
		sum/=divisor;
		total/=divisor;
		printf("%lld/%lld\n",sum,total);
	}
	return 0;
}