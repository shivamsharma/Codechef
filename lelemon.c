/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int partition(int *A,int p,int r)
{
	int i=p-1,j=p;
	int key=A[r];
	while(j<=(r-1))
	{
		if(A[j]<=key)
		{
			i++;
			int temp=A[j];
			A[j]=A[i];
			A[i]=temp;
			j++;
		}
		else j++;
	}
	A[r]=A[i+1];
	A[i+1]=key;
	return i+1;
}

void quick_sort(int *A,int p,int r)
{
	if(p<r)
	{
		int q=partition(A,p,r);
		quick_sort(A,p,q-1);
		quick_sort(A,q+1,r);
	}
}
int main()
{
	int tc;
	scanf("%d",&tc);
	int narr[100][100];
	while(tc--)
	{
		int n,m;
		long long int count=0;
		scanf("%d%d",&n,&m);
		int P[m],c[n];
		int i,j;
		for(i=0;i<m;i++)
		scanf("%d",&P[i]);
		for(i=0;i<n;i++)
		{
			scanf("%d",&c[i]);
			for(j=0;j<c[i];j++)
			{
				scanf("%d",&narr[i][j]);
			}
			c[i]--;
			quick_sort(narr[i],0,c[i]);
		}
		for(i=0;i<m;i++)
		{
			count+=narr[P[i]][c[P[i]]];
			if(c[P[i]]==0)
			narr[P[i]][c[P[i]]]=0;
			else c[P[i]]--;
		}
		printf("%lld\n",count);
	}
	return 0;
}