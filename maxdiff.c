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
	int i,t;
	scanf("%d",&t);
	int n,k;
	for(i=0;i<t;i++)
	{
		scanf("%d%d",&n,&k);
		int a[n],j;
		for(j=0;j<n;j++)
		scanf("%d",&a[j]);
		quick_sort(a,0,n-1);
		int sum1=0,sum2=0;
		if(k>n/2)
		k=n-k;
		for(j=0;j<k;j++)
		sum1+=a[j];
		for(j=k;j<n;j++)
		sum2+=a[j];
		printf("%d\n",(sum2-sum1));
	}
	return 0;
}