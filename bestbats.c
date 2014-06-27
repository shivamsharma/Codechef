/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int factorial(int n)
{
	int i,fact=1;
	for(i=1;i<=n;i++)
	fact*=i;
	return fact;
}
long long int ncr(int n,int r)
{
	long long int sum=1,NCr;
	int i;
	for(i=n;i>n-r;i--)
	{
		sum*=i;
	}
	NCr=sum/factorial(r);
	return NCr;
}
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
	int i,j,t,pl,pr,total;
	scanf("%d",&t);
	int bats[11];
	for(i=0;i<t;i++)
	{
		pl=pr=total=0;
		int tc;
		for(j=0;j<11;j++)
		scanf("%d",&bats[j]);
		scanf("%d",&tc);
		quick_sort(bats,0,10);
		int temp=11-tc;
		for(j=temp;j>=0;j--)
		{
			if(bats[temp]==bats[j-1])
			pl++;
			else break;
		}
		for(j=temp;j<11;j++)
		{
			if(bats[temp]==bats[j])
			pr++;
			else break;
		}
		total=pl+pr;
		long long int ans=ncr(total,pr);
		printf("%lld\n",ans);
	}
	return 0;
}
