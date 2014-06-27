/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,t,tc;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		scanf("%d",&tc);
		if(tc%2!=0)
		{
			printf("%d\n",(tc+1)/2);
		}
		else
		{
			if(tc==2)
			printf("2\n");
			else
			printf("%d\n",(tc/2)+1);
		}
	}
	return 0;
}