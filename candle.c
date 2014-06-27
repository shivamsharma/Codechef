/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <math.h>
void min(int *A,int *p)
{
	int i,min,index;
	p[2]=0;
	min=A[0];
	index=0;
	for(i=1;i<10;i++)
	{
		if(min>A[i])
		{
			min=A[i];
			index=i;
		}
	}
	p[0]=min;
	p[1]=index;
	if(min==A[0])
        {
                for(i=1;i<10;i++)
                if(min==A[i])
                {
                        p[1]=i;
                        break;
                }
        }

	if(p[1]==0&&min!=A[1])
	p[2]=11;
}
int main()
{
	int i,j,t,p[3],ans;
	scanf("%d",&t);
	int array[10];
	for(i=0;i<t;i++)
	{
		ans=0;	
		for(j=0;j<10;j++)
		scanf("%d",&array[j]);
		min(array,p);
		if(p[2]==11)
		{
			ans=pow(10,p[0]+1);
			printf("%d\n",ans);
		}
		else
		if(p[1]!=0)
		{
			for(j=0;j<=p[0];j++)
			ans+=p[1]*pow(10,j);
			printf("%d\n",ans);
		}
		else
		{	
			for(j=0;j<=p[0];j++)
			ans+=pow(10,j);
			printf("%d\n",ans);
		}
	}
	return 0;
}