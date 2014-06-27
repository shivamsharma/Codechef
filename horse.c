/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,j,k,tc,tcs,diff,temp;
	scanf("%d",&tc);
	for(i=0;i<tc;i++)
	{
		scanf("%d",&tcs);
		int array[tcs];
		for(j=0;j<tcs;j++)
		{
			scanf("%d",&array[j]);
		}
		if((array[0]-array[1])>=0)
		diff=array[0]-array[1];
		else
		diff=array[1]-array[0];
		for(j=0;j<tcs;j++)
		{
			for(k=j+1;k<tcs;k++)
			{
				if((array[j]-array[k])>=0)
				temp=array[j]-array[k];
				else
				temp=array[k]-array[j];
				if(diff>temp)
				diff=temp;
			}
		}
		printf("%d\n",diff);
	}
	return 0;
}