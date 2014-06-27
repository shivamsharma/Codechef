/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int t,i,j,m,l;
	scanf("%d",&t);
	int tri,add,loop,max;
	for(i=0;i<t;i++)
	{
		add=0;
		scanf("%d",&tri);
		add=tri*(tri+1)/2;
		int array[add];
		for(j=0;j<add;j++)
		{
			scanf("%d",&array[j]);
		}
		l=add-1;
		m=tri-1;
		loop=m*(m+1)/2;
		while(loop>0)
		{
			max=array[l];
			if(array[l]<array[l-1])
			max=array[l-1];
			array[loop-1]+=max;
			l--;
			if(loop==(m*(m-1)/2)+1)
			{
				l--;
				m--;
			}
			loop--;
		}
		printf("%d\n",array[0]);
	}
	return 0;
}