/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int gcd(int a,int b)
{
	if(b==0)
	return a;
	else return gcd(b,a%b);
	return gcd(b,a%b);
}
int main()
{
	int i,t,n,g;
	scanf("%d",&t);
	while(t--)
	{
		scanf("%d",&n);
		int a[n];
		for(i=0;i<n;i++)
		{
			scanf("%d",&a[i]);
			if(i==0)
			g=a[i];
			g=gcd(g,a[i]);
		}
		printf("%d\n",g);
	}
	return 0;
}