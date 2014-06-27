/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define mod 1000000007
int partition(long long int *A,int p,int r)
{
	int i=p-1,j=p;
	unsigned long long int key=A[r];
	while(j<=(r-1))
	{
		if(A[j]<=key)
		{
			i++;
			unsigned long long int temp=A[j];
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

void quick_sort(unsigned long long int *A,int p,int r)
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
	int i,j,t;
	unsigned long long int a[3],sum;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		sum=0;
		for(j=0;j<3;j++)
		scanf("%lld",&a[j]);
		quick_sort(a,0,2);
		a[1]=a[1]-1;
		a[2]=a[2]-2;
		sum=((((a[0]%mod)*(a[1]%mod))%mod)*(a[2]%mod))%mod;
		printf("%lld\n",sum);	
	}
	return 0;
}