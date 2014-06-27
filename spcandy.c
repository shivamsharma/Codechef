/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define  ll long long
int main()
{
	int testc;
	scanf("%d",&testc);
	while(testc--)
	{
		ll int ne,ki;
		scanf("%lld%lld",&ne,&ki);
		if(ki!=0)
		printf("%lld %lld\n",ne/ki,ne%ki);
		else printf("0 %lld\n",ne);
	}
	return 0;
}