/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,tc;
	scanf("%d",&tc);
	for(i=0;i<tc;i++)
	{
		int j,t,count=1;
		scanf("%d",&t);
		int a[t];
		for(j=0;j<t;j++)
		scanf("%d",&a[j]);
		for(j=0;j<t-1;j++)
		{
			if(a[j]>=a[j+1])
			{
				count++;
			}
			else a[j+1]=a[j];
		}
		printf("%d\n",count);
	}
	return 0;
}
				