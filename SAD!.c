/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int row,col;
	int i,j,k,l;
	scanf("%d%d",&row,&col);
	int a[row][col];
	int point[col];	//repeatition
	int flag=0;	//check
	//matrix
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	
	int min,max;
	for(i=0;i<row;i++)
	{
		min=a[i][0];
		for(j=0;j<col;j++)
		{
			if(min>a[i][j])
			min=a[i][j];
		}
		
		l=0;
		for(j=0;j<col;j++)
		{
			if(min==a[i][j])
			{
				point[l]=j;
				l++;
			}
		}
		l--;
		while(l>=0)
		{
			
			max=a[i][point[l]];
			for(k=0;k<row;k++)
			{
				if(max<a[k][point[l]])
				max=a[k][point[l]];
			}
			
			if(max==min)
			{
				printf("%d\n",max);
				flag=1;
				goto outer;
			}
		}
	}
	printf("GUESS\n");
	outer:
	return 0;
}