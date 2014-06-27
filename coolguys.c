/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define ull unsigned long long
ull int gcd(ull int a,ull int b)
{
	if(b==0)
	return a;
	else return gcd(b,a%b);
	return gcd(b,a%b);
}

int main()
{
	int tc,i;
	scanf("%d",&tc);
	while(tc--)
	{
		ull int n,val,nxt;
		ull int count=0,temp,temp1;
		scanf("%lld",&n);
		for(i=1;i<=n;)
		{
			val=n/i;
			nxt=n/val+1;
			count+=(nxt-i)*val;
			i=nxt;
		}
		temp=n*n;
		temp1=gcd(temp,count);
		count=count/temp1;
		temp=temp/temp1;			
		printf("%lld/%lld\n",count,temp);
	}
	return 0;
}