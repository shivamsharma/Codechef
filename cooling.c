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

int conquer(int *a,int *b,int n)
{
	int i,count=0,j;
	for(i=0;i<n;i++)
	{
		if(a[j]<=b[i])
		{
			count++;
			j++;
		}
	}
	return count;
}

int main()
{
	int i,j,tc;
	scanf("%d",&tc);
	for(i=0;i<tc;i++)
	{
		int n;
		scanf("%d",&n);
		int wtp[n];
		for(j=0;j<n;j++)
		scanf("%d",&wtp[j]);
		int wtr[n];
		for(j=0;j<n;j++)
		scanf("%d",&wtr[j]);
		//sorting each array of weight
		quick_sort(wtp,0,n-1);
		quick_sort(wtr,0,n-1);
		printf("%d\n",conquer(wtp,wtr,n));
	}
	return 0;
}