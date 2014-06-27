/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define ll unsigned long long
#define mod 1000000007
ll power(ll a,ll b)
{
	ll r;
	if(b==0) return 1;
	r=power(a,b/2);
	r=(r*r)%mod;
	if(b%2==1)
	r=(r*a)%mod;
	return r;
}
int main()
{
	int i,t;
	ll tc;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%lld",&tc);
		if(tc%2==0)
		tc=3+power(3,tc)%mod;				//a(n)=3*(-1)^n+(3)^n
		else
		tc=-3+power(3,tc)%mod;
		printf("%lld\n",tc);
	}
	return 0;
}