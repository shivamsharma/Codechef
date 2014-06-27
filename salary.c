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

void add(int *A,int num,int r)
{
	int i;
	for(i=0;i<r;i++)
	{
		A[i]+=num;
	}
}
int algo(int *A,int p,int r,int count)
{
	int i,j;
	int temp;
	while(1)
	{
		quick_sort(A,p,r);
		if(A[0]==A[r])
		return count;
		else
		{
			temp=A[r]-A[0];
			count+=temp;
			add(A,temp,r);
		}
	}
}
			
int main()
{
	int i,j,t;
	scanf("%d",&t);
	int n;
	for(i=0;i<t;i++)
	{
		int count=0;
		scanf("%d",&n);
		int a[n];
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[j]);
		}
		printf("%d\n",algo(a,0,n-1,count));
	}
	return 0;
}