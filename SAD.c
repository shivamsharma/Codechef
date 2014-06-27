/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
	int r,c;
	scanf("%d%d",&r,&c);
	int i,j,k,l,m,n,min,max;
	int a[r][c],point[c],flag=0;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	for(i=0;i<r;i++)
	{
		min=a[i][0];
		for(j=0;j<c;j++)
		{
			if(min>a[i][j])
			{
				min=a[i][j];
			}
		}
		
		l=0;
		for(m=0;m<c;m++)
		if(min==a[i][m])
		point[l++]=m;
		
		while(--l>=0)
		{
			max=a[i][point[l]];
			for(k=0;k<r;k++)
			{
				if(max<a[k][point[l]])
				{
					max=a[k][point[l]];
				}
			}
			if(min==max)
			{
				printf("%d\n",min);
				flag=1;
				goto outer;
			}
		}
	}
	if(flag==0)
	printf("GUESS\n");
	outer:
	getch();
	return 0;
}