/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int tc,i;
	scanf("%d",&tc);
	while(tc--)
	{
		double n;
		scanf("%lf",&n);
		if(n>=0.5)
		{
			n=(1-n)*2*n*10000+n*10000;
		}
		else n=n*2*(10000-n*10000)+(10000-n*10000);
		printf("%lf\n",n);
	}
	return 0;
}
